package ex03;

public interface Game { // 플러스 게임

	public void select(); // 문제를 뽑다
	public String Question(); // 문제를 내다
	public void check(int sum); // 정답 확인
	public int life(); // 목숨 확인
	
	
}
