package br.com.Escola.domain;

public class Professor extends Aluno {
	
	String nomeDisciplina;
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public void inserirNota(Aluno aluno, String nomeDisciplina, int nota) {
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            if (disciplina.getDisciplina().equals(nomeDisciplina)) {
                disciplina.setNota(nota);
                return;
            }
        }
  }
	
	public void inserirFaltas(Aluno aluno, String nomeDisciplina, int faltas) {
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            if (disciplina.getDisciplina().equals(nomeDisciplina)) {
                disciplina.setFaltas(faltas);
                return;
            }
        }
    }
}
