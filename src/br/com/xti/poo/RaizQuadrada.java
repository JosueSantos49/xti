package br.com.xti.poo;

public class RaizQuadrada {

	int impar, raiz = 0;
	
	//Exemplo 1
	int raiz(int numero) {		
		for(int impar = 1; impar <= numero; impar += 2) {
			numero -= impar;
			raiz++;
			System.out.println("Número: "+ numero + " impar: " + impar);
		}
		return raiz;
	}
	
	//Exemplo 2
	int raizExemplo(int numero) {
		while(numero >= impar) {
			numero -= impar;
			impar += 2;//proximo numero impar
			++raiz;
		}
		return raiz;
	}
}
