package br.com.xti.logica;

public class FluxoTesteNota {
	public static void main(String[] args) {
		
		//fluxo aninhado if dentro de outro if ou dentro de else
		int nota = 6;
		if(nota >= 7) {
			System.out.println("Passou");
		}else {
			System.out.println("Reprovou");
			if(nota >= 6){
				System.out.println("mais pode fazer a recuperacao");
			}
		}
	}
}