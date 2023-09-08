package br.com.xti.logica;

public class VariavelReferencia {
	public static void main(String[] args){
		
		//Variável primitva (repositório para o dado)
		//Dentro da variável x temos o valor de x:
		//dado binário que representa o número 7
		int x = 7;
		x = 10;//substitui o valor de 7
		
		//Variável de Referência (continua sendo um repositório)
		//Seu conteúdo não contem o valor da variável, mas a referência
		String y = "Josue";//Este valor continua na memória, mas não está mas lincado
		y = "Josue Conceicao";
		y = null;//limpar a referência totalmente
	}
}