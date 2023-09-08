package br.com.xti.logica;

public class TipoPrimitivo {
	public static void main(String[] args) {
	
		int idade = 31;
		double preco = 12.45;
		char sexo = 'M';
		boolean casado = false;
		
		byte b = 127;//cem
		short s = 32767;//32 mil
		int i = 2000000000;//2 bilhões
		long l = 9000000000000000000L;//9 quintilhões				
		double d = 1.7976931348623157E+308;//IEEE 754
		float f = 123F;
		
		//representar na forma binária
		byte bb = 0b01010101;//8 bits/ 1 byte
		short ss = 0b0101010101010101;//16 bits/ 2 byte
		int ii = 0b01010101010101010101010101010101;//32 bits/ 4 byte
		
		//Exemplo de Cast Implícito
		i = s;
		System.out.println(s);
		System.out.println(i);
		
		//Exemplo de Cast Explícito (assumindo que pode ter perdas)
		i = (int) l;
		System.out.println(l);
		System.out.println(i);
		
	}
}