package gfg160JavaProblems;

//Class representing a task to calculate the volume of a geometric shape

class Task {
  int length, width, height;

  //Method to set the length of the shape
  public void set_length(int l) {
      length = l;
  }
  
  //Method to set the width of the shape
  public void set_width(int w) {
      width = w;
  }
  
  //Method to set the height of the shape
  public void set_height(int h) {
      height = h;
  }
  
  //Method to calculate and print the volume of the shape
  public void volume() {
      System.out.println(length * width * height);
  }

public static void main(String[]args) {
	  Task t = new Task();
	  t.set_height(10);
	  t.set_length(5);
	  t.set_width(2);
	  t.volume();
}
}