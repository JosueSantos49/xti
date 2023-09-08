package br.com.xti.logica;

public class OperadorEspecial {
	public static void main(String[] args){
		
		int idade = 26;
		String x = (idade >= 18) ? "Maior de idade" : "Menor de Idade";//operador ternário
		String sexo = "M", pais = "Brasil";//operador virgula (variáveis do mesmo tipo)
		System.out.println(x);
	}
}