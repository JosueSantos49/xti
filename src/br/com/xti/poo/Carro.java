package br.com.xti.poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;	
	double segundosZeroACem; //em quantos segundos esse veívulo atinge a velociade de 100 km por hora
	Motor motor;//composição
	
	//contrutor vazio
	public Carro() {}
	
	//construtor com variáveis inicializadas
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this(modelo, velocidadeMaxima, segundosZeroACem, null);
	}
	
	//construtor que permite inicializar o motor do veículo
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}
		
	
}
