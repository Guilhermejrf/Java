package atvdd6;
import java.util.Scanner;

public class quest4 {
		
	public void quest4() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Quanto você quer depositar?");
		double dep = tec.nextDouble();	
		System.out.println("Você é um cliente especial? (Sim ou Nao)");
		String pergunta = tec.next();
		if (pergunta.toLowerCase().equals("sim")) {
			
			System.out.println("Você quer ver o valor da sua conta ou sacar dinheiro? (1 ou 2)");
			int escolha = tec.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Seu valor na conta é de: "+ dep);
				break;
			case 2:
				System.out.println("Quanto você quer sacar?");
				double saque = tec.nextDouble();
				if (saque>dep) {
					System.out.println("Saldo insuficiente");
				} else {
					 double imposto = saque*0.01;
					 dep = dep-(saque+imposto);
					 System.out.println("Saque realizado com sucesso! Seu saldo restante é de: "+ dep);
				}
			default:
				break;
		
			}
		} else {
			System.out.println("Você quer ver o valor da sua conta ou sacar dinheiro? (1 ou 2)");
			int escolha = tec.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Seu valor na conta é de: "+ dep);
				break;
			case 2:
				System.out.println("Quanto você quer sacar?");
				double saque = tec.nextDouble();
				if (saque>dep) {
					System.out.println("Saldo insuficiente");
				} else {
					 double imposto = saque*0.05;
					 dep = dep-(saque+imposto);
					 System.out.println("Saque realizado com sucesso! Seu saldo restante é de: "+ dep);
				}
			default:
				break;
		
			}
		}
			
		}
	
	
	
	
}
