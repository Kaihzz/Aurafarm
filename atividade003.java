package trabalhoextra;
import java.util.Scanner;
public class atividade003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Exibe o menu do comando
		System.out.println("*** Começo da entrevista");
		System.out.print("\n  Qual foi sua nota..?");
		double nt = sc.nextDouble();
		String t = "Meu conceito foi ";
		char c = 'A';
		//pega a nota do aluno 
		//testa e compara a nota do aluno com os conceitos
		if(nt >= 90) {
			t = t + "A.";
			c = 'A';
			System.out.printf("\n Qual foi o conceito? %s.", t);
			
			System.out.print("\n\n*** Fim da entrevista\n\n");
			System.out.printf("		Nota %f e conceito %c são ótimos desempenhos. Parabéns!" );
		}
		else if((nt >= 80) && (nt < 90)){
			t = t + "B.";
			c = 'B';
			System.out.printf("\n Qual foi o conceito? %s.", t);
			//s
			System.out.print("\n\n*** Fim da entrevista\n\n");
			System.out.printf("nota %f e conceito %c " );
		}
		else if((nt >= 70) && (nt < 80)){
			t = t + "C.";
			c = 'C';
			System.out.printf("\n Qual foi o conceito? %s.", t);
			//s
			System.out.print("\n\n*** Fim da entrevista\n\n");
			System.out.printf("nota %f e conceito %c " );
		}
		else if((nt >= 60) && (nt < 70)){
			t = t + "D.";
			c = 'D';
			System.out.printf("\n Qual foi o conceito? %s.", t);
			//s
			System.out.print("\n\n*** Fim da entrevista\n\n");
			System.out.printf("nota %f e conceito %c " );
		}
		else if((nt >= 00) && (nt < 60)){
			t = t + "E.";
			c = 'E';
			System.out.printf("\n Qual foi o conceito? %s.", t);
			//s
			System.out.print("\n\n*** Fim da entrevista\n\n");
			System.out.printf("nota %f e conceito %c " );
		}
		

		
	}

}
