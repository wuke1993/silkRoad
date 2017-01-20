package resourceBean;

public class Conference extends RecResource {
	private String conference_name;
	private String organizer;
	private String start_date;
	private String broad_theme;

	public String getConference_name() {
		return conference_name;
	}
	public void setConference_name(String conference_name) {
		this.conference_name = conference_name;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getBroad_theme() {
		return broad_theme;
	}
	public void setBroad_theme(String broad_theme) {
		this.broad_theme = broad_theme;
	}
}
