package gfg160JavaProblems;

public class Task {

	int l = 10;
	int b = 20;
	int h = 10;

	
	public  Task(int l, int b, int h) {
		
	}
	public void set_length(int l) {
		this.l = l;
	}

	public void set_breadth(int b) {
		this.b = b;
	}

	public void set_height(int h) {
		this.h = h;
	}

	public void Volume() {
		System.out.println(l * b * h);
	}

//	public static void main(String[] args) {
//     Task t1 = new Task(10, 20, 30);
//     System.out.println(t1);
//	}
}
