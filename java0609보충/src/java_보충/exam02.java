package java_����;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] drink = { "coke", "sprite", "fanta", "water", "juice" };
		System.out.print("���ִ� ����� :");
		for (int i = 0; i < drink.length; i++) {

			System.out.print(drink[i] + " ");
		}
		System.out.println();
		String[] snack = { "����Ĩ", "�ѼŻѼ�", "�ͻ��" };
		{
			System.out.print("���ִ� ���� : ");
			for (int i = 0; i < snack.length; i++) {

				System.out.print(snack[i] + " ");
			}

		}
		System.out.println();
		
		snack[0] = "�μŹ���";
		System.out.println(snack[1]);
		System.out.println(drink[1]);

	} 
}