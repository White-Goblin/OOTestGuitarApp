import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addGuitar (String serialNumber, double price, String builder, 
						   String model, String type, String backWood, String topWood) {
		Guitar guitar = new Guitar (serialNumber, price, builder, 
									model, type, backWood, topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar (String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}	
		}
		return null;
	}
	
	
	
}
