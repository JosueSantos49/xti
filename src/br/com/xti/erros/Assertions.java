package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número de 0 à 10: ");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <= 10) : "Número Inválido" + numero;
		System.out.println("Você entrou: "+numero);
	}

}
