package gfg160JavaProblems;

import java.util.Scanner;

public class ConcatinateAndReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = s1 + s2;
		String rev = "";
		for (int i = s3.length() - 1; i >= 0; i--) {
			rev = rev + s3.charAt(i);
		}
		System.out.println(rev);
	}

}
