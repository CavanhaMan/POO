package Prova_13_03;

public class ProvaB_Q7 {

	public static void main(String[] args) {
		Test obj = new Test(10,20);
		obj.meth(obj);
		System.out.println(obj.a + " " + obj.b);	}

}

class Test{
	int a, b;
	Test(int i, int j){ a=i; b=j; }
	void meth(Test o) {o.a*=2; o.b/=2;}
}

class Output{
	public static void main(String args[]) {
		Test obj = new Test(10,20);
		obj.meth(obj);
		System.out.println(obj.a + " " + obj.b);
	}
}