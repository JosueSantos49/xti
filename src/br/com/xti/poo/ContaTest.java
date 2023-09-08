package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setCliente("Josué da Conceição");
		conta.setSaldo(10000.00);
		conta.exibeSaldo();
		
		/*
		conta.saca(1000);
		conta.exibeSaldo();
		
		conta.deposita(500);
		conta.exibeSaldo();
		*/
		
		Conta destino = new Conta();
		destino.setCliente("Marcos");
		destino.setSaldo(8000.00);
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
