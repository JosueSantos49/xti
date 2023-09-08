package br.com.xti.logica;

import java.util.Scanner;

public class CalcularDiametroCirculo {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio:");
		double raio = s.nextDouble();
		
		//Diâmetro : 2r
		//double raio = 10;//centimetro
		double diametro = 2 * raio;
		System.out.println("Diamentro="+diametro);
		
		//Circunferencia : 2 PI r 
		double pi = Math.PI;//constante matematica
		double circunferencia = 2 * pi * raio; 
		System.out.println("Circunferencia="+circunferencia);
		
		//Area de um circulo = PI r2
		double area = pi * (raio * raio);
		System.out.println("Area="+area);
	}
}