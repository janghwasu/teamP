package java0601;

import java.util.Scanner;

public class 구구단2단 {

	public static void main(String[] args) {

		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + "*" + i + "=" + (i * j));
			}
		}
	}
}