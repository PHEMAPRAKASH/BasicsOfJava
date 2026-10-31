package gfg160JavaProblems;

abstract class A {
	

	public static void main(String[] args) {
		int prod;
		B a1 = new B();
		a1.m1(10, 20);
		a1.m2();
	}

	abstract void m1(int a, int b);

	void m2() {
		System.out.println(prod);
	}
}

class B extends A {
	void m1(int a, int b) {
		prod = a * b;
	}
}
