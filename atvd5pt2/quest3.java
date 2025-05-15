package atvd5pt2;
import java.util.Scanner;

public class quest3 {

	public void quest3() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque o nome do produto");
		String prod1 = tec.nextLine();
		System.out.println("Agora o preço dele");
		double preco = tec.nextDouble();
		double preco2 = preco+(preco*0.55);
		System.out.println("O produto: "+ prod1 + " teve um aumento de 55%, e o preço dele acabou sendo de: "+ preco2);
		
		int escolha = 1;
		System.out.println("Quer ver os outros produtos que também aumentaram de preço? (Sim = 1 // Não = qualquer número)");
		escolha = tec.nextInt();
		if (escolha == 1) {
			
			double acucar = 5.49;
			double banha = 12.30;
			double batataInglesa = 2.15;
			double batataDoce = 4.25;
			double biscoitoPolvilho = 7.10;
			double bolachaDoce = 6.20;
			double bolachaSalgada = 4.05;
			double cafe = 9.80;
			
			
		} else {
			System.out.println("fiquei sem criatividade então escolhe outra questão vai (não tem mais de 3)");
			main sla = new main();
			 sla.main(null);
		}
		
	}

}
