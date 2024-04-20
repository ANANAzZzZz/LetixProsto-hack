package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Logo{

	@JsonProperty("url")
	private String url;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	public String getUrl(){
		return url;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}
}