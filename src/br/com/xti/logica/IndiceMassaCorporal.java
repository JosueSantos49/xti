package br.com.xti.logica;

import javax.swing.JOptionPane;

/*
* Calcular o IMC
* IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
* IMC indica se, esta acima do peso ou peso ideal
*/

public class IndiceMassaCorporal {
	public static void main(String[] args){
				
		String peso = JOptionPane.showInputDialog("Informe o peso em quilogramas: ");
		double pesoEmQuilogramas = Double.parseDouble(peso);
		
		String altura = JOptionPane.showInputDialog("Informe a altura em metros: ");
		double alturaEmMetros = Double.parseDouble(altura);
				
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso ideal";
		msg =  "IMC = " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);		
	}
}