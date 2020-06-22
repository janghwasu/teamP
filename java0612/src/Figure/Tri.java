package Figure;

public class Tri extends Figure {

	public Tri(int i) {
		// TODO Auto-generated constructor stub
	}

	double w;
	double h;

	public Tri(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double cal() {
		// TODO Auto-generated method stub
		return w * h / 2;
	}

}
