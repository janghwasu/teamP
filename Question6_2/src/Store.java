
public abstract class Store {
	String name;
	String event;
	double price;

	public Store(String name, String event, double price) {
		super();
		this.name = name;
		this.event = event;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getEvent() {
		return event;
	}

	public double getPrice() {
		return price;
	}

	public abstract double grade();
}
