package atvdd6;
import java.util.Scanner;
public class quest1 {
	public void quest1() {
		
		Scanner tec = new Scanner(System.in);
System.out.println("Coloque seu primeiro valor");
		int num1 = tec.nextInt();
		System.out.println("Coloque seu segundo valor");
		int num2 = tec.nextInt();

		if (num1==num2) {
			System.out.println("o primeiro valor é igual ao segundo");
		} else {
			System.out.println("Não é igual");
		}
		if (num1>num2) {
			System.out.println("o primeiro valor é maior que o segundo");
		} else {
			System.out.println("o primeiro valor é menor que o segundo");
		}
		if (num1>=num2) {
			System.out.println("o primeiro valor é maior ou igual que o segundo");
		} else {
			System.out.println("o primeiro valor é menor e diferente do segundo");
		}
// -------------------------------------------------------------------------------------------------// 
		if (num2==num1) {
			System.out.println("o segundo valor é igual ao primeiro");
		} else {
			System.out.println("Não é igual");
		}
		if (num2>num1) {
			System.out.println("o segundo valor é maior que o primeiro");
		} else {
			System.out.println("o segundo valor é menor que o primeiro");
		}
		if (num2>=num1) {
			System.out.println("o segundo valor é maior ou igual que o primeiro");
		} else {
			System.out.println("o segundo valor é menor e diferente do primeiro");
		}

	}

}
