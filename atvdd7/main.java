package atvdd7;
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
			 texto2.retangulo();
		}
		if (q == 3) {
			quest3 texto3 = new quest3();
			 texto3.Aluno();
		}
		if (q == 4) {
			quest4 texto4 = new quest4();;
			 texto4.quest4();;
	}	
		if (q == 5) {
			quest5 texto5 = new quest5();;
			 texto5.quest5();;
		
		
	}	
		
}
}