package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Typeof{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("url")
	private String url;

	public String getName(){
		return name;
	}

	public Integer getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}
}
