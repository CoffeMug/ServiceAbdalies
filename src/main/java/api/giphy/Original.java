package api.giphy;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "url",
        "width",
        "height",
        "size",
        "frames",
        "mp4",
        "mp4_size",
        "webp",
        "webp_size"
})
public class Original {

    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("size")
    private String size;
    @JsonProperty("frames")
    private String frames;
    @JsonProperty("mp4")
    private String mp4;
    @JsonProperty("mp4_size")
    private String mp4Size;
    @JsonProperty("webp")
    private String webp;
    @JsonProperty("webp_size")
    private String webpSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The width
     */
    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    /**
     *
     * @param width
     * The width
     */
    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     *
     * @return
     * The height
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     *
     * @param height
     * The height
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     *
     * @return
     * The size
     */
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The frames
     */
    @JsonProperty("frames")
    public String getFrames() {
        return frames;
    }

    /**
     *
     * @param frames
     * The frames
     */
    @JsonProperty("frames")
    public void setFrames(String frames) {
        this.frames = frames;
    }

    /**
     *
     * @return
     * The mp4
     */
    @JsonProperty("mp4")
    public String getMp4() {
        return mp4;
    }

    /**
     *
     * @param mp4
     * The mp4
     */
    @JsonProperty("mp4")
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    /**
     *
     * @return
     * The mp4Size
     */
    @JsonProperty("mp4_size")
    public String getMp4Size() {
        return mp4Size;
    }

    /**
     *
     * @param mp4Size
     * The mp4_size
     */
    @JsonProperty("mp4_size")
    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    /**
     *
     * @return
     * The webp
     */
    @JsonProperty("webp")
    public String getWebp() {
        return webp;
    }

    /**
     *
     * @param webp
     * The webp
     */
    @JsonProperty("webp")
    public void setWebp(String webp) {
        this.webp = webp;
    }

    /**
     *
     * @return
     * The webpSize
     */
    @JsonProperty("webp_size")
    public String getWebpSize() {
        return webpSize;
    }

    /**
     *
     * @param webpSize
     * The webp_size
     */
    @JsonProperty("webp_size")
    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}