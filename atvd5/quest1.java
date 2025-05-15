package atvd5;
import java.util.Scanner;

public class quest1 {

	public void quest1() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Quantos metros você quer colocar para Cm?");
	    double mt = tec.nextInt();
	    double cm = mt*100;
	    System.out.println("Sua quantidade de metros em centímetros é: "+ cm+"cm"); 
	}

}
