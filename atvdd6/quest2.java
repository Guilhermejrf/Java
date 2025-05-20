package atvdd6;
import java.util.Scanner;
public class quest2 {

	public void quest2() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque seu código");
		int codigo = tec.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Sua entrada foi permitida");
			break;
		case 2:
			System.out.println("Sua entrada foi permitida");
			break;
		case 3:
			System.out.println("Sua entrada foi permitida");
			break;
		default:
			System.out.println("Sua entrada foi negada");
		}
	}		
}

