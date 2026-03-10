//Pedro Henrique Sampaio da Silva 
import java.util.Scanner;
public class alg {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//inicia Scanner
    int qtd = 0; //quantidade de formas geométricas
    byte oP = 0; //opção
    double ld1 = 0; // lado 1 (caso do triângulo)
    double ld2 = 0; // lado 2 (caso do triângulo)
    double ld3 = 0; // lado 3 (caso do triangulo)
    double al = 0;// altura do triangulo
    double bs = 0;// base do triangulo
    double pr = 0;//perimetro
    double ar = 0;//area
    int i = 0;//contador
    double[] arR = new double[i];//array para armazenar as áreas das formas geométricas
    double[] prR = new double[i];//array para armazenar os perímetros dos formas geométricas
    //inicio do programa
    System.out.println("==== Calculadora de área e perímetro de formas geométricas ====");
    System.out.println("\n==============================================");
    System.out.print("\n\n Quantas formas geométricas deseja calcular? ");
    qtd = sc.nextInt();//insere a quantidade de formas geométricas a serem calculadas

    for (i = 0; i < qtd; i++) {//iFor
    System.out.print("\n # Escolha a forma geométrica\n\n");
    
    System.out.println("\n  1. Retângulo;\n  2. Círculo;\n  3. Quadrado;\n  4. Triângulo;\n  5. Fechar Programa;");
    //exibe o menu e inicia o while
    System.out.print("\n\n Insira a opção: ");
    oP = sc.nextByte();

    switch (oP){//iSwitch
        case 1:{
            //calculo de Retângulo
            System.out.println("\n Você escolheu a opção retângulo");
            System.out.print("\n  Digite a altura: ");
            ld1 = sc.nextDouble();//insire o valor da altura
            System.out.print("  Digite o comprimento: ");
            ld2 = sc.nextDouble();//insere o valor do comprimento
            ar = ld1 * ld2;
            arR[i] = ar;
            pr = (ld1 * 2) + (ld2 * 2);
            prR[i] = pr;
            System.out.printf("\n A área do retângulo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 2:{
            //calculo do Circulo
            System.out.println("\n Você escolheu a opção círculo");
            System.out.print("\n  Digite o raio do círculo: ");
            ld1 = sc.nextDouble();//insere o valor do raio
            ar = ld1 * ld1 * Math.PI;
            arR[i] = ar;
            pr = (Math.PI * 2) * ld1;
            prR[i] = pr;
            System.out.printf("\n A área do círculo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 3:{
            //calculo do Quadrado
            System.out.println("\n Você escolheu a opção quadrado");
            System.out.print("\n  Digite o lado: ");
            ld1 = sc.nextDouble();//insere o valor do lado
            ar = ld1 * ld1;
            arR[i] = ar;
            pr = ld1 * 4;
            prR[i] = pr;
            System.out.printf("\n A área do quadrado é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 4:{
            //calculo do Triângulo
            System.out.println("\n Você escolheu a opção triângulo");
            System.out.print("\n  Digite a altura: ");
            al = sc.nextDouble();//insere o valor da altura
            System.out.print("  Digite a base: ");
            bs = sc.nextDouble();//insere o valor da base
            System.out.print("  Digite o lado 1: ");
            ld1 = sc.nextDouble();//insere o valor do lado 1
            System.out.print("  Digite o lado 2: ");
            ld2 = sc.nextDouble();//insere o valor do lado 2
            System.out.print("  Digite o lado 3: ");
            ld3 = sc.nextDouble();//insere o valor do lado 3
            ar = ((al * bs) / 2);
            arR[i] = ar;
            pr = ld1 + ld2 + ld3;
            prR[i] = pr;
            System.out.printf("\n  A área do triângulo é %,.2f e o perimetro é %,.1f \n", ar, pr);
            break;
        }
        case 5:{
            //fechar o programa
            System.out.println("\n  Fechando o programa . . .");
            i = qtd; //fecha o programa, igualando o contador a quantidade de formas geométricas
            break;
        }
        default:{
            //define a opção incorreta
            System.out.print("\n  opção inválida\n");
            break;
        }
        
    }//eSwitch
}//Efor
    for(i = 0; i < qtd; i++){
        System.out.printf("\n  Forma geométrica %d: Área = %,.2f | Perímetro = %,.1f", (i + 1), arR[i], prR[i]);

    }
    System.out.println("\n  Programa finalizado com sucesso!");

sc.close();
}
}
