
import java.util.ArrayList;
import java.util.Iterator;

public class DiaperMenu implements Diaper, DiaperMenuInterface {
	ArrayList<DiaperType> diaperTypes;
 
	public DiaperMenu() {
		diaperTypes = new ArrayList<DiaperType>();
    
		addDiaper("Coterie The Diapers ", 
			"Best diapers for diaper rash", 
			true,
			5.99);
 
		addDiaper("Pampers Pure Protection", 
			"Best diapers for diaper rash.", 
			false,
			6.99);
 
		addDiaper("Hello Bello Diapers",
			"Best diaper subscription",
			true,
			4.49);
 
		addDiaper("Up&Up Diapers",
			"Best store-brand diapers",
			true,
			9.59);
		addDiaper("Pampers Baby Dry.",
				"Most absorbent diapers",
				true,
				6.90);
	}

	@Override
	public void addDiaper(String name, String description,
	                    boolean available, double price)
	{
		DiaperType menuItem = new DiaperType(name, description, available, price);
		diaperTypes.add(menuItem);
	}
 
	@Override
	public ArrayList<DiaperType> getMenuItems() {
		return diaperTypes;
	}
  
	@Override
	public Iterator<DiaperType> createIterator() {
		return diaperTypes.iterator();
	}

}