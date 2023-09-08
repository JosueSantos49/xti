package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		/*
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.soma(10, 20);
		System.out.println(so);
				
		double som = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(som);
		
		double total = m.soma2("Número: ", 10, 100, 150);
		System.out.println(total);
		*/

		System.out.println(m.mediaExemplo(5, 3));		
		System.out.println(m.mediaExemplo("50", "30"));
		System.out.println(m.mediaExemplo(5, 3, 34, 56));
	}

}
