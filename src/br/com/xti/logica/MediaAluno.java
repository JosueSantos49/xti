package br.com.xti.logica;

import javax.swing.JOptionPane;

public class MediaAluno {
	public static void main(String[] args) {
		
		String primeiraNota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
		String primeiraNota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
		String primeiraNota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
		String primeiraNota4 = JOptionPane.showInputDialog("Digite a quarta nota: ");
		
		float nota1, nota2, nota3, nota4, media;

		//Converter uma String em float
		nota1 = Float.parseFloat(primeiraNota1);
		nota2 = Float.parseFloat(primeiraNota2);
		nota3 = Float.parseFloat(primeiraNota3);
		nota4 = Float.parseFloat(primeiraNota4);
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 6){
			JOptionPane.showMessageDialog(null, "A media e: "+media+" Aprovado.");
		}
		if(media == 4 || media == 5){
			JOptionPane.showMessageDialog(null, "A media e: "+media+" Aluno em Recuperacao.");
		}
		if(media <= 3){
			JOptionPane.showMessageDialog(null, "A media e: "+media+" Reprovado.");
		}
	}	
}