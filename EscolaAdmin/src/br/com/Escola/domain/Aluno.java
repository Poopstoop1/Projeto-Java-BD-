package br.com.Escola.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.com.Escola.domain.Disciplina;

public class Aluno {
	
	Usuario u;
	
	String matricula;
	
	Date dataCadastro;
	
	String turma;
	
	String Serie;
	
	String turno;
		
	 public String Aprovado = "Aprovado!";
	 public String Recuperacao = "Recuperação!";
	 public String reprovado = "Reprovado!";
	
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getMedia(){
		int somaNota = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNota(); 
		}
		if(somaNota == 0) {
			return somaNota = 0;
		}else {
			return somaNota / disciplinas.size();
		}
		
	}

	public String alunoAprovado(){
		
		if(this.getMedia() >= 5) {
			if(this.getMedia() >= 7) {
				return this.Aprovado;
			}else {
				return this.Recuperacao;
			}
			
		}else {
			return this.reprovado;
		}
	}
	
	public void addNota(String nomeDisciplina, int nota) {
	    for (Disciplina disciplina : disciplinas) {
	        if (disciplina.getDisciplina().equals(nomeDisciplina)) {
	            disciplina.setNota(nota);
	            return;
	        }
	    }
	    throw new IllegalArgumentException("Disciplina" + nomeDisciplina + "não encontrada " );
	}


	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getSerie() {
		return Serie;
	}

	public void setSerie(String serie) {
		Serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Aluno [u=" + u + ", matricula=" + matricula + ", dataCadastro=" + dataCadastro +
				", turma=" + turma + ", Serie=" + Serie + ", turno=" + turno + ", disciplinas=" + disciplinas + "]";
	}
	
}
