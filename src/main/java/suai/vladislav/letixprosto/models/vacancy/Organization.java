package suai.vladislav.letixprosto.models.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organization{

	@JsonProperty("site")
	private String site;

	@JsonProperty("address")
	private Object address;

	@JsonProperty("organization")
	private Object organization;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("logo")
	private Logo logo;

	@JsonProperty("id")
	private int id;

	@JsonProperty("parent")
	private Object parent;

	@JsonProperty("educationalStandard")
	private Object educationalStandard;

	@JsonProperty("supervisorJobTitleEng")
	private String supervisorJobTitleEng;

	@JsonProperty("shortTitleEng")
	private String shortTitleEng;

	@JsonProperty("isHead")
	private boolean isHead;

	@JsonProperty("shortTitle")
	private String shortTitle;

	@JsonProperty("type")
	private Object type;

	@JsonProperty("cover")
	private Object cover;

	@JsonProperty("supervisorFio")
	private String supervisorFio;

	@JsonProperty("createdAt")
	private String createdAt;

	@JsonProperty("educationalType")
	private EducationalType educationalType;

	@JsonProperty("fullTitleEng")
	private String fullTitleEng;

	@JsonProperty("isParticipant")
	private boolean isParticipant;

	@JsonProperty("accreditationCertificate")
	private AccreditationCertificate accreditationCertificate;

	@JsonProperty("email")
	private String email;

	@JsonProperty("educationalLevel")
	private Object educationalLevel;

	@JsonProperty("updatedAt")
	private String updatedAt;

	@JsonProperty("ogrn")
	private String ogrn;

	@JsonProperty("fullTitle")
	private String fullTitle;

	@JsonProperty("addressEng")
	private String addressEng;

	@JsonProperty("publishedAt")
	private Object publishedAt;

	@JsonProperty("isPublished")
	private boolean isPublished;

	@JsonProperty("inn")
	private String inn;

	@JsonProperty("descriptionEng")
	private String descriptionEng;

	@JsonProperty("telegram")
	private String telegram;

	@JsonProperty("licenze")
	private Licenze licenze;

	@JsonProperty("isEducational")
	private boolean isEducational;

	@JsonProperty("supervisorJobTitle")
	private String supervisorJobTitle;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("vk")
	private String vk;

	@JsonProperty("supervisorFioEng")
	private String supervisorFioEng;

	@JsonProperty("status")
	private boolean status;

	public String getSite(){
		return site;
	}

	public Object getAddress(){
		return address;
	}

	public Object getOrganization(){
		return organization;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public Logo getLogo(){
		return logo;
	}

	public int getId(){
		return id;
	}

	public Object getParent(){
		return parent;
	}

	public Object getEducationalStandard(){
		return educationalStandard;
	}

	public String getSupervisorJobTitleEng(){
		return supervisorJobTitleEng;
	}

	public String getShortTitleEng(){
		return shortTitleEng;
	}

	public boolean isIsHead(){
		return isHead;
	}

	public String getShortTitle(){
		return shortTitle;
	}

	public Object getType(){
		return type;
	}

	public Object getCover(){
		return cover;
	}

	public String getSupervisorFio(){
		return supervisorFio;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public EducationalType getEducationalType(){
		return educationalType;
	}

	public String getFullTitleEng(){
		return fullTitleEng;
	}

	public boolean isIsParticipant(){
		return isParticipant;
	}

	public AccreditationCertificate getAccreditationCertificate(){
		return accreditationCertificate;
	}

	public String getEmail(){
		return email;
	}

	public Object getEducationalLevel(){
		return educationalLevel;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getOgrn(){
		return ogrn;
	}

	public String getFullTitle(){
		return fullTitle;
	}

	public String getAddressEng(){
		return addressEng;
	}

	public Object getPublishedAt(){
		return publishedAt;
	}

	public boolean isIsPublished(){
		return isPublished;
	}

	public String getInn(){
		return inn;
	}

	public String getDescriptionEng(){
		return descriptionEng;
	}

	public String getTelegram(){
		return telegram;
	}

	public Licenze getLicenze(){
		return licenze;
	}

	public boolean isIsEducational(){
		return isEducational;
	}

	public String getSupervisorJobTitle(){
		return supervisorJobTitle;
	}

	public String getPhone(){
		return phone;
	}

	public String getVk(){
		return vk;
	}

	public String getSupervisorFioEng(){
		return supervisorFioEng;
	}

	public boolean isStatus(){
		return status;
	}
}