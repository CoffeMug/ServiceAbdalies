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
        "mp4"
})
public class Looping {

    @JsonProperty("mp4")
    private String mp4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Looping() {
    }

    /**
     *
     * @param mp4
     */
    public Looping(String mp4) {
        this.mp4 = mp4;
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