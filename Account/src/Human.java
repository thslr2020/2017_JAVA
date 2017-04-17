
public class Human implements Valuable {
	private String name;
	private int age;
	private double value;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public double estimateValue(int month) {
		return value = Double.POSITIVE_INFINITY;
	}
	
	@Override
	public double estimateValue() {
		return value = Double.POSITIVE_INFINITY;
	}
	
	public String toString() {
		return "Human Name : " + name + "\n" + "Registered Age : " + age;
	}
}