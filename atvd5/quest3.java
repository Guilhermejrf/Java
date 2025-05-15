package atvd5;
import java.util.Scanner;

public class quest3 {

	public void quest3() {
		Scanner tec = new Scanner(System.in);
        System.out.println("Coloque seu ano de nascimento");
	    int ano = tec.nextInt();
        int idade = 2025-ano;
		System.out.println("Agora insira seu nome");
		String nome = tec.next();
	    if (idade>=18) {
			System.out.println("Verificando permissão...");

			System.out.println(nome +" sua entrada foi permitida");
		} else {
			System.out.println("Verificando permissão...");

            System.out.println("Sua entrada foi negada");
		}
				
	}

}
