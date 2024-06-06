package br.com.Escola.domain;

public class Disciplina {
    String Disciplina;
    int nota;
    
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Disciplina [Disciplina=" + Disciplina + ", nota=" + nota + "]";
	}
    
    
	
}
