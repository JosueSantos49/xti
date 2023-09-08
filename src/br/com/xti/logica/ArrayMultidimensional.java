package br.com.xti.logica;
//Array multidimensionais

public class ArrayMultidimensional {
	public static void main(String[] args){
		
		String[] arrayUmDimensoa = {"Ricardo", "Sandra"};
		
		String[][] arrayDuasDimensoes = 
		{
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "RJ"}
		};
		System.out.println(arrayDuasDimensoes[1][0]);
		
		//QTD de elementos dentro do Array 
		System.out.println(arrayDuasDimensoes.length);
		
		//QTD de elementos dentro do Array interno
		System.out.println(arrayDuasDimensoes[0].length);
		
		//alterar os valores de um array com varias dimensoes
		arrayDuasDimensoes[1][0] = "SANDRA";
		System.out.println(arrayDuasDimensoes[1][0]);
	}
}