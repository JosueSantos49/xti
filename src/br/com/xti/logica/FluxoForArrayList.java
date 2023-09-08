package br.com.xti.logica;

import java.util.ArrayList;

public class FluxoForArrayList {
	public static void main(String[] args){
		
		//preencher o ArrayList com os numeros que vai atualizar dentro do for
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
				list.add(i);
		}
		
		//Apresentar os numeros no foreach
		for(Integer numero : list){
			System.out.println(numero);
		}
	}
}