package softwarelivre;
import java.util.Scanner;

public class aurafarm {

	public static void main(String[] args) {
		//declara variaveis
		Scanner sc = new Scanner(System.in);
		int xc = 0;//Media 1
		int xv = 0;//Media 2
		double md = 0;//Media total
		String nm = null;
		
		System.out.println("  # Programa que calcula média #");
		//Etapa de entrada
		System.out.print("\n  Insira o nome do aluno : ");
		nm = sc.nextLine();
		sc.nextLine();
		System.out.print("  Insira média 1  : ");
		xc = sc.nextInt();
		System.out.print("\n\n  Insira média 2 : ");
		xv = sc.nextInt();
		 // calculo
		md = ((xc + xv) / 2);
		
		//Etapa de saída
		System.out.println(" A média do aluno " + nm + " é " + md);
		
		
	}

}
