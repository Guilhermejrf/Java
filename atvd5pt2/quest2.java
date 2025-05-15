package atvd5pt2;
import java.util.Scanner;


public class quest2 {

	public void quest2() {
		Scanner tec = new Scanner(System.in);	
		System.out.println("Coloque o valor de deposito ");
	    double val = tec.nextDouble();
	    System.out.println("Coloque a quantidade de meses que você deixara o dinheiro (NÃO poderá sacar antes disso)");
		int mes = tec.nextInt();
		double jrs = (val*0.007);
		double jrst = val+(jrs*mes);
		System.out.println("Esse é o valor que você irá sacar: "+ jrst);
	}

}
