import java.util.Iterator;
  
public class DiaperIterator implements Iterator<DiaperType>, DiaperIteratorInterface {
	DiaperType[] list;
	int position = 0;
 
	public DiaperIterator(DiaperType[] list) {
		this.list = list;
	}
 
	@Override
	public DiaperType next() {
		DiaperType diaperType = list[position];
		position = position + 1;
		return diaperType;
	}
 
	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
 
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove a diaper until one next() move is done");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}