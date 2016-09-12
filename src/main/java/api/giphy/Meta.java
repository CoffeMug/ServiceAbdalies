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
        "status",
        "msg",
        "response_id"
})
public class Meta {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("response_id")
    private String responseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The status
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The msg
     */
    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    /**
     *
     * @param msg
     * The msg
     */
    @JsonProperty("msg")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     *
     * @return
     * The responseId
     */
    @JsonProperty("response_id")
    public String getResponseId() {
        return responseId;
    }

    /**
     *
     * @param responseId
     * The response_id
     */
    @JsonProperty("response_id")
    public void setResponseId(String responseId) {
        this.responseId = responseId;
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