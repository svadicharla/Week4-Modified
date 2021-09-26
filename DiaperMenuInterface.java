import java.util.ArrayList;
import java.util.Iterator;

public interface DiaperMenuInterface {

	void addDiaper(String name, String description, boolean available, double price);

	ArrayList<DiaperType> getMenuItems();

	Iterator<DiaperType> createIterator();

}