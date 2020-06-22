package Figure;

public class Rectangle extends Figure {

	double w;
	double h;

	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public double cal() {
		return w * h;
	}

}
