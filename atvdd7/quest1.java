package atvdd7;
import java.util.Scanner;

public class quest1 {

	public void quest1() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque o valor do raio");
		double raio = tec.nextDouble();
		double pi = 3.14;
		double area = pi*(raio*raio);
		System.out.println("A área é: "+ area);
		double peri = raio*(pi*pi);
		
	}

}
