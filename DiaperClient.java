import java.util.*;
  
     
public class DiaperClient implements DiaperClientInterface {
	ArrayList<Diaper> diapers;
     
  
	public DiaperClient(ArrayList<Diaper> diapers) {
		this.diapers = diapers;
	}
   
	@Override
	public void printDiaperMenu() {
		Iterator<?> diaperIterator = diapers.iterator();
		while(diaperIterator.hasNext()) {
			Diaper diaper = (Diaper)diaperIterator.next();
			printDiaperMenu(diaper.createIterator());
		}
	}
   
	void printDiaperMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			DiaperType type = (DiaperType)iterator.next();
			System.out.print("Diaper Name: "+type.getName() + ", ");
			System.out.println("Diaper Price:"+type.getPrice()+"$");
			System.out.println("Info :"+type.getDescription());
		}
	}
}  