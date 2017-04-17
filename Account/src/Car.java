
public class Car implements Valuable{
	private double price;
	private double value;
	private int month;
	private String name;
	
	Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double estimateValue(int month) {
		return value = (0.8 * price) * Math.pow(1 - 0.01, month);
	}
	
	@Override
	public double estimateValue() {
		month++;
		return value = (0.8 * price) * Math.pow(1 - 0.01, month);
	}
	
	
	public String toString() {
		return "Car Name : " + name + "\n" + "Initial Price : " + price;
	}
}
