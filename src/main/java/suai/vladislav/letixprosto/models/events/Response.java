package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response{

	@JsonProperty("next")
	private Object next;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public Object getNext(){
		return next;
	}

	public Object getPrevious(){
		return previous;
	}

	public Integer getCount(){
		return count;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}
