package suai.vladislav.letixprosto.models.vacancy;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("salaryUpTo")
	private int salaryUpTo;

	@JsonProperty("address")
	private Object address;

	@JsonProperty("employmentType")
	private EmploymentType employmentType;

	@JsonProperty("publishedAt")
	private String publishedAt;

	@JsonProperty("hhUrl")
	private String hhUrl;

	@JsonProperty("contactName")
	private String contactName;

	@JsonProperty("beforeTax")
	private boolean beforeTax;

	@JsonProperty("professions")
	private List<Object> professions;

	@JsonProperty("isBlocked")
	private boolean isBlocked;

	@JsonProperty("description")
	private String description;

	@JsonProperty("experience")
	private Experience experience;

	@JsonProperty("salaryFrom")
	private Object salaryFrom;

	@JsonProperty("personalQualities")
	private List<Object> personalQualities;

	@JsonProperty("schedule")
	private List<ScheduleItem> schedule;

	@JsonProperty("desirableVacancyCompetencies")
	private List<Object> desirableVacancyCompetencies;

	@JsonProperty("educationLevel")
	private EducationLevel educationLevel;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("organization")
	private Organization organization;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("email")
	private String email;

	@JsonProperty("mainVacancyCompetencies")
	private List<MainVacancyCompetenciesItem> mainVacancyCompetencies;

	@JsonProperty("isFavorite")
	private boolean isFavorite;

	public int getSalaryUpTo(){
		return salaryUpTo;
	}

	public Object getAddress(){
		return address;
	}

	public EmploymentType getEmploymentType(){
		return employmentType;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public String getHhUrl(){
		return hhUrl;
	}

	public String getContactName(){
		return contactName;
	}

	public boolean isBeforeTax(){
		return beforeTax;
	}

	public List<Object> getProfessions(){
		return professions;
	}

	public boolean isIsBlocked(){
		return isBlocked;
	}

	public String getDescription(){
		return description;
	}

	public Experience getExperience(){
		return experience;
	}

	public Object getSalaryFrom(){
		return salaryFrom;
	}

	public List<Object> getPersonalQualities(){
		return personalQualities;
	}

	public List<ScheduleItem> getSchedule(){
		return schedule;
	}

	public List<Object> getDesirableVacancyCompetencies(){
		return desirableVacancyCompetencies;
	}

	public EducationLevel getEducationLevel(){
		return educationLevel;
	}

	public String getPhone(){
		return phone;
	}

	public Organization getOrganization(){
		return organization;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public List<MainVacancyCompetenciesItem> getMainVacancyCompetencies(){
		return mainVacancyCompetencies;
	}

	public boolean isIsFavorite(){
		return isFavorite;
	}
}