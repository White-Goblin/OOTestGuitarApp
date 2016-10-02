public class GuitarSpec {
	
	GuitarSpec (Builder builder, String model, Type type, Wood topWood, Wood backWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood;
	private Wood backWood;
	
	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder) return false;
		if (model != null && !model.equals("") && !model.equals(otherSpec.getModel())) return false;
		if (type != null && !type.equals("") && !type.equals(otherSpec.getType())) return false;
		if (backWood != null && !backWood.equals("") && !backWood.equals(otherSpec.getBackWood())) return false;
		if (topWood != null && !topWood.equals("") && !topWood.equals(otherSpec.getTopWood())) return false;
		return true;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	
}
