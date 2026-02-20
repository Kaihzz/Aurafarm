package programaçãoL;

public class atividadeextra001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criação de variaveis
		byte by = 126;
		short sh = 130;
		int in = 164654321;
		long lg = 2147483648l;
		float fl = 99.9876f;
		double db = 7645321.12345678;
		boolean b1 = (10 < 30) && (31 < 30);
		boolean b2 = (10 < 30) || (31 < 30);
		boolean b3 = !((10 < 30) || (31 < 30));
		char c1 = 'A';
		char c2 = 65;
		String st = "Juliano";
		double Pf = 15000039.45678;
		
		// primeiro estágio - "print"
		System.out.print("**** Estágio 01 - Mostrando valores com a função 'print'");
		System.out.print("\n\n  Valor da variável'variavelByte001': " + by);
		System.out.print("\n  Valor da variavel 'variavelShor001': " + sh);
		System.out.print("\n  Valor da variavel 'variavelByte001': " + by);
		System.out.print("\n  Valor da variavel 'variavelInt001': " + in);
		System.out.print("\n  Valor da variavel 'variavelLong001': " + lg);
		System.out.print("\n  Valor da variavel 'variavelFloat001 (sem formato)':" + fl);
		System.out.print("\n  Valor da variavel 'variavelFloat001 (formato brasileiro)': " + dfBrasil(fl));
		System.out.print("\n  Valor da variavel 'variavelFloat001 (formato amerciano)': " + dfUSA(fl));
		System.out.print("\n  Valor da variavel 'variavelDouble001 (sem formato)': " + db);
		System.out.print("\n  Valor da variavel 'variavelDouble001 (formato brasileiro)': " + dfBrasil(db));
		System.out.print("\n  Valor da variavel 'variavelDouble001 (formato americano)': " + dfUSA(db));
		System.out.print("\n  Valor da variavel 'variavelBoolean001': " + b1);
		System.out.print("Valor da variavel 'variavelBoolean002': " + b2);
		
	}

}
