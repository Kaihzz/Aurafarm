package atvs_linguagem;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n;

       while (true) {
            System.out.print("** Digite número de termos de Fibonacci (N) : ");
            n = sc.nextInt();

           if (n > 0) {
                break;
            } else {
                System.out.println("  O número digitado tem que ser maior do que zero. Por favor, digite outro número\n");
            }
        }

        System.out.print("\n  Série de Fibonacci: ");
        long a = 1, b = 1;

        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(", " + b);

        for (int i = 3; i <= n; i++) {
            long next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }

        System.out.println();
        sc.close();					
    }										
}