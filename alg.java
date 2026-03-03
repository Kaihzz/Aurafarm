//Pedro Henrique Sampaio da Silva :-:
import java.util.Scanner;
public class alg {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//inicia Scanner
    byte oP = 0; //opção
    double ld1 = 0; // lado 1
    double ld2 = 0; // lado 2 
    double ld3 = 0; // lado 3 (caso do triangulo)
    double al = 0;// altura do triangulo
    double bs = 0;// base do triangulo
    double pr = 0;//perimetro
    double ar = 0;//area
    boolean c = true;
    //inicio do programa
    System.out.print(" # Escolha a forma geométrica\n\n");
    while(c){
    System.out.println("\n  1. Retângulo;\n  2. Círculo;\n  3. Quadrado;\n  4. Triângulo;\n  5. Fechar Programa;");
    //exibe o menu e inicia o while

    System.out.print("\n\n Insira a opção: ");
    oP = sc.nextByte();

    switch (oP){
        case 1:{
            //calculo de Retângulo
            System.out.println("\n Você escolheu a opção retângulo");
            System.out.print("\n  Digite a altura: ");
            ld1 = sc.nextDouble();
            System.out.print("  Digite o comprimento: ");
            ld2 = sc.nextDouble();
            ar = ld1 * ld2;
            pr = (ld1 * 2) + (ld2 * 2);
            System.out.printf("\n A área do retângulo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 2:{
            //calculo do Circulo
            System.out.println("\n Você escolheu a opção círculo");
            System.out.print("\n  Digite o raio do círculo: ");
            ld1 = sc.nextDouble();
            ar = ld1 * ld1 * Math.PI;
            pr = (Math.PI * 2) * ld1;
            System.out.printf("\n A área do círculo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 3:{
            //calculo do Quadrado
            System.out.println("\n Você escolheu a opção quadrado");
            System.out.print("\n  Digite o lado: ");
            ld1 = sc.nextDouble();
            ar = ld1 * ld1;
            pr = ld1 * 4;
            System.out.printf("\n A área do quadrado é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 4:{
            //calculo do Triângulo
            System.out.println("\n Você escolheu a opção triângulo");
            System.out.print("\n  Digite a altura: ");
            al = sc.nextDouble();
            System.out.print("  Digite a base: ");
            bs = sc.nextDouble();
            System.out.print("  Digite o lado 1: ");
            ld1 = sc.nextDouble();
            System.out.print("  Digite o lado 2: ");
            ld2 = sc.nextDouble();
            System.out.print("  Digite o lado 3: ");
            ld3 = sc.nextDouble();
            ar = ((al * bs) / 2);
            pr = ld1 + ld2 + ld3;
            System.out.printf("\n  A área do triângulo é %,.2f e o perimetro é %,.1f \n", ar, pr);
            break;
        }
        case 5:{
            System.out.println("\n  Fechando o programa . . .");
            c = false;
            break;
        }
        default:{
            //define a opção incorreta
            System.out.print("  opção inválida\n");
            break;
        }
        
    }
}


sc.close();
}
}
