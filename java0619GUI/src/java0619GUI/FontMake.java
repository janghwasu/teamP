package java0619GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontMake {

	public void fontChange (GraphicsEnvironment ge) {
	//	String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Recipekorea ����ü FONT.ttf";
		//���κп� �ʿ��� ��Ʈ�� �ּҸ� �ٲٸ鼭 ���
		
		String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\\\GmarketSansBold.otf";
		
		
				
				Font recipe;
				try {
					recipe = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
					ge.registerFont(recipe);
					// ������ ������ ��Ʈ�� �߰�
				} catch (FontFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
