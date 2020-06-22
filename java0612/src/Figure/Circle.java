package Figure;

public class Circle extends Figure {

	double r;

	public Circle(double r) {
		this.r = r;

	}

	@Override
	public double cal() {
		return Math.PI * r * r;
	}
}
