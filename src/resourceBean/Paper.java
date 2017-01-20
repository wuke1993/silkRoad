package resourceBean;

public class Paper extends RecResource {
	private String title;
	private String year;
	private String volume;
	private String doi;
	private String summary;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
