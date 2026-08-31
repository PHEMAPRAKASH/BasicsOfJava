package gfg160JavaProblems;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		System.out.println(Recursive(10));
		for(int i = 1; i <=n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);	
		}
	
	public static int  Recursive(int n) {
		if(n == 0)
			return 1;
		return n * Recursive(n - 1);
	}

}
