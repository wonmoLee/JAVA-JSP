package array03;

public class Gugudan {

	static void startGugudan(int n) {

		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
		System.out.println();
		/*
		 * System.out.println(n+"*1="+(n*1)); System.out.println(n+"*2="+(n*2));
		 * System.out.println(n+"*3="+(n*3)); System.out.println(n+"*4="+(n*4));
		 * System.out.println(n+"*5="+(n*5)); System.out.println(n+"*6="+(n*6));
		 * System.out.println(n+"*7="+(n*7)); System.out.println(n+"*8="+(n*8));
		 * System.out.println(n+"*9="+(n*9));
		 */
	}

	public static void main(String[] args) {
		for (int n = 2; n < 10; n++) {
			startGugudan(n);
		}

	}

}
