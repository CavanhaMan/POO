package Prova_13_03;

public class ProvaB_Q8 {

	public static void main(String[] args) {
		B8 obj = new B8();
		obj.i = 1;
		obj.j = 2;
		obj.display();
	}

}

class A8 {
	int i;
	void display() { System.out.println(i);}
}

class B8 extends A8 {
	int j;
	void display() { System.out.println(j);}
}

class inheritance_demo {
	public static void main (String args[]) {
		B8 obj = new B8();
		obj.i = 1;
		obj.j = 2;
		obj.display();
	}
}