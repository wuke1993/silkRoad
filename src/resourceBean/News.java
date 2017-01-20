package resourceBean;

public class News extends RecResource {
	private String title;
	private String content;
	private String img_url;
	private String date;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String image_url) {
		this.img_url = image_url;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
