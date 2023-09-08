package br.com.xti.logica;

public class DesafioFibonacci{
	public static void main(String[] args){
		
		int anterior = 0, proximo = 1;
		System.out.println("Anterior: " +anterior);		
		
		for(int i=0; i<5; i++){

			System.out.println("Proximo: "+proximo);
		
			//proximo numero da serie mas novo = proximo antigo + numero anteriro 
			proximo = proximo + anterior;//proximo numero fibonacci
			anterior = proximo - anterior;//atualizando o numero anterior (soma - numero anterior)
		}
		
	}
}