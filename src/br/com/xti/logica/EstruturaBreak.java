package br.com.xti.logica;

public class EstruturaBreak{
	public static void main(String[] args){
		
		//quebra a execução do fluxo
		//exemplo 1
		while(true){
			System.out.println("Entrou");
			break;
		}
		
		//exemplo 2
		for(int i=0; i<10; i++){
			if(i == 5){
				continue;//pula a execução (interação atual)
			}
			System.out.println(i);
		}
	}
}