package atvd5;
import java.util.Scanner;

public class quest2 {

	public void quest2() {
		Scanner tec = new Scanner(System.in);
        System.out.println("Coloque O salário base do funcionário");
	    double sb = tec.nextInt();
	    double grat = sb*0.10;
	    double imp = sb*0.21;
	    System.out.println("O salário base é: "+ sb +" A gratificação é: "+ grat + " E o imposto é:"+ imp);
	    double result = sb+grat-imp;
		System.out.println("Esse é seu salário final: "+ result);
		
		
		
	}

}
