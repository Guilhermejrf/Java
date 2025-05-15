package atvd5pt2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Escolha qual questão que você quer");
		int q;
	    q = tec.nextInt();
		if (q == 1) {
			quest1 texto = new quest1();
			 texto.quest1();
		}
		if (q == 2) {
			quest2 texto2 = new quest2();
			 texto2.quest2();
		}
		if (q == 3) {
			quest3 texto3 = new quest3();
			 texto3.quest3();
		}
		else {
			main(args);
		}
}
}