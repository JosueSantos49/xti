package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		//forma tradicional construtor vazio
		ferrari.modelo = "Ferrari X";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;//adiciona o motor ao carro
		
		//com construtor inicializado
		Carro gol = new Carro("Gol G3", 180, 3.2);
		Motor v8 = new Motor("V8", 1018);
		gol.motor = v8;
		
		Carro toyota = new Carro("Picape 4x4", 430, 2.2, new Motor("w16", 1200));
		
		System.out.println(toyota.modelo);
		System.out.println(toyota.motor.potencia);
	}

}
