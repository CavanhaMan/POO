package lista7_06_03.Ex6;

public class Programa {

	public static void main(String[] args) {
        CartaoWeb c1 = new Natal("Papai Noel");
        CartaoWeb c2 = new Aniversario("Cavanha");
        CartaoWeb c3 = new DiaDosNamorados("Michelle");

        CartaoWeb cartoes[] = {c1, c2, c3};

        for (int i = 0; i < cartoes.length; i++)
            cartoes[i].showMessage();

	}

}
