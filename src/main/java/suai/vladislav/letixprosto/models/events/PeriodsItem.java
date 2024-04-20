package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeriodsItem{

	@JsonProperty("lower")
	private String lower;

	@JsonProperty("upper")
	private String upper;

	public String getLower(){
		return lower;
	}

	public String getUpper(){
		return upper;
	}
}
