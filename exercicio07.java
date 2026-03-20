package atvs_linguagem;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("*** Cálculo dos divisores de um número\n");

        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("-> Fim do Programa!!");
                break;
            }

            if (numero < 0) {
                System.out.println("-> Número inválido!!!\n");
                continue;
            }

            System.out.print("-> Os divisores de " + numero + " são ");
            int contadorDivisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    if (contadorDivisores > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    contadorDivisores++;
                }
            }
            System.out.println(".\n");
        }

        sc.close();
    }
}