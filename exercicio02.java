package atvs_linguagem;
import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosZezinho = 0, votosHuguinho = 0, votosLuizinho = 0, votosJoãozinho = 0;
        int votosNulos = 0, votosBrancos = 0;
        String voto;

        System.out.println("Fase da digitação");
        while (true) {
            System.out.print("Em quem você vai votar? ");
            voto = sc.nextLine().trim().toLowerCase();

            if (voto.equals("fim")) break;

            switch (voto) {
                case "zezinho":
                    votosZezinho++;
                    break;
                case "huguinho":
                    votosHuguinho++;
                    break;
                case "luizinho":
                    votosLuizinho++;
                    break;
                case "joaozinho":
                    votosJoãozinho++;
                    break;
                case "nulo":
                    votosNulos++;
                    break;
                case "branco":
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto inválido");
            }
        }

        int totalValidos = votosZezinho + votosHuguinho + votosLuizinho + votosJoãozinho;
        int totalGeral = totalValidos + votosNulos + votosBrancos;

        System.out.println("\nFase dos resultados");
        System.out.println("Total de votos válidos: " + totalValidos);
        System.out.printf("Quantidade de votos e percentual de Zezinho...: %d %.2f%%\n",
                votosZezinho, totalGeral == 0 ? 0 : (votosZezinho * 100.0 / totalGeral));
        System.out.printf("Quantidade de votos e percentual de Luizinho.: %d %.2f%%\n",
                votosLuizinho, totalGeral == 0 ? 0 : (votosLuizinho * 100.0 / totalGeral));
        System.out.printf("Quantidade de votos e percentual de Joãozinho: %d %.2f%%\n",
                votosJoãozinho, totalGeral == 0 ? 0 : (votosJoãozinho * 100.0 / totalGeral));
        System.out.printf("Quantidade de votos e percentual de Hughinho.: %d %.2f%%\n",
                votosHuguinho, totalGeral == 0 ? 0 : (votosHuguinho * 100.0 / totalGeral));
        System.out.printf("Quantidade de votos e percentual de Nulos....: %d %.2f%%\n",
                votosNulos, totalGeral == 0 ? 0 : (votosNulos * 100.0 / totalGeral));
        System.out.printf("Quantidade de votos e percentual de Brancos..: %d %.2f%%\n",
                votosBrancos, totalGeral == 0 ? 0 : (votosBrancos * 100.0 / totalGeral));

        System.out.println("\nPublicação do candidato eleito");
        if (votosZezinho > votosHuguinho && votosZezinho > votosLuizinho && votosZezinho > votosJoãozinho) {
            System.out.println("-> Zezinho é o candidato eleito democraticamente");
        } else if (votosHuguinho > votosZezinho && votosHuguinho > votosLuizinho && votosHuguinho > votosJoãozinho) {
            System.out.println("-> Huguinho é o candidato eleito democraticamente");
        } else if (votosLuizinho > votosZezinho && votosLuizinho > votosHuguinho && votosLuizinho > votosJoãozinho) {
            System.out.println("-> Luizinho é o candidato eleito democraticamente");
        } else if (votosJoãozinho > votosZezinho && votosJoãozinho > votosHuguinho && votosJoãozinho > votosLuizinho) {
            System.out.println("-> Joãozinho é o candidato eleito democraticamente");
        } else {
            System.out.println("-> Houve um empate");
        }

        sc.close();
    }
}
