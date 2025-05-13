package naosei;

import java.util.Scanner;

public class atv2 {

	public void atv2() {
		  Scanner tec = new Scanner(System.in);

		System.out.println("Escreva o valor do IPI");
		int IPI;
		IPI = tec.nextInt();
		System.out.println("Escreva o valor do produto 1 do IPI");
		int valor1;	
		valor1 = tec.nextInt();
		System.out.println("Escreva a quantidade do produto 1 do IPI");
		int quant1;
		quant1 = tec.nextInt();
		System.out.println("Escreva o valor do produto 2 do IPI");
		int valor2;
		valor2 = tec.nextInt();
		System.out.println("Escreva a quantidade do produto 2 do IPI");
		int quant2;
		quant2 = tec.nextInt();
		
		double valortotal = (valor1*quant1 + valor2*quant2)*(IPI/100 +1);
		System.out.println("O valor final seria de "+ valortotal);
		
		
		
	}

}
