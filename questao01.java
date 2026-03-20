package atvs_linguagem;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        //Digitacao para colocar os conteduso
        // as string para adiciona o notaString e as outras,dps ler o teclado
        // os system pra coloca o texto com ln pra quebra linha
        
        System.out.println("*** Começo da entrevista\n");

        System.out.print("Qual foi sua nota..? ");
        String notaString = sc.nextLine();

        System.out.print("Qual foi o conceito? ");
        String conceitoString = sc.nextLine();

        System.out.println("\n*** Fim da entrevista\n");
        
       
        
        //essa parte e pra saber se tacerto as info e valores adicionados
        // Extrair o valor numérico da nota
        // O número pode estar com vírgula ou ponto
       // Formato esperado: "Eu tirei 90 pontos." ou "Eu tirei 89,99 pontos."
        
        String[] partesNota = notaString.split(" ");
        String numeroStr = partesNota[2].replace(',', '.');
        
        if (numeroStr.endsWith(".")) {
            numeroStr = numeroStr.substring(0, numeroStr.length() - 1);  
        }
        
        
        double nota = Double.parseDouble(numeroStr);

        // Extrair o conceito (última palavra antes do ponto final)
        
        String[] partesConceito = conceitoString.split(" ");
        
        String conceito = partesConceito[partesConceito.length - 1];
        if (conceito.endsWith(".")) {
            conceito = conceito.substring(0, conceito.length() - 1);
        }
        
        //deixar o texto todo em LETRAS MAIÚSCULAS. usando o "toUpperCase();"
        //conceito e o testo q foi digitado
        
        conceito = conceito.toUpperCase();

        
        // Determinar o conceito esperado com base na nota
        // caulculo das nota com maior que e menor que
        
        String conceitoEsperado;
        
        if (nota >= 90.0) {
            conceitoEsperado = "A";
        } else if (nota >= 80.0) {
            conceitoEsperado = "B";
        } else if (nota >= 70.0) {
            conceitoEsperado = "C";
        } else if (nota >= 60.0) {
            conceitoEsperado = "D";
        } else {
            conceitoEsperado = "E";
        }
        

        // Verificar compatibilidade
        if (!conceito.equals(conceitoEsperado)){
        	
            		System.out.println("Caro aluno. Esta nota não é compatível com o conceito. Você deve estar enganado!");
        } else 
        
        {

            // Mensagem conforme o conceito
        	// printf pra adicionar os valor com % com float(se caso tiver) e string usados, usando o ".2" pra pegar os 2 nrm dps da virgula
        	//os case pra "caso foi isso imprime isso caso for outra coisa, impeimi outra coisa"
        	//parte final q define o resultado de desempenho se foi bom ou precsia melhora
            // os break pra parar se caso for true o valor adicionado ´para o sistema e sai do bloco

            switch (conceito) {
                case "A":
                    System.out.printf("Nota %.2f e conceito %s são ótimos desempenhos. Parabéns!\n", nota, conceito);
                    break;
                case "B":
                    System.out.printf("Nota %.2f e conceito %s são bons desempenhos. Parabéns!\n", nota, conceito);
                    break;
                case "C":
                    System.out.printf("Nota %.2f e conceito %s são desempenhos medianos. Seria bom que melhorasse!\n", nota, conceito);
                    break;
                case "D":
                    System.out.printf("Nota %.2f e conceito %s são desempenhos baixos. Precisa melhorar!\n", nota, conceito);
                    break;
                case "E":
                    System.out.printf("Nota %.2f e conceito %s são desempenhos ruins. Você está reprovado!\n", nota, conceito);
                    break;
            }
            
        }
        
        //encerrar o uso do Scanner depois que você terminou de usar ele.
        sc.close();
    }
}