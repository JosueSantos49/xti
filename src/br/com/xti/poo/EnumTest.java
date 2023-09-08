package br.com.xti.poo;

public class EnumTest {

	public static final double PI = 3.14;
	
	public static final double andar(Medida medida, int total){
		if(medida == Medida.M) {
			System.out.println("A medida é igual.");
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(PecaXadrez.BISPO);
		System.out.println(Medida.M.titulo);
		
		//percorer todas as constantes
		for(Medida m : Medida.values()) {
			System.out.println(m + ":" +m.titulo);
		}
		
		andar(Medida.M, 100);
	}

}
