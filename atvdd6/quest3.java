package atvdd6;
import java.util.Scanner;

public class quest3 {

	public void quest3() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque o custo de fábrica do carro");
		double custon = tec.nextDouble();
		double custod = custon+(custon*0.28);
		double custof = custod+(custon*0.45);
		System.out.println("O valor final do carro é de: "+ custof);
		
	}

}
