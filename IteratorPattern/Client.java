package IteratorPattern;

public class Client {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		MyIterator bookIterator = bookShelf.iterator();
		while (bookIterator.hasNext()) {
			Book book = (Book) bookIterator.next();
			System.out.println(book.getName());
		}
		
		DiscShelf discShelf = new DiscShelf();
		discShelf.appendDisc(new Disc("The Beatles"));
		discShelf.appendDisc(new Disc("ABBA"));
		discShelf.appendDisc(new Disc("Queen"));
		discShelf.appendDisc(new Disc("Metallica"));
		MyIterator discIterator = discShelf.iterator();
		while (discIterator.hasNext()) {
			Disc disc = (Disc) discIterator.next();
			System.out.println(disc.getName());
		}
	}
}
