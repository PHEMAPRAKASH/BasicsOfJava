package gfg160JavaProblems;

public class LastDigitofNumber {

	public static void main(String[] args) {
		int n = 123;
		int r = n % 10;

		System.out.println(Math.abs(r));
		System.out.printf("%d", Math.abs(n % 10)); // is used to non-negative numbers.

	}

}
