package atvd5;
import java.util.Scanner;

public class quest5 {

	public void quest5() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque seu salário por hora");
	    double salh = tec.nextDouble();
	    System.out.println("Coloque suas horas trabalhadas por mês");
	    double horm = tec.nextInt();
	    double hors = horm/4;
	    
	    if (hors>40) {
			double hextra = hors-40;
			double sals = hextra*salh+(salh*0.50);
			double salm = sals*4;
			System.out.println("Seu salário mensal foi de: "+ salm);
		} else {
		double salsemm = horm*salh;
        System.out.println("Você não fez horas extras então seu salário foi de"+ salsemm);
		}
	}
} 