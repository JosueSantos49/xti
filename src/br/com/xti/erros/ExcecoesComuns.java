package br.com.xti.erros;

import br.com.xti.heranca.Animal;
import br.com.xti.heranca.Cachorro;
import br.com.xti.poo.Galinha;

public class ExcecoesComuns {

	//static int[] arrayNull;//exemplo 1
	static int[] arrayNull = new int[0];//exemplo2
	
	public static void main(String[] args) {
		
		//NullPointerException
		//System.out.println(arrayNull.length);//acessar um objeto do tipo null
		
		//ArithmeticException
		//int x = 5 / 0;
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(arrayNull[3]);//acessar uma posição que não existe
		
		
		//tentar realizar um cast de um obj para outro e o obj não passa no teste de É-um
		//Animal a = new br.com.xti.heranca.Galinha();
		//Cachorro c = (Cachorro) a;
		
		//Tentar converter uma String(no formato desconhecido) em um numero pela classe de conversão
		//int inteiro = Integer.parseInt("x");
		
		
	}
}
