package br.com.projetoDev2meAula;

import javax.swing.JOptionPane;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
		System.out.println(nome +" "+sobrenome);
		
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero"));;
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite mais um numero"));;

		int soma = 0;
		
		soma = n1 + n2;
		System.out.println(soma);
		
		
	}

}
