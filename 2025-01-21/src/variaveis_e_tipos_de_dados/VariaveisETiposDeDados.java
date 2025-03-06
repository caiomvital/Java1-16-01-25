package variaveis_e_tipos_de_dados;

public class VariaveisETiposDeDados {

	public static void main(String[] args) {
		
		//tipos de dados
		//tipos numericos
		//int e double
		int tipoInteiro = 10;
		double tipoReal = 9.9;
		//tipo textual
		//String
		String tipoString = "Tadeu Silva Nogueira";
		//tipo logico
		//boolean
		boolean logico = true; //ou false
		
		//operadores aritmeticos
		// +, -, *, /, %
		int val1 = 3, val2 = 3;
		int soma = val1 + val2;
		int subt = val1 - val2;
		int mult = val1 * val2;
		double div = val1 / (double)val2;
		
		System.out.println("Soma: " + soma); // 11
		System.out.println("Subtração: " + subt); // 5
		System.out.println("Multiplicação: " + mult); // 24
		System.out.println("Divisão: " + div); // 2.6
		
		double media = ((double)val1 + val2) / 2;
		System.out.println(media);
		media = 8;
		media = 9;
		media = 10;
		media = 0;
		//operadores relacionais
		//>, <, >=, <=, ==, !=
		boolean aprovado = media >= 7;
		System.out.println(aprovado);
		int valInt = 10;
		double valDouble = Math.round(9.4);
		System.out.println(valDouble);
		boolean igualA = valInt == valDouble;
		System.out.println(igualA);
		
		media = 10;
		double nota1, nota2;
		nota1 = 9;
		nota2 = 10;
	
		double mediaPrimeiroSemestre = media;
		double mediaSegundoSemestre = (nota1 + nota2) / 2;
		boolean laureado = (mediaPrimeiroSemestre 
				+ mediaSegundoSemestre) / 2 == 10;
		
		boolean recebeuPremio = media == 10 && laureado;
		System.out.println(recebeuPremio);
		
		
	}

}
