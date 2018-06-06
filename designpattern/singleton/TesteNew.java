package designpattern.singleton;

public class TesteNew {

	public static void main(String[] args) {
		for (int i=0 ; i<10 ; i++) {
			IncrementalSingleTon inc = IncrementalSingleTon.getInstancia();
			System.out.println(inc);
		}

	}

}
