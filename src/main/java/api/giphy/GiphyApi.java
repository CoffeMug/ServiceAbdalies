package api.giphy;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by majid on 09/09/16.
 */
public class GiphyApi {
    private Client client;
    private WebTarget webTarget;

    private static final int GIPHY_IMAGE_LIMIT = 50;

    public String search(String query) {
        client = ClientBuilder.newClient();
        webTarget = client.target("http://api.giphy.com/v1/gifs")
                .path("search")
                .queryParam("q", query)
                .queryParam("api_key", "dc6zaTOxFJmzC")
                .queryParam("limit", String.valueOf(GIPHY_IMAGE_LIMIT));
        Response response = webTarget.request(MediaType.APPLICATION_JSON).get();

        ObjectMapper objectMapper = new ObjectMapper();

        Giphy giphy = new Giphy();
        try {
            giphy = objectMapper.readValue(response.readEntity(String.class), Giphy.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Random randomGenerator = new Random();
        int numberOfGiphiesInResponse = giphy.getData().size();
        return giphy.getData().get(randomGenerator.nextInt(numberOfGiphiesInResponse)).getImages().getOriginal().getUrl();
    }
}
