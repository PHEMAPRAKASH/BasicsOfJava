package gfg160JavaProblems;

import java.util.Scanner;

/*You need to perform three separate tasks based on the given input:

String Input and Print: Read a string s (which may contain spaces) and print it as it is.
Integer Input and Print: Read an integer n and print it without any change.
Float Input and floor Print: Read a floating-point number as input, take its floor value, and print as an integer.
Examples:

Input: s = "Hello", n = 20, f = 5.5
Output: 
Hello
20
5
Explanation: 
The string Hello is printed as it is.
The integer 20 is printed without any change.
For floating-point number 5.5, its floor value 5 is printed. */
public class TakeInPut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		float f = sc.nextFloat();
		int ff = (int) f;
		// To Store floor of float variable f

		// code here

		System.out.println(s);
		System.out.println(n);
		System.out.println(ff);

	}

}
