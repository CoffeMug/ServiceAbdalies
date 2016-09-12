package resources;

import api.AbdaliesBotApi;
import api.giphy.GiphyApi;
import api.Message;
import api.Update;
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
            GiphyApi giphyApi = new GiphyApi();
            abdaliesBotApi.sendMessage(giphyApi.search(updateMessageText.split("\\s")[1]), chatID);

        }
    }
}
