package br.com.Escola.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.com.Escola.domain.Disciplina;

public class Aluno {
	
	Usuario u;
	
	String matricula;
	
	Date dataCadastro;
	
	int Faltas;
	
	
	
	
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
		return somaNota / disciplinas.size();
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
	 public int getFaltas() {
			return Faltas;
		}

		public void setFaltas(int faltas) {
			Faltas = faltas;
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

	@Override
	public String toString() {
		return "Aluno [u=" + u + ", matricula=" + matricula + ", dataCadastro=" + dataCadastro + ", Faltas=" + Faltas
				+ ", disciplinas=" + disciplinas + "]";
	}
	
	






	
	
	
	
	

}
