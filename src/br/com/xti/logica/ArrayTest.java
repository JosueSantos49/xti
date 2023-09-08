package br.com.xti.logica;

public class ArrayTest {
	public static void main(String[] args){
		
		System.out.println("Trabalhando com Array");
		String[] pessoas = {"Maria", "Evandro", "Bruna"};
		
		System.out.println("Tamanho do Array: "+pessoas.length);
		System.out.println("Conteudo do Array: "+pessoas.toString());
		System.out.println("Conteudo da posicao 2: "+pessoas[2]);
		
		String[][] cadastrar = 
		{
			{"Maria", "56", "RJ"}, 
			{"Evandro", "70", "SP"},
			{"Bruna", "32", "RJ"}
		};
		System.out.println(cadastrar.length);
		System.out.println(cadastrar[2][0]);
		
		int[][] saldo = 
		{
			{10, 20},
			{5, 30}
		};
		int x;
		x = saldo[0][0] + saldo[1][1];
		System.out.println(saldo[0][0]);
		System.out.println(saldo[1][1]);
		System.out.println(x);
	}
}