package festival;

public class fes2_2 {

	public static void main(String[] args) {
		int num1 = 0;
		
		for(int i = 1; i < 101; i++)
		{
			if (i%2 == 1)
			{
				num1 += i;
				System.out.println(i+ " ");
			}
			else
			{
				num1 -= i;
				System.out.println(-i+" ");
			}
		}

		
		System.out.println("°á°ú : " +num1);

	}

}
