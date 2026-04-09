package atvs_linguagem;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("-- Fase de digitação de números binários");

        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("0 -> Fim de Programa!!!!");
                break;
            }

            System.out.print("O número binário de " + numero + " é ");

            if (numero == 0) {
                System.out.print("0");
            } else {
                // Como não podemos usar vetor, vamos construir a string manualmente
                String binario = "";
                int temp = numero;

                while (temp > 0) {
                    binario = (temp % 2) + binario;
                    temp = temp / 2;
                }

                System.out.print(binario);
            }
            System.out.println();
        }

        sc.close();
    }
}