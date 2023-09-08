package br.com.xti.logica;

public class FluxoForeach {
	public static void main(String[] args){
	
		int[] numerosPares = {2,4,6,8};
		//for tradicional
		for(int i=0; i<numerosPares.length; i++){
			int par = numerosPares[i];
			System.out.println(par);
		}
		
		//for aprimorado (só vai para frente)
		for(int par : numerosPares){
			System.out.println(par);
		}
	}
}