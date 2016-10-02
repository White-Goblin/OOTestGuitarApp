import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory (inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		ArrayList matchingGuitar = inventory.search(whatErinLikes);
		
		if (matchingGuitar != null) {
			System.out.println("Try one of these guitars:");
			
			for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				System.out.println("This Guitar is a " + guitar.getBuilder() + " " + guitar.getModel());
				System.out.println("Its back is made of " + guitar.getBackWood());
				System.out.println("Its top is made of " + guitar.getTopWood());
				System.out.println("It costs: " + "$" + guitar.getPrice());
				System.out.println("");
			}
		} else {
			System.out.println("Sorry Erin, we do not have any guitars for you.");
		}
		System.out.println(matchingGuitar);
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("2xy33ls", 12.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		inventory.addGuitar("33234443", 1299.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		inventory.addGuitar("4434", 0.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		inventory.addGuitar("xxyxtrt4", 129999.99, Builder.PRS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("peepee", 1699.99, Builder.RYAN, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("5656yty", 9.99, Builder.COLLINGS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("whodunit99", 99.99, Builder.COLLINGS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
	}

}
