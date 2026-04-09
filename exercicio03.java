package atvs_linguagem;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        int pares = 0, impares = 0;

        System.out.println("*** Digite números até ser encontrado um zero\n");

        while (true) {
            contador++;
            System.out.print("Escreva o " + contador + "° número: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("-> FIM DA LEITURA");
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("-> Esse número é par");
                pares++;
            } else {
                System.out.println("-> Esse número é ímpar");
                impares++;
            }
        }

        System.out.println("\n*** Resultado do programa");
        System.out.println("Foram digitados " + pares + " número(s) pares e " + impares + " número(s) ímpares");

        sc.close();
    }
}