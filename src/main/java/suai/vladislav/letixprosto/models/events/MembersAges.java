package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembersAges{

	@JsonProperty("lower")
	private Object lower;

	@JsonProperty("upper")
	private Object upper;

	public Object getLower(){
		return lower;
	}

	public Object getUpper(){
		return upper;
	}
}
