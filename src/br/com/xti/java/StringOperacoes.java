package br.com.xti.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		//Formas de cria Strings
		String s1 = "Josué";//literal
		String s2 = s1 + "Conceição";//concatenando
		String s3 = new String("Santos Izidio");//metodo construtor
		
		//Através de um array de caracteres
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();
		char letra = s1.charAt(0);//0 a length() -1
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Izidio");
		int ultima = s3.lastIndexOf("o");
		boolean vazia = s3.isEmpty();
		//System.out.println(ultima);
		
		//COMPARAÇÃO
		String xti = "XTI";
		//boolean x = xti.equals("xti");
		//boolean x = xti.equalsIgnoreCase("xti");
		//boolean x = xti.startsWith("TI");
		boolean x = xti.endsWith("TI");
		//System.out.println(x);
		
		//int c = "amor".compareTo("bola");//-1
		//int c = "bola".compareTo("amor");//1
		//int c = "amor".compareTo("amor");//0
		//int c = "123".compareTo("234");		
		//System.out.println(c);
		
		String so = "Olhe, olhe";
		boolean o = so.regionMatches(true, 6,"Olhe", 0, 4);
		//System.out.println(o);
		
		//EXTRAÇÃO
		String l = "O Brasil é Lindo";
		String sl = l.substring(11);
		sl = l.substring(2, 8);//sobrecarga
		
		sl = l.concat(" que Maravilha");
		sl = l.replace('s', 'z');
		sl = l.replaceFirst(" ", "X");
		sl = l.replaceAll(" ", "X");
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		
		System.out.println("    espaços   ".trim());
	}

}
