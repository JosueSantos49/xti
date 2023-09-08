package br.com.xti.heranca;

public class OperacaoMatematicaTest {

	public static void calcular(OperacaoMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
	public static void calcularSemPolimorfismo(String o, double x, double y) {
		if(o.equals("Soma")) {
			System.out.println(x + y);
		} else if(o.equals("Multiplicacao")) {
			System.out.println(x * y);
		}
	}
	
	public static void main(String[] args) {
		calcular(new Soma(), 5, 5);
		calcular(new Multiplicacao(), 5, 5);
	}

}
