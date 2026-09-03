package gfg160JavaProblems;

import java.util.Scanner;

public class Returnab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Returnab obj = new Returnab();
		int ans = obj.argumentFunction(a, b);
		System.out.println(ans);

	}

	public int argumentFunction(int a, int b) {
		return a + b;
	}

}
