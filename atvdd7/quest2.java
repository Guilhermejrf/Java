package atvdd7;
import java.util.Scanner;

public class quest2 {
	public void retangulo() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Defina a altura");
		double al = tec.nextDouble();
		System.out.println("Defina a largura");
		double la = tec.nextDouble();
		double ar = la*al;
		System.out.println("A área é de: "+ ar);
		double peri = 2*(al+la);
		System.out.println("O perimetro é de: "+ peri);
	}
	
}

