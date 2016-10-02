import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	
	private ArrayList guitars;
	
	public Inventory() {
		guitars = new ArrayList();
	}
	
	public void addGuitar (String serialNumber, double price, Builder builder, 
						   String model, Type type, Wood backWood, Wood topWood) {
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
	
	public ArrayList search(GuitarSpec desiredGuitarSpecs) {
		ArrayList<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(desiredGuitarSpecs)) matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
