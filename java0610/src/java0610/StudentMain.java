package java0610;

public class StudentMain {

	public static void main(String[] args) {
		// ��ü �迭 ����
		Student[] stArr = new Student[2];

		// ������ �ε����� Student ��ü ����
		stArr[0] = new Student();
		stArr[1] = new Student();

		stArr[0].setName("��ȭ��");
		stArr[0].setBan(1);
		stArr[0].setNum(10);

		stArr[1].setName("�輱��");
		stArr[1].setBan(2);
		stArr[1].setNum(12);

//		System.out.print(stArr[0].getName(), stArr[0].getBan(), stArr[0].getNum());

		for (int i = 0; i < stArr.length; i++) {
			System.out.println(stArr[i].getName());
			System.out.println(stArr[i].getBan());
			System.out.println(stArr[i].getNum());

		}

	}

}
