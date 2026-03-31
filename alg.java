//Pedro Henrique Sampaio da Silva 
import java.util.Scanner;
public class aura {
    public static double calcAr (double al, double bs){
        return al * bs;
    }
    public static double calcCr (double ld1){
        return (ld1 * ld1) * Math.PI;
    }
    public static double calcT(double al, double bs){
        return (al * bs) / 2;
    }
    public static double prR(double al, double bs){
        return (al * 2) + (bs * 2);
    }
    public static double prQ(double ld1){
        return ld1 * 4;
    }
    public static double prC(double ld1){
        return (2 * Math.PI) * ld1; 
    }
    public static double prT(double ld1, double ld2, double ld3){
        return ld1 + ld2 + ld3;
    }
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
    double arcomp = 0;
    double prcomp = 0;
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
            al = sc.nextDouble();//insire o valor da altura
            System.out.print("  Digite o comprimento: ");
            bs = sc.nextDouble();//insere o valor do comprimento
            ar = calcAr(al, bs);
            arcomp = ar + arcomp;
            pr = prR(al, bs);
            prcomp = pr + prcomp;
            System.out.printf("\n A área do retângulo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 2:{
            //calculo do Circulo
            System.out.println("\n Você escolheu a opção círculo");
            System.out.print("\n  Digite o raio do círculo: ");
            ld1 = sc.nextDouble();//insere o valor do raio
            ar = calcCr(ld1);
            arcomp = ar + arcomp;
            pr = prC(ld1);
            prcomp = pr + prcomp;
            System.out.printf("\n A área do círculo é %,.2f e o perimetro é %,.1f. \n", ar, pr);
            break;
        }
        case 3:{
            //calculo do Quadrado
            System.out.println("\n Você escolheu a opção quadrado");
            System.out.print("\n  Digite o lado: ");
            ld1 = sc.nextDouble();//insere o valor do lado
            al = ld1;
            bs = ld1;
            ar = calcAr(al, bs);
            arcomp = ar + arcomp;
            pr = prQ(ld1);
            prcomp = pr + prcomp;
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
            ar = calcT(al, bs);
            arcomp = ar + arcomp;
            pr = prT(ld1, ld2, ld3);
            prcomp = pr + prcomp;
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
        System.out.printf("\n  Forma geométrica : Área = %,.2f | Perímetro = %,.1f",arcomp, prcomp);

    
    System.out.println("\n  Programa finalizado com sucesso!");

sc.close();
}
}
