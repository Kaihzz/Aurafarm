import java.util.Scanner;
public class alg {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//inicia Scanner
    byte oP = 0; //opção
    double lD1 = 0; // lado 1
    double lD2 = 0; // lado 2 
    double lD3 = 0; // lado 3 (caso do triangulo)
    double al = 0;// altura do triangulo
    double bs = 0;// base do triangulo
    double pR = 0;//perimetro
    double aR = 0;//area 
    double pI = 3.14;

    System.out.print(" # Escolha a forma geométrica\n\n");
    System.out.println("  1 . Retângulo;\n  2. Círculo;\n  3. Quadrado;\n  4. Triângulo;\n");
    //exibe o menu
    System.out.print(" Insira a opção :");
    oP = sc.nextByte();

    switch (oP){
        case 1:{
            //Retângulo
            System.out.print("\n  Digite a altura: ");
            lD1 = sc.nextInt();
            System.out.print("\n  Digite o comprimento: ");
            lD2 = sc.nextInt();
            aR = lD1 * lD2;
            pR = (lD1 * 2) + (lD2 * 2);
            System.out.printf("\n a área do retângulo é %.2d e o perimetro é %.1d. ", aR, pR);
            break;
        }
        case 2:{
            //Circulo
            System.out.print("\n  Digite o raio do circulo: ");
            lD1 = sc.nextInt();
            aR = lD1 * lD1 * (pI * 2);
            pR = (pI * 2) * lD1;
            System.out.printf("\n a área do circulo é %.2d e o perimetro é %.1d. ", aR, pR);
            break;
        }
        case 3:{
            //Quadrado
            System.out.print("\n  Digite o lado: ");
            lD1 = sc.nextInt();
            aR = lD1 * lD1;
            pR = lD1 * 4;
            System.out.printf("\n a área do quadrado é %.2d e o perimetro é %.1d. ", aR, pR);
            break;
        }
        case 4:{
            //Triângulo
            System.out.print("\n  Digite a altura: ");
            al = sc.nextInt();
            System.out.print("\n  Digite a base: ");
            bs = sc.nextInt();
            System.out.print("\n  Digite o lado 1: ");
            lD1 = sc.nextDouble();
            System.out.print("\n  Digite o lado 2: ");
            lD2 = sc.nextDouble();
            System.out.print("\n  Digite o lado 3: ");
            lD3 = sc.nextDouble();
            aR = ((al * bs) / 2);
            pR = lD1 + lD2 + lD3;
            System.out.printf("\n a área do retângulo é %.2d e o perimetro é %.1d. ", aR, pR);
            break;
        }
        default:{
            System.out.print("opção inválida");
            break;
        }
        
    }



sc.close();
}
}
