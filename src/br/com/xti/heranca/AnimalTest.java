package br.com.xti.heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		toto.equals(carijo);
		toto.hashCode();
		toto.getClass();
		toto.toString();*/
		
		Animal toto = new Cachorro();
		toto.fazerBarulho();
		
		Animal carijo = new Galinha();
		carijo.fazerBarulho();
	}

}
