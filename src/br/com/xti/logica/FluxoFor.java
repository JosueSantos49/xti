package br.com.xti.logica;

public class FluxoFor {
	public static void main(String[] args){
	
		String texto = "";
	
		//inicialização, teste, ação, atualização
		for(int i=0; i<20; i++){
			//resto da divisão para imprimir numeros pares
			if(i % 2 == 0){
				texto += i + ",";
			}
		}
		System.out.println(texto);
	}
}