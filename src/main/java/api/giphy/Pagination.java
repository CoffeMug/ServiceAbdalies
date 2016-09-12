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
        "total_count",
        "count",
        "offset"
})
public class Pagination {

    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("offset")
    private Integer offset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Pagination() {
    }

    /**
     *
     * @param count
     * @param totalCount
     * @param offset
     */
    public Pagination(Integer totalCount, Integer count, Integer offset) {
        this.totalCount = totalCount;
        this.count = count;
        this.offset = offset;
    }

    /**
     *
     * @return
     * The totalCount
     */
    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     *
     * @param totalCount
     * The total_count
     */
    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     *
     * @return
     * The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The offset
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     *
     * @param offset
     * The offset
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
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
