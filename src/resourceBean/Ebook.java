package resourceBean;

public class Ebook extends RecResource {
	private String isbn;
	private String eisbn;
	private String author;
	private String title;
	private String pages;
	private String publisher;
	private String year;
	private String img_url;
	private String language;

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEisbn() {
		return eisbn;
	}
	public void setEisbn(String eisbn) {
		this.eisbn = eisbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
