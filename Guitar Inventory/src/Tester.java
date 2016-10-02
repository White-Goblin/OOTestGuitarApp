
public class Tester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory (inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		Guitar matchingGuitar = inventory.search(whatErinLikes);
		
		if (matchingGuitar != null) {
			System.out.println("Found a match!");
			System.out.println("Your Guitar is a " + matchingGuitar.getBuilder() + " " + matchingGuitar.getModel());
			System.out.println("Its back is made of " + matchingGuitar.getBackWood());
			System.out.println("Its top is made of " + matchingGuitar.getTopWood());
		} else {
			System.out.println("Sorry Erin, we do not have any guitars for you.");
		}
		System.out.println(matchingGuitar);
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("2xy33ls", 12.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAPLE);
		inventory.addGuitar("33234443", 1299.99, Builder.COLLINGS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("4434", 0.99, Builder.FENDER, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("xxyxtrt4", 129999.99, Builder.PRS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("peepee", 1699.99, Builder.RYAN, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("5656yty", 9.99, Builder.COLLINGS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
		inventory.addGuitar("whodunit99", 99.99, Builder.COLLINGS, "Stratocaster", Type.ACOUSTIC, Wood.SITKA, Wood.COCOBOLO);
	}

}
