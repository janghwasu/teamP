package ex02;

public interface Basic {
// 인터페이스에는 2가지만 들어갈 수 있음
// 1. 상수(변하지 않는 수, 모두 대문자로 되어 있으며 볼드체로 기울어져 있음) 
// 2. 추상메소드(이름만 있는 정의되지 않은 메소드)

	public final String GAMENAME = "메이플스토리";

	public abstract void attck();
	public abstract void move();
	
	
}
