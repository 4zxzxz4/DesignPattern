package BuilderPattern;

public class AdvancedBuilderPatternBook {
	private final String name;
	private String author;
	private String publisher;
	private int pages;
	private final int price;

	public static class Builder implements Buildable<AdvancedBuilderPatternBook> {

		private final String name;
		private String author;
		private String publisher;
		private int pages;
		private final int price;

		public Builder(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public Builder setAuthor(String author) {
			this.author = author;
			return this;
		}

		public Builder setPublisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		public Builder setPages(int pages) {
			this.pages = pages;
			return this;
		}

		public boolean valid() {
			if (this.pages <= 0 || this.publisher.length() <= 0) {
				return false;
			}
			return true;
		}

		@Override
		public AdvancedBuilderPatternBook build() {
			if (valid()) {
				return new AdvancedBuilderPatternBook(this);
			}
			throw new IllegalStateException("Page�� 0������ �̻�, �ۺ��Ŵ� 2���� �̻� �Է����ֽʽÿ�");
		}
	}

	private AdvancedBuilderPatternBook(Builder builder) {
		this.name = builder.name;
		this.author = builder.author;
		this.publisher = builder.publisher;
		this.pages = builder.pages;
		this.price = builder.price;
	}

	@Override
	public String toString() {
		return "AdvancedBuilderPatternBook [name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", pages=" + pages + ", price=" + price + "]";
	}
}
