package atvd5pt2;
import java.util.Scanner;

public class quest1 {
	
	public void quest1() {
	Scanner tec = new Scanner(System.in);	

	double dolar = 5.68;
	System.out.println("Quanto você tem em reais para fazer a conversão??");
	double real = tec.nextDouble();
	double conv = real/dolar;
	System.out.println("Você tem: "+ conv + " Dólares disponíveis");

}
	
		
}
