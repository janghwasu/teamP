package exam01;

public class ����_ġȯ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a,b = 1,2
		// a = 3
		// b = 4
		// a,b = b,a
		
		int a = 3, b = 4;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a+","+b);
		
		//����ȯ - �ڵ�����ȯ
		System.out.println(a+','+b); //',' �� ���ڷ� �����ϱ� ������ ������� 44�� �ν�

		char c2 = 44;
		System.out.println(c2);
		
		//����ȯ 
		//�ڵ�����ȯ ������ -> ū��
		//��������ȯ ū�� -> ������
		
		//����ȯ - ��������ȯ
		char c3 = (char)(a+','+b); //��������ȯ���� (char)�־���
		System.out.println(c3);
		
		int i2 = 10000000;
		short c4 = (short)i2;
		System.out.println(c4);  //��������ȯ ū��->�������϶� ������ �ս��� �Ͼ
	}

}
