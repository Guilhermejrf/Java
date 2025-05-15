package atvd5;
import java.util.Scanner;

public class quest4 {

	public void quest4() {
		Scanner tec = new Scanner(System.in);
        System.out.println("Coloque seu salário");
	    double sal = tec.nextDouble();
	    System.out.println("Agora coloque quanto você quer de prestação");
	    double prest = tec.nextDouble();
	    if (prest > (sal*0.15)) {
			System.out.println("Empréstimo não pode ser concedido");
			System.out.println("Tente novamente!");
			quest4();
		} else {
			System.out.println("Empréstimo pode ser concedido");
		}



	}

}
