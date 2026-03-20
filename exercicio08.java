package atvs_linguagem;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        int preco;
        int totalCompra = 0;
        int contador = 0;

        System.out.println("*** Fase da leitura");

        while (true) {
            contador++;
            System.out.println("-- Leitura do produto " + contador);
            System.out.print("Nome do Produto.: ");
            nomeProduto = sc.nextLine();

            if (nomeProduto.equals("0")) break;

            System.out.print("Preço do Produto: ");
            preco = sc.nextInt();
            sc.nextLine(); // limpar buffer

            totalCompra += preco;
        }

        System.out.println("\n*** Fase de pegar o dinheiro");
        int pagamento;
        while (true) {
            System.out.print("Senhor, quanto vai pagar pela compra? ");
            pagamento = sc.nextInt();
            if (pagamento >= totalCompra) break;
        }

        int troco = pagamento - totalCompra;

        System.out.println("\n*** Fase de Resultados");
        System.out.println("Total da compra.........: " + totalCompra);
        System.out.println("Total pago pelo cliente.: " + pagamento);
        System.out.println("Troco do cliente.........: " + troco);

        int notas100 = troco / 100;
        int resto = troco % 100;
        int notas10 = resto / 10;
        int notas1 = resto % 10;

        System.out.println("Notas de 100 do troco: " + notas100);
        System.out.println("Notas de 10 do troco.: " + notas10);
        System.out.println("Notas de 1 do troco..: " + notas1);

        sc.close();
    }
}
