package atvs_linguagem;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;;
        int opcao;

        while (true) {
            System.out.print("Digite um número para cálculo do fatorial....................: ");
            numero = sc.nextInt();

            if (numero == -999) break;

            if (numero < 0) {
                System.out.println("Número negativo não possui fatorial!!!\n");
                continue;
            }

            if (numero == 0) {
                System.out.println("0! = 1\n");
                continue;
            }

            if (numero == 1) {
                System.out.println("1! = 1\n");
                continue;
            }

            System.out.print("Escolha opção de cálculo (1) Crescente (2) Decrescente: ");
            opcao = sc.nextInt();

            long fatorial = 1;
            System.out.print(numero + "! = ");

            if (opcao == 1) {
                for (int i = 1; i <= numero; i++) {
                    if (i > 1) System.out.print(" * ");
                    System.out.print(i);
                    fatorial *= i;
                }
            } else {
                for (int i = numero; i >= 1; i--) {
                    if (i < numero) System.out.print(" * ");
                    System.out.print(i);
                    fatorial *= i;
                }
            }

            System.out.println(" = " + fatorial + "\n");
        }

        sc.close();
    }
}