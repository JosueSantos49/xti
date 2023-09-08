package br.com.xti.logica;

public class FluxoCondicional {
	public static void main(String[] args){
		
		//verificar se o numero e par
		int numero = 11;
		if((numero % 2) == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}