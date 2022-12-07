
public class ConcatElements {

	public static void main(String[] args) {
		//%f = ponto flutuante
		//%d = int
		//%s = String
		//%n = quebra de linha
		
		int number1 = 10;
		System.out.println("RESULTADO = " + number1 + " Metros");
		
		double number2 = 10.29348539;
		System.out.printf("RESULTADO = %.2f metros%n", number2);
		System.out.printf("RESULTADO = %.5f metros%n", number2);
		
		String name = "Mauricio";
		int idade = 29;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", name, idade, renda);
	}

}
