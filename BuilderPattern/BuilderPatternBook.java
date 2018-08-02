package BuilderPattern;

public class BuilderPatternBook implements Buildable<BuilderPatternBook> {
	private String name;
	private String author;
	private String publisher;
	private int pages;
	private int price;

	public BuilderPatternBook() {
	};

	private BuilderPatternBook(String name, String author, String publisher, int pages, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.price = price;
	}

	public BuilderPatternBook setName(String name) {
		this.name = name;
		return this;
	}

	public BuilderPatternBook setAuthor(String author) {
		this.author = author;
		return this;
	}

	public BuilderPatternBook setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	public BuilderPatternBook setPages(int pages) {
		this.pages = pages;
		return this;
	}

	public BuilderPatternBook setPrice(int price) {
		this.price = price;
		return this;
	}

	@Override
	public BuilderPatternBook build() {
		return new BuilderPatternBook(name, author, publisher, pages, price);
	}

	@Override
	public String toString() {
		return "BuilderPatternBook [name=" + name + ", author=" + author + ", publisher=" + publisher + ", pages="
				+ pages + ", price=" + price + "]";
	}

}
