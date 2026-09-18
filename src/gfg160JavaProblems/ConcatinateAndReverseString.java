package gfg160JavaProblems;

import java.util.Scanner;
/* Given two strings s1 and s2 as input, concatenate two strings and then reverse the joined string. 

Examples:

Input: s1 = "Geeks" , s2 = "forGeeks"
Output: "skeeGrofskeeG" 
Explanation: Concatenating s1 and s2 to get "GeeksforGeeks" then reversing it to "skeeGrofskeeG".
Input: s1 = "Practice" , s2 = "Geeks"
Output: "skeeGecitcarP"
Explanation: Concatenating s1 and s2 to get "PracticeGeeks" then reversing it to"skeeGecitcarP".
Constraints:
1 ≤ |s1| ≤103
1 ≤ |s2| ≤103

*/

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
