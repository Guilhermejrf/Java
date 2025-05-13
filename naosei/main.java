package naosei;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		  Scanner tec = new Scanner(System.in);

		System.out.println("qual questão você quer testar?");
		int q;
	    q = tec.nextInt();
		if (q == 1) {
			atv1 texto = new atv1();
			 texto.atv1();
		}
		if (q == 2) {
			atv2 texto2 = new atv2();
			 texto2.atv2();
		}
		if (q == 3) {
			atv3 texto3 = new atv3();
			 texto3.atv3();
		}
		if (q == 4) {
			atv4 texto4 = new atv4();
			 texto4.atv4();
		}
		if (q == 5) {
			atv4 texto5 = new atv5();
			 texto5.atv5();
		}
		if (q == 6) {
			atv6 texto6 = new atv6();
			 texto6.atv6();
		}
		if (q == 7) {
			atv7 texto7 = new atv7();
			 texto7.atv7();
		}
		if (q == 8) {
			atv8 texto8 = new atv8();
			 texto8.atv8();
		}
		 
	}

}
