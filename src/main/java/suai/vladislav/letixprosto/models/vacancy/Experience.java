package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Experience{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}