package java_º¸Ãæ;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] drink = { "coke", "sprite", "fanta", "water", "juice" };
		System.out.print("¸ÀÀÖ´Â À½·á¼ö :");
		for (int i = 0; i < drink.length; i++) {

			System.out.print(drink[i] + " ");
		}
		System.out.println();
		String[] snack = { "½ºÀ®Ä¨", "»Ñ¼Å»Ñ¼Å", "¿Í»çºñ" };
		{
			System.out.print("¸ÀÀÖ´Â °úÀÚ : ");
			for (int i = 0; i < snack.length; i++) {

				System.out.print(snack[i] + " ");
			}

		}
		System.out.println();
		
		snack[0] = "ºÎ¼Å¹ö·Á";
		System.out.println(snack[1]);
		System.out.println(drink[1]);

	} 
}