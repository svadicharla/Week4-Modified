
public class DiaperType {
	String name;
	String description;
	boolean available;
	double price;
 
	public DiaperType(String name, 
	                String description, 
	                boolean available, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.available = available;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isAvailable() {
		return available;
	}
}
