package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class FluxoDoWhileProduto{ 
	public static void main(String[] args){
	
		//coleta uma lista de produtos informados pelo usuario

		//colocar todos os produtos da lista de usuários
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus Produtos : Para sair digite FIM");
		
		//coletar o produto enquanto a palavra digitada for diferente de FIM 
		String produto;
				
		//executar a operação varias vezes
		while(!"FIM".equals(produto = s.nextLine())){
			//adicionar a lista de produto este produto que foi digitado pelo usuário 
			produtos.add(produto);
		}		
		System.out.println("lista: "+produtos.toString());
	}
}