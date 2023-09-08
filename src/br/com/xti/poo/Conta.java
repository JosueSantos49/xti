package br.com.xti.poo;

public class Conta {

	private String cliente;
	private double saldo;
	
	public Conta(){}
	public Conta(String cliente, double saldo){
		this.setCliente(cliente);
		this.setSaldo(saldo);
	}
	
	public void exibeSaldo() {
		System.out.println(getCliente() + " seu saldo é " + getSaldo());
	}
	
	public void saca(double valor) {				
		setSaldo(getSaldo() - valor);//deduzir o saldo do valor do saque		
	}
	
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);//adicionar ao saldo o valor que foi depositado
	}
	
	public void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
