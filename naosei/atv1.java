package naosei;

import java.util.Scanner;

public class atv1 {

	public void atv1() {
		  Scanner tec = new Scanner(System.in);

		  System.out.println("Qual sua idade em anos?");
		  int ano;
		  ano = tec.nextInt();
		  System.out.println("Qual sua idade em meses?");
		  int mes;
		  mes = tec.nextInt();
		  System.out.println("Qual sua idade em dias?");
		  int dia;
		  dia = tec.nextInt();
		  int idade = (ano*365) + (mes*30) + dia;
		  
		  System.out.println("sua idade é: " +idade + " dias");
	}

}
