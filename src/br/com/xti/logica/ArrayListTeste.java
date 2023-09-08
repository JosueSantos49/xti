package br.com.xti.logica;
/*
* Collection Framework ArrayList
*/
import java.util.ArrayList;

public class ArrayListTeste {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Azul");
		
		System.out.println(cores.toString());
		System.out.println("Tamanho:" +cores.size());
		System.out.println("Elemento 2: "+cores.get(2));
		System.out.println("Indice da cor Verde: "+cores.indexOf("Verde"));
		
		cores.remove("Azul");
		System.out.println("Tem preto? "+cores.contains("Preto"));
		
	}
}

