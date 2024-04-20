package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationStatus{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}
}
