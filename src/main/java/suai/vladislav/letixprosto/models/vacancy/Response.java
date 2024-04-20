package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {

    @JsonIgnore
    private String next;

    @JsonIgnore
    private Object previous;

    @JsonIgnore
    private Integer count;

    @JsonProperty("results")
    private List<ResultsItem> results;

    public String getNext() {
        return next;
    }

    public Object getPrevious() {
        return previous;
    }

    public Integer getCount() {
        return count;
    }

    public List<ResultsItem> getResults() {
        return results;
    }
}