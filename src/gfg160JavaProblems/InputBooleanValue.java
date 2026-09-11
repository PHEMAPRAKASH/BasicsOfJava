package gfg160JavaProblems;

import java.util.Scanner;

/*Take a boolean value a as an input. The program should display its numeric representation:

1 for "true"
0 for "false"
Examples: 

Input: a = true
Output: 1
Input: a = false
Output: 0
*/
public class InputBooleanValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();

		// code here

		// Printing numeric representation
		System.out.print(a ? 1 : 0);
		sc.close();

	}

}
