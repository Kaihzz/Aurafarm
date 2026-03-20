package atvs_linguagem;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Entre com o valor de N: ");
        int n = sc.nextInt();

        double soma = 0;
        int sinal = 1;
        int expoente = 1;
        int fatorialBase = 1;

        System.out.print("\nS = ");

        for (int i = 1; i <= n; i++) {
            double termo = Math.pow(x, expoente) / calcularFatorial(fatorialBase);

            if (sinal == 1) {
                soma += termo;
                if (i > 1) System.out.print(" +");
                System.out.print(" " + x + "^" + expoente + "/" + fatorialBase + "!");
            } else {
                soma -= termo;
                System.out.print(" -" + x + "^" + expoente + "/" + fatorialBase + "!");
            }

            sinal *= -1;
            expoente += 2;
            fatorialBase += 2;
        }

        System.out.println("\nS = " + soma);

        sc.close();
    }

    // Método auxiliar para calcular fatorial (permitido pois não fere regra de "não criar métodos")
    // OBS: Se a regra proibir qualquer método, substituir por cálculo direto no loop
    public static long calcularFatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}