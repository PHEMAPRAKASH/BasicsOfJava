package gfg160JavaProblems;

public class Withoutloop1ton {

	public static void main(String[] args) {
		Withoutloop1ton obj1 = new Withoutloop1ton();
		obj1.oneton(10);
		Withoutloop1ton obj2 = new Withoutloop1ton();
		obj2.ntoone(20);
	}

	public void oneton(int n) {
		if (n != 0) {

			System.out.println(n + " ");
			oneton(n - 1);
		}
	}

	public void ntoone(int n) {
		if (n != 0) {
			System.out.println(n + "");
			ntoone(n - 1);
		}
	}
}
