package BuilderPattern;

public class AdvancedBookOne {
	private String name;
	private String author;
	private String publisher;
	private int pages;
	private int price;

	public AdvancedBookOne() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AdvancedBookOne [name=" + name + ", author=" + author + ", publisher=" + publisher + ", pages=" + pages
				+ ", price=" + price + "]";
	}

}
