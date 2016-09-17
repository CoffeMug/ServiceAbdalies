package resources;

import api.AbdaliesBotApi;
import api.giphy.GiphyApi;
import api.Message;
import api.Update;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.PersianCalendar;
import com.ibm.icu.util.ULocale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by majid on 30/08/16.
 */
@Path("/getUpdates")
@Consumes(MediaType.APPLICATION_JSON)
public class UpdateResource {

    private static final String BOT_COMMAND_ENTITY_TYPE = "bot_command";
    AbdaliesBotApi abdaliesBotApi = new AbdaliesBotApi();

    @POST
    public void getUpdate(Update update) {
        String messageEntityType;
        Logger log = LoggerFactory.getLogger("mylogger");
        log.error(update.toString());

        Message updateMessage = update.getMessage();
        int chatID = update.getMessage().getChat().getId();

        if (update.getMessage().getEntities().size() > 0) {
            messageEntityType = update.getMessage().getEntities().get(0).getType();
        } else {
            messageEntityType = "empty";
        }

        if (messageEntityType.equals(BOT_COMMAND_ENTITY_TYPE)) {

                processBotCommand(updateMessage.getText(), chatID);
        }
    }

    private void processBotCommand(String updateMessageText, int chatID) {
        if (updateMessageText.contains("/giphy")) {
            String giphyQuery = updateMessageText.substring(6);
            if (giphyQuery != null && giphyQuery.trim().length() > 0 ) {
                GiphyApi giphyApi = new GiphyApi();
                abdaliesBotApi.sendMessage(giphyApi.search(giphyQuery), chatID);
            }
        } else if (updateMessageText.contains("/today")) {
            abdaliesBotApi.sendMessage(getToday(), chatID, "Markdown");
        }
    }

    private String getToday() {
        ULocale farsiLocale = new ULocale("fa_IR@calendar=persian");
        Calendar calendar = Calendar.getInstance(farsiLocale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, farsiLocale);
        DateFormat usdf = DateFormat.getDateInstance(DateFormat.FULL);
        String[] todayElements = df.format(calendar).split("\\s");
        String day = todayElements[3].replace("," , "");

        String today = String.format("امروز: %s %s %s %s %s", todayElements[4], day,
                todayElements[2], todayElements[1], todayElements[0]);
        today = today.concat("%0A").concat(usdf.format(calendar));
        return today;
    }
}
