package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainVacancyCompetenciesItem{

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