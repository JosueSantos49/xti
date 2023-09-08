package br.com.xti.logica;

public class FluxoSwitch {
	public static void main(String[] args){
		
		char sexo = 'F';
		
		switch(sexo) {
			case 'M':
				System.out.println("Masculino");
				break;
			case 'F':
				System.out.println("Feminino");
				break;
			default :
				System.out.println("Outro");
		}
	}
}