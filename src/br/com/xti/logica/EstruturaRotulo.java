package br.com.xti.logica;

public class EstruturaRotulo{
	public static void main(String[] args){
	
		//localizar o valor true dentro da matriz 
		boolean[][] matrix =
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
		
		//Qual loop continuar ou parar. Rotulos são nomes que podem dar para a estrutura
		//for para percorer cada um dos elementos
		busca://rotulo para toda a pesquisa
		for(int a=0; a < matrix.length; a++){
			System.out.print("A ");
			
			//percorer todos os elementos dentro do indice (a)
			for(int b=0; b < matrix[a].length; b++){
				
				//localizar o elemnto dentro do array que tem o valor = true
				//se dentro do array da primeira dimensao o elemento que estou percorendo for true 
				if(matrix[a][b]){
					System.out.print("TRUE ");//quando localizar o valor True exibe
					break busca;
				}
				System.out.print("B ");
			}
		}
		
	}
}