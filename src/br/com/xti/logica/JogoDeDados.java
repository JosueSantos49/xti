package br.com.xti.logica;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class JogoDeDados {
	public static void main(String[] args){
		
		//Objetivo: verificar se o palpite do usuario é igual ao valo que caiu o dado
		//Qual o palpite? 
		//Qual o valor do Dado?
		//Palpite está correto?
								
		String _palpite = JOptionPane.showInputDialog("Qual o palpite?");
		//String _valorDado = JOptionPane.showInputDialog("Qual o valor do dado?");
		
		//Gera numero aleatorio entre 0 e 6
		Random rand = new Random();
		int valorDado = rand.nextInt(6)+1;//as possibilidades vão de 0 - 5 (deve ser add +1 para ajuste)
				
		int palpite = Integer.parseInt(_palpite);			
		//int valorDado = Integer.parseInt(_valorDado);
		
		if(palpite == valorDado){
			System.out.println("Valor do palpite: " + palpite + " e igual ao valor do dado: " + valorDado +" ");
		}else{
			System.out.println("O valor do palpite: " + palpite + " nao e igual ao valor do dado: " + valorDado);
		}
		
	}
}