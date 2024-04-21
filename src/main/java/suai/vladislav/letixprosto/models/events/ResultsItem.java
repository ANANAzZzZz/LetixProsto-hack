package suai.vladislav.letixprosto.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import suai.vladislav.letixprosto.models.LessonEvent;
import suai.vladislav.letixprosto.util.DataTime;

import java.util.List;

public class ResultsItem implements LessonEvent {

	@JsonProperty("membersStatuses")
	private List<MembersStatusesItem> membersStatuses;

	@JsonProperty("isAvailable")
	private boolean isAvailable;

	@JsonProperty("parent")
	private Object parent;

	@JsonProperty("locationEng")
	private String locationEng;

	@JsonProperty("registrationStatus")
	private RegistrationStatus registrationStatus;

	@JsonProperty("organizerSupervisorFioEng")
	private String organizerSupervisorFioEng;

	@JsonProperty("registrationPeriod")
	private Object registrationPeriod;

	@JsonProperty("organizerAddressEng")
	private String organizerAddressEng;

	@JsonProperty("placesNumber")
	private Object placesNumber;

	@JsonProperty("organizerAddress")
	private String organizerAddress;

	@JsonProperty("type")
	private Type type;

	@JsonProperty("isActive")
	private boolean isActive;

	@JsonProperty("membersAges")
	private MembersAges membersAges;

	@JsonProperty("title")
	private String title;

	@JsonProperty("cover")
	private Cover cover;

	@JsonProperty("createdAt")
	private String createdAt;

	@JsonProperty("organizerSite")
	private String organizerSite;

	@JsonProperty("freePlaces")
	private Object freePlaces;

	@JsonProperty("cypher")
	private Object cypher;

	@JsonProperty("periods")
	private List<PeriodsItem> periods;

	@JsonProperty("organizerTelegram")
	private String organizerTelegram;

	@JsonProperty("id")
	private int id;

	@JsonProperty("organizerEmail")
	private String organizerEmail;

	@JsonProperty("eventFormat")
	private EventFormat eventFormat;

	@JsonProperty("typeof")
	private Typeof typeof;

	@JsonProperty("updatedAt")
	private String updatedAt;

	@JsonProperty("publishedAt")
	private String publishedAt;

	@JsonProperty("isPublished")
	private boolean isPublished;

	@JsonProperty("coordinates")
	private List<String> coordinates;

	@JsonProperty("titleEng")
	private Object titleEng;

	@JsonProperty("organizerPhone")
	private List<String> organizerPhone;

	@JsonProperty("organizer")
	private Organizer organizer;

	@JsonProperty("organizerSupervisorFio")
	private String organizerSupervisorFio;

	@JsonProperty("registrationComment")
	private Object registrationComment;

	@JsonProperty("location")
	private String location;

	@JsonProperty("organizerVk")
	private String organizerVk;

	@JsonProperty("isFavorite")
	private boolean isFavorite;

	@JsonProperty("status")
	private Status status;

	private Integer ord;
	private DataTime dataTime;

	public List<MembersStatusesItem> getMembersStatuses(){
		return membersStatuses;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public Object getParent(){
		return parent;
	}

	public String getLocationEng(){
		return locationEng;
	}

	public RegistrationStatus getRegistrationStatus(){
		return registrationStatus;
	}

	public String getOrganizerSupervisorFioEng(){
		return organizerSupervisorFioEng;
	}

	public Object getRegistrationPeriod(){
		return registrationPeriod;
	}

	public String getOrganizerAddressEng(){
		return organizerAddressEng;
	}

	public Object getPlacesNumber(){
		return placesNumber;
	}

	public String getOrganizerAddress(){
		return organizerAddress;
	}

	public Type getType(){
		return type;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public MembersAges getMembersAges(){
		return membersAges;
	}

	public String getTitle(){
		return title;
	}

	public Cover getCover(){
		return cover;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getOrganizerSite(){
		return organizerSite;
	}

	public Object getFreePlaces(){
		return freePlaces;
	}

	public Object getCypher(){
		return cypher;
	}

	public List<PeriodsItem> getPeriods(){
		return periods;
	}

	public String getOrganizerTelegram(){
		return organizerTelegram;
	}

	public int getId(){
		return id;
	}

	public String getOrganizerEmail(){
		return organizerEmail;
	}

	public EventFormat getEventFormat(){
		return eventFormat;
	}

	public Typeof getTypeof(){
		return typeof;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public boolean isIsPublished(){
		return isPublished;
	}

	public List<String> getCoordinates(){
		return coordinates;
	}

	public Object getTitleEng(){
		return titleEng;
	}

	public List<String> getOrganizerPhone(){
		return organizerPhone;
	}

	public Organizer getOrganizer(){
		return organizer;
	}

	public String getOrganizerSupervisorFio(){
		return organizerSupervisorFio;
	}

	public Object getRegistrationComment(){
		return registrationComment;
	}

	public String getLocation(){
		return location;
	}

	public String getOrganizerVk(){
		return organizerVk;
	}

	public boolean isIsFavorite(){
		return isFavorite;
	}

	public Status getStatus(){
		return status;
	}

	@Override
	public int getOrd() {
		return ord;
	}

	@Override
	public void setOrd(int i) {
		ord = i;
	}

	@NotNull
	@Override
	public DataTime getDateTime() {
		if (dataTime != null)
			return dataTime;
		else
			return DataTime.Companion.parse(periods.get(0).getLower().substring(0, 16));
	}

	@Override
	public void setDateTime(@NotNull DataTime dataTime) {
		this.dataTime = dataTime;
	}
}
