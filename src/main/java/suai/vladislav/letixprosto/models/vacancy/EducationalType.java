package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationalType{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("url")
	private String url;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}
}