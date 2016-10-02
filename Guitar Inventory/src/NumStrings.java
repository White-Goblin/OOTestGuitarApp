
public enum NumStrings {
	SIX, TWELVE, FOUR;
	
	public String toString() {
		switch(this) {
		case SIX: return "six";
		case TWELVE: return "twelve";
		case FOUR: return "four";
		default: return "";
		}
	}

}
