package BuilderPattern;

public class PlainBook {
	private String name;
	private String author;
	private String publisher;
	private int pages;
	private int price;
	
	public PlainBook(String name, String author, String publisher, int pages, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", pages=" + pages
				+ ", price=" + price + "]";
	}
}
