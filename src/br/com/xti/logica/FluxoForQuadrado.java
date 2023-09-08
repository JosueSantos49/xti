package br.com.xti.logica;

public class FluxoForQuadrado {
	public static void main(String[] args){
		
		//criando um quadrado com *
		int tamanho = 5;
		for(int x=0; x<tamanho; x++){
			for(int i=0; i<tamanho; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}