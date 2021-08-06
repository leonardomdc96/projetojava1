package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Data nascimento do aluno");
		String registroGeral = JOptionPane.showInputDialog("RG do aluno");
		String numeroCpf = JOptionPane.showInputDialog("CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe do aluno");
		String nomePai = JOptionPane.showInputDialog("Nome do pai do aluno");
		String dataMatricula = JOptionPane.showInputDialog("Data matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola do aluno");
		String serieMatriculado = JOptionPane.showInputDialog("Serie matriculado do aluno");
		String nota1 = JOptionPane.showInputDialog("Nota 1 do aluno");
		String nota2 = JOptionPane.showInputDialog("Nota 2 do aluno");
		String nota3 = JOptionPane.showInputDialog("Nota 3 do aluno");
		String nota4 = JOptionPane.showInputDialog("Nota 4 do aluno");
		
		Aluno aluno1 = new Aluno();  
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNomeMae(nomeMae);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
	
		System.out.println(aluno1.toString());
		System.out.println("Situação: " + (aluno1.getAlunoAprovado() ? "aprovado" : "reprovado"));
		
		
		
	}

}
