package br.com.xti.poo;

public enum Medida {

	MM("Milímetro"), CM("Centímetro"), M("Metro");
	
	public String titulo;
	
	//construtor
	Medida(String titulo){
		this.titulo = titulo;
	}
}
