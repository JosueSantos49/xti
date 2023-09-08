package br.com.xti.logica;

public class FluxoSwitchTecnologia {
	public static void main(String[] args){
		
		String tecnologia = "java";
		
		switch(tecnologia){
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Logica de Programacao");
				break;
			case "oracle":
			case "sqlserver":
			case "prostgresql":	
				System.out.println("Banco de Dados");
				break;
			default:
				System.out.println("Tecnologia Desconhecida");
		}
	}
}