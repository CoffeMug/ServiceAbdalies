package api;

import org.apache.log4j.spi.LoggerFactory;
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
        log.error(String.valueOf(chatID));
        log.error(BOT_URL);
        client = ClientBuilder.newClient();
        webTarget = client.target(BOT_URL)
                .path("sendMessage")
                .queryParam("chat_id", String.valueOf(chatID))
                .queryParam("text", text);
        return webTarget.request().post(javax.ws.rs.client.Entity.text(""));
    }

    public Response sendPhoto(String photo) {
        webTarget.path("sendPhoto")
                .queryParam("chat_id", "220789878")
                .queryParam("photo", photo);
        return webTarget.request().post(javax.ws.rs.client.Entity.text(""));
    }
}
