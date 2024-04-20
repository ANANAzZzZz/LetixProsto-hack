package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cover{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("url")
	private String url;

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}
}