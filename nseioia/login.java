package nseioia;
import java.util.Scanner;

public class login{
public String email;
public String senha;
public int cl;

    public void escolha() {
    	System.out.println("Você já tem uma conta? sim(1) // não(2)");
    	Scanner tec = new Scanner(System.in);
    	int coul = 0;
    	cl = tec.nextInt();
    	
    	switch (cl) {
        case 1:
             logins();
        	break;
        case 2:
        	cadastros();
        	break;
        default:
        System.out.println("Você tem que digitar 1 para sim e 2 para não!");
        escolha();
    	}
    }
    
	public void cadastros() {
     Scanner tec = new Scanner(System.in);
     System.out.println("Coloque seu email");
     String email = tec.nextLine();
     System.out.println("Coloque sua senha");
     String senha = tec.nextLine();
     System.out.println("Ótimo, agora faça o login para confirmar : D");
     escolha();
     }
	
     public void logins() {
    	 Scanner tec = new Scanner(System.in);
    	 int testes = 0;
    	 System.out.println("Coloque seu email");
    	 String em = tec.nextLine();
    	 if (em.equals(email)) {
			System.out.println("certo");
		}
    	 System.out.println("Coloque sua senha");
    	 String se = tec.nextLine();
    	 if (se.equals(senha)) {
			System.out.println("certo");
			produtos textosla = new produtos();
		       textosla.escolhaprod();
    	 }      
    	 else {
    		 
    		 testes = testes+1;

				System.out.println("Email ou Senha incorreto");

				if (testes == 3) {

					System.out.println("Tente novamente mais tarde!");
    	 }
  

				produtos textosla = new produtos();
			       textosla.escolhaprod();  }  
     
	}
}


