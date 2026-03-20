package atvs_linguagem;
import java.util.Scanner;

public class questao02  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Digitacao para colocar os conteduso
        // as string para adiciona o conceitoString ,dps ler o teclado
        // os system pra coloca o texto, com ln pra quebra linha e o normal pra digitar do lado
      
        
        System.out.println("*** Começo da entrevista\n");
        System.out.print("Qual foi o conceito? ");
        String conceitoString = sc.nextLine();
        System.out.println("\n*** Fim da entrevista\n");

        
        // Extrair o conceito (última palavra antes do ponto final)
        // if (conceito.endsWith(".")),Verifica se a palavra termina com ponto.	
   
        String[] partes = conceitoString.split(" ");
        String conceito = partes[partes.length - 1];
        if (conceito.endsWith(".")) 
        	
        {//Remove o último caractere da palavra.
            conceito = conceito.substring(0, conceito.length() - 1);
        }
        
        //deixar o texto todo em LETRAS MAIÚSCULAS. usando o "toUpperCase();"
        conceito = conceito.toUpperCase();
        

        // Switch para verificar o conceito
        //case pra "se caso for isso imprimi isso, se caso for outra coisa imprimi outra coisa"
        // os break pra parar se caso for true o valor adicionado ´para o sistema e sai do bloco
        
        switch (conceito) {
            case "A":
                System.out.println("Conceito A é um ótimo desempenho. Parabéns!");
                break;
            case "B":
                System.out.println("Conceito B é um bom desempenho. Parabéns!");
                break;
            case "C":
                System.out.println("Conceito C é um desempenho mediano. Seria bom que melhorasse!");
                break;
            case "D":
                System.out.println("Conceito D é um desempenho baixo. Precisa melhorar!");
                break;
            case "E":
                System.out.println("Conceito E é um desempenho ruim. Você está reprovado!");
                break;
            default:
                System.out.println("Esse conceito não é compatível com os conceitos existentes no IFRO. Você deve estar enganado!");
        }
        //encerrar o uso do Scanner depois que você terminou de usar ele.
        sc.close();
    }
}