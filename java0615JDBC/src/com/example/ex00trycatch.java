package com.example;

public class ex00trycatch {

	public static void main(String[] args) {
		/* 
	Java ���� ����Ǵ� ����
	.java -> ������ -> .class -> ����
		
	�����Ͽ��� : ����������	
	��Ÿ�ӿ��� : ������ �Ǿ� �� �� �ִ� ���� 
			(���� ã�� ��(����) / DB / ��Ʈ��ũ ��)
			try ~ catch(����ó��) ���� p.152
		
		
*/
		System.out.println("�������");
		
		try { // ���α׷� ����
			
			System.out.println(2/0);
			
		}catch (Exception e) {
			// ������ ���� ��
			System.out.println("�����߻�!");
			e.printStackTrace();
		}finally {
			// try~catch �������� ������ ����Ǵ� ���
			System.out.println("try~catch����");
		}
		System.out.println("����Ϸ�");
		
	}

}
