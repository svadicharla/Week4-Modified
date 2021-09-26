import java.util.ArrayList;

public class DiaperMain {
	public static void main(String []args) {
		DiaperMenu diaperMenu=new DiaperMenu();
		ArrayList<Diaper> diapers=new ArrayList<Diaper>();
		diapers.add(diaperMenu);
		DiaperClientInterface diaperClient=new DiaperClient(diapers);
		diaperClient.printDiaperMenu();
		}
}
