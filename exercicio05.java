package atvs_linguagem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("000");
        DecimalFormat dfPercent = new DecimalFormat("#0.00%");

        int canal;
        int pessoas;
        int totalPessoas = 0;
        int somaGlobo = 0, somaSBT = 0, somaRecord = 0;
        int contadorCasa = 0;

        System.out.println("*** Abaixo os dados dos canais");
        System.out.println("Globo.: Canal 4   SBT...: Canal 5   Record: Canal 7\n");
        System.out.println("*** Fase da pesquisa nas residências");

        while (true) {
            contadorCasa++;
            System.out.println("*** Pergunta para a casa n° " + contadorCasa + ":");
            System.out.print("Qual canal está assistindo........? ");
            canal = sc.nextInt();

            if (canal == 0) break;

            if (canal == 4 || canal == 5 || canal == 7) {
                System.out.print("Quantas pessoas estão assistindo? ");
                pessoas = sc.nextInt();

                totalPessoas += pessoas;

                if (canal == 4) somaGlobo += pessoas;
                else if (canal == 5) somaSBT += pessoas;
                else if (canal == 7) somaRecord += pessoas;
            } else {
                System.out.println("-> Este canal é inválido. Pesquisa não será computada!\n");
            }
        }

        System.out.println("\n*** Resultados do programa");
        if (totalPessoas > 0) {
            System.out.println("Globo.: " + df.format(somaGlobo) + " pessoas de " + totalPessoas + ". " +
                    dfPercent.format(somaGlobo / (double) totalPessoas) + " de audiência");
            System.out.println("SBT...: " + df.format(somaSBT) + " pessoas de " + totalPessoas + ". " +
                    dfPercent.format(somaSBT / (double) totalPessoas) + " de audiência");
            System.out.println("Record: " + df.format(somaRecord) + " pessoas de " + totalPessoas + ". " +
                    dfPercent.format(somaRecord / (double) totalPessoas) + " de audiência");
        } else {
            System.out.println("Nenhuma pesquisa válida foi realizada.");
        }

        sc.close();
    }
}
