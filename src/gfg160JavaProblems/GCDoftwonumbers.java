package gfg160JavaProblems;

public class GCDoftwonumbers {

	public static void main(String[] args) {
		int a = 12;
		int b = 10;
		while (a !=0) {
			int temp = a;
			a = a%b;
			b = temp;
		}
		//System.out.printf("%d %d", a, b);
		System.out.println(b);
		}

}
