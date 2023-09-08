package br.com.xti.poo;

public class Matematica {

	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
	}
	
	//Exemplo 1
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
	
	//Exemplo 2
	//Indica uma lista de numeros quando chamar o método
	//realiza a soma de um numero indeterminado de argumento
	double soma2(String titulo, double ... numeros) {
		System.out.println(titulo);
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	//realiza a soma de um numero indeterminado de argumento
	double soma3(double ... numeros) {
			double total = 0;
			for(double n : numeros) {
				total += n;
			}
			return total;
	}
	
	double mediaExemplo(int x, int y) {
		System.out.print("media(int x, int y) ");
		return (x + y) / 2;
	}
	
	//método sobrecarregado
	double mediaExemplo(String x, String y) {
		System.out.print("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int yx = Integer.parseInt(y);
		return (ix + yx) / 2;
	}
	
	//recebe um numero ilimitado de argumento e calcula a média
	double mediaExemplo(double ... numeros) {
		System.out.print("media(double ... numeros) ");
		return this.soma3(numeros)/numeros.length;
	}
	
}
