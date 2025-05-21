package atvdd7;
import java.util.Scanner;

public class quest3 {

	public void Aluno() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Coloque o nome do aluno");
		String nome = tec.nextLine();
		System.out.println("Coloque a matricula");
		int mat = tec.nextInt();
		System.out.println("Insira as notas de cada semestre!");
		System.out.println("Semestre 1");
		int sem1 = tec.nextInt();
		System.out.println("Semestre 2");
		int sem2 = tec.nextInt();
		System.out.println("Semestre 3");
		int sem3 = tec.nextInt();
		System.out.println("Semestre 4");
		int sem4 = tec.nextInt();
		int media = (sem1+sem2+sem3+sem4)/4;
		if (media>= 7) {
			System.out.println("O aluno: "+ nome + " com a matricula: "+ mat + " Foi aprovado");
			System.out.println("Veja os outros!");
			Aluno();
		} else {
			System.out.println("O aluno: "+ nome + " com a matrícula: "+ mat+ " Foi reprovado");
			System.out.println("Veja os outros!");
			Aluno();
		}
	}

}
