package br.com.xti.logica;

public class Operador {
	public static void main(String[] args) {
		//2 + 3 operador binário
		//-2 operador unário
		//true ? "sim" : "não" operador ternário
		
		//int x = 7 + 3;
		//String x = "9" + "4";
		//double x = 7 * 3;
		//double x = 7 - 3;
		//double x = 7 % 3;//retorna o resto da divisão
		//double x = +3;//deixa mas claro que é um numero positivo
		//double x = -3;//muda o sinal do valor
		//double x = -(-3);
		
		int x = 6;
		//int y = x++;//pós-incrementado -> mesma coisa que: x = x + 1
		//int y = x--;//pós-incrementado -> mesma coisa que: x = x - 1
		//System.out.println((x >= 1) && (x <= 10));
		//System.out.println((x >= 1) || (x <= 10));
		//System.out.println(!(x >= 1));
		
		x = x + 3;//igual -> x +=3;
		x = x - 3;//igual -> x -= 3;
		x = x * 3;//igual -> x *=3;
		x = x / 3;//igual -> x /=3;
		x = x % 3;//igual -> x %=3;
		System.out.println(x);				
	}
}