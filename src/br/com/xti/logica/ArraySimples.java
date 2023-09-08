package br.com.xti.logica;

/*
* Array coleções de dados conectados (conjuntos indexados de informações)
*/
import java.util.Arrays;

public class ArraySimples {
	
	public static void main(String[] args) {
				
		String[] paises = {"Brasil", "Russia", "India", "China"};		
		System.out.println(paises[0]);
		
		//alterando o valor do indice
		paises[0] = "BRASIL";
		System.out.println(paises[0]);
		System.out.println("Quantidade de elementos do Array: "+paises.length);
		
		//apresentar os valores do array
		System.out.println(Arrays.toString(paises));
		
		//pesquisa dentro do array
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println("Posicao do elemento do Array: "+posicao);
		
		//ordenacao do array da primeira posicao ate a ultima
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {13.35, 3456.3456};
		System.out.println("Valor do array na posicao: "+valores[1].doubleValue());
	}
}