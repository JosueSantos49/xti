package br.com.xti.logica;

public class AutoBoxing {
	public static void main(String[] args){
	
		//exemplo 1
		/*
		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desempacotar
		a++;//incrementa
		x = new Integer(a);//reempacota
		System.out.println(x.intValue());*/
		
		//exemplo 2
		Integer x = 555;
		x++;//desempacotar, incrementa, reempacota
		System.out.println(x);
	}
}