package br.com.xti.logica;

public class FluxoTesteIdade {
	public static void main(String[] args) {
		
		int idade = 70;
		
		if(idade <= 11) {
			System.out.println("Crianca");
		}else if (idade >11 && idade <= 18){
			System.out.println("Adolescentoe");
		}else if (idade > 18 && idade <= 60){
			System.out.println("Adulto");
		}else {
			System.out.println("Melhor Idade");
		}
	}
}