package 접근제한자02;

import 접근제한자01.Test;

public class T extends Test {

	public void info() {

		System.out.println(this.score);
		System.out.println(super.score);
	}

}
