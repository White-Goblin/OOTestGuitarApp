public class GuitarSpec {
	
	GuitarSpec (Builder builder, String model, Type type, Wood topWood, Wood backWood, NumStrings stringCount) {
		this.builder = builder;
		this.model = model.toLowerCase();
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
		this.stringCount = stringCount;
	}
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood;
	private Wood backWood;
	private NumStrings stringCount;
	
	public boolean matches(GuitarSpec otherSpec) {
		if (!builder.equals(otherSpec.getBuilder())) return false;
		if (model != null && !model.equals("") && !model.equals(otherSpec.getModel())) return false;
		if (!type.equals(otherSpec.getType())) return false;
		if (!backWood.equals(otherSpec.getBackWood())) return false;
		if (!topWood.equals(otherSpec.getTopWood())) return false;
		if (!stringCount.equals(otherSpec.getNumStrings())) return false;
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
	public NumStrings getNumStrings() {
		return stringCount;
	}
	
}
