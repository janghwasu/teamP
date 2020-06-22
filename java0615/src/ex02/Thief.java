package ex02;

public class Thief implements Basic {

	@Override
	public void attck() {
		System.out.println("표창으로 공격!!");

	}

	@Override
	public void move() {
		System.out.println("빠른 발걸음으로 이동!!!");
	}

}
