package gfg160JavaProblems;

import java.util.Scanner;

public class DeleteAlternateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DeleteAlternateCharacters obj = new DeleteAlternateCharacters();
		System.out.println(obj.delAlternate("GEEKSgggg"));
		sc.close();
	}

	public static String delAlternate(String s) {
		int n = s.length();
		String str = "";
		for (int i = 0; i <= s.length(); i++) {
			if (i % 2 == 0) {
				str = str + s.charAt(i);
			}
		}
		return str;

	}
}
