package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();  
		aluno1.setNome("Carlos");
		
		System.out.println("é " + aluno1.getNome());
		
		aluno1.setNota1(8);
		aluno1.setNota2(7.6);
		aluno1.setNota3(6.4);
		aluno1.setNota4(9);
		
		System.out.println("media é " + aluno1.getMediaNota());
		/*OPERADOR TERNARIO*/
		System.out.println("resultado = " + (aluno1.getAlunoAprovado()));
		
		
		
	}

}
