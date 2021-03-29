package br.com.projetoDev2meAula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exerc3 {
	
	protected void receberNotasSimples() {
		
		boolean decisao;
			
		boolean maisNotas= true;
		
		do {
			Double nota1;
			Double nota2;
			Double nota3;
			String nome;
		
			decisao= this.validarDecisao(Integer.valueOf(JOptionPane.showInputDialog("Deseja inserir uma nota? \n Digite 1 para SIM e 2 para NÃO:")));
			if(decisao == true) {
				maisNotas = true;

				nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
				nota1 = Double.valueOf(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				nota2 = Double.valueOf(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				nota3 = Double.valueOf(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				
				Double media = this.calcularMediaSimples(nota1, nota2, nota3);
				
				System.out.println("A média do aluno "+nome+"  é: "+media);

			}else {
				maisNotas = false;
			}
		}
		while(maisNotas);

		System.out.println("Todas as médias foram exibidas.");
		
	}
	
	protected Double calcularMediaSimples(Double nota1, Double nota2, Double nota3) {

		Double soma = 0.00;
		
		Double media = (nota1 + nota2 + nota3)/3;

		return media;
	}

	
	protected void receberNotas() {

		ArrayList notas = new ArrayList();
		ArrayList alunos = new ArrayList();
		
		boolean decisao;
		
		
		
		boolean maisNotas= true;
		
		do {
			Double nota;
			String nome;
		
			decisao= this.validarDecisao(Integer.valueOf(JOptionPane.showInputDialog("Deseja inserir uma nota? \n Digite 1 para SIM e 2 para NÃO:")));
			if(decisao == true) {
				maisNotas = true;
				nota = Double.valueOf(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				boolean correto = this.validarNota(nota);
				if(correto) {
					notas.add(nota);
				}else {
					JOptionPane.showInputDialog("Preencheu incorretamente, tente mais uma vez!");
					maisNotas = true;
				};
			}else {
				maisNotas = false;
			}
		}
		while(maisNotas);

		Double media = this.calcularMedia(notas);
		System.out.println("A média do aluno é:"+media);
		
	}
	protected Boolean validarDecisao(int decisao) {
		boolean resultado = false;
		if(decisao == 1) {
			resultado = true;
		}else if(decisao == 2) {
			resultado = false;
		}else {
			System.out.println("Inseriu uma opção incorreta, processo finalizado!");
			resultado = false;
		}
		
		return resultado;
	}
	protected Double receberNota(Double nota) {
		
		
		Double media = (nota);
		return media;
	}
	
	
	protected Double calcularMedia(ArrayList notas) {

		Double soma = 0.00;
		
		
		for (int i = 0; i < notas.size(); i++) {
			Double nota = (Double) notas.get(i);
			soma += nota;
		}

		Double media = soma/notas.size();
		return media;
	}
	
	protected Boolean validarNota(Double nota) {
		
		Boolean validacao= false;
		
		if(nota > -1 ) {
			validacao = true;
			System.out.println("Numero Positivo 1");
		}else {
			System.out.println("Numero Negativo -1");
			validacao = false;
		}
		
		return validacao;
	}
	
	protected Double identificarMaior(Double valor1, Double valor2, Double valor3) {
		
		Double maior = 0.00;
		
		boolean valida1 = valor1 >= valor2 && valor1 >= valor3;
		boolean valida2 = valor2 >= valor1 && valor2 >= valor3;
		boolean valida3 = valor3 >= valor1 && valor3 >= valor2;
		
		if(valida1) {
			maior = valor1;
		} else if(valida2) {
			maior = valor2;
		} else if(valida3) {
			maior = valor3;
		};
		
		return maior;
	}
}

