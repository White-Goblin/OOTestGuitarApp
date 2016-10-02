
public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString() {
		switch(this) {
		case FENDER: return "Indian Rosewood";
		case MARTIN: return "Brazilian Rosewood";
		case GIBSON: return "Maple";
		case COLLINGS: return "Mahogany";
		case OLSON: return "Cocobolo";
		case RYAN: return "Cedar";
		case PRS: return "Adirondack";
		case ANY: return "Alder";
		default: return "";
		}
	}

}
