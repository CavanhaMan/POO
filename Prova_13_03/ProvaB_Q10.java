package Prova_13_03;

public class ProvaB_Q10 {

	public static void main(String[] args) {
		B10 obj2 = new B10();
		obj2.i = 1;
		obj2.j = 2;
		A10 r;
		r = obj2;
		r.display();
	}
}

class A10 {
	int i;
	public void display() {
		System.out.println(i);}
}

class B10 extends A10 {
	int j;
	public void display() { System.out.println(j);}
}

class Dynamic_dispatch{
	public static void main (String args[]) {
		B10 obj2 = new B10();
		obj2.i = 1;
		obj2.j = 2;
		A10 r;
		r = obj2;
		r.display();
	}
}