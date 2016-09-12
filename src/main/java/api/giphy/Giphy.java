package api.giphy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "data",
        "meta"
})
public class Giphy {

    @JsonProperty("data")
    private List<Datum> data = new ArrayList<Datum>();
    @JsonProperty("meta")
    private Meta meta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The data
     */
    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The meta
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     *
     * @param meta
     * The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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