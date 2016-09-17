package api;

import org.slf4j.Logger;

import javax.ws.rs.client.*;
import javax.ws.rs.core.Response;

/**
 * Created by majid on 09/09/16.
 */
public class AbdaliesBotApi {

    private static final String BOT_URL = "https://api.telegram.org/bot250024402:AAErvbeFLpIEC-Oe-yjCneU7SgPu7RdTwDM";

    private Client client;
    private WebTarget webTarget;
    Logger log = org.slf4j.LoggerFactory.getLogger("abdaliesBotLogger");

    public Response sendMessage(String text, int chatID) {
        return sendMessage(text, chatID, "none");
    }

    public Response sendMessage(String text, int chatID, String parseMode) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BOT_URL)
                .path("sendMessage")
                .queryParam("chat_id", String.valueOf(chatID))
                .queryParam("text", text);
        if (parseMode != "none") {
            webTarget.queryParam("parse_mode", parseMode);
        }
        return webTarget.request().post(javax.ws.rs.client.Entity.text(""));
    }

    public Response sendPhoto(String photo) {
        webTarget.path("sendPhoto")
                .queryParam("chat_id", "220789878")
                .queryParam("photo", photo);
        return webTarget.request().post(javax.ws.rs.client.Entity.text(""));
    }
}
