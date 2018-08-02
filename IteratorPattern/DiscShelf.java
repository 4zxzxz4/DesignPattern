package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class DiscShelf implements Aggregate {
	private List<Disc> discs;
	private int last = 0;

	public DiscShelf() {
		discs = new ArrayList<>();
	}

	public Disc getDiscAt(int index) {
		return discs.get(index);
	}

	public void appendDisc(Disc disc) {
		discs.add(disc);
	}
	
	public int getLength() {
		return discs.size();
	}

	public MyIterator iterator() {
		return new DiscShelfIterator(this);
	}

}
