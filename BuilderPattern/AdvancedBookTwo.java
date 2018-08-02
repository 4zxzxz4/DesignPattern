package BuilderPattern;

public class AdvancedBookTwo {
	private String name;
	private String author;
	private String publisher;
	private int pages;
	private int price;

	public AdvancedBookTwo() {
		this("none");
	}

	public AdvancedBookTwo(String name) {
		this(name, "someone");
	}

	public AdvancedBookTwo(String name, String author) {
		this(name, author, "company");
	}

	public AdvancedBookTwo(String name, String author, String publisher) {
		this(name, author, publisher, 0);
	}

	public AdvancedBookTwo(String name, String author, String publisher, int pages) {
		this(name, author, publisher, pages, 0);
	}

	public AdvancedBookTwo(String name, String author, String publisher, int pages, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "AdvancedBookTwo [name=" + name + ", author=" + author + ", publisher=" + publisher + ", pages=" + pages
				+ ", price=" + price + "]";
	}

}
