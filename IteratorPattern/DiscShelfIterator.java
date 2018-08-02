package IteratorPattern;

public class DiscShelfIterator implements MyIterator {
	private DiscShelf discShelf;
	private int index;

	public DiscShelfIterator(DiscShelf discShelf) {
		this.discShelf = discShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < discShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Disc disc = discShelf.getDiscAt(index);
		index++;
		return disc;
	}

}
