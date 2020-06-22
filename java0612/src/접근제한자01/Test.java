package 접근제한자01;

public class Test {
	private String name = "장화수";
	public int age = 20;
	String phoneNumber = "010-4444-2222";
	protected int score = 80;
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.name);
	}
}
