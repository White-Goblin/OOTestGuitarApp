
public class Guitar {
	
	private String serialNumber;
	private double price;
	GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, Builder builder, 
				  String model, Type type, Wood topWood, Wood backWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, topWood, backWood);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public GuitarSpec getSpec() {
		return spec;
	}
}
