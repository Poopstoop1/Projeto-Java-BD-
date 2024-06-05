package br.com.Escola.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.Escola.domain.Disciplina;

public class Aluno {
	
	Usuario u;
	
	String matricula;
	
	Date dataCadastro;
	
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

	@Override
	public String toString() {
		return "Aluno [u=" + u + ", matricula=" + matricula + ", dataCadastro=" + dataCadastro + ", disciplinas="
				+ disciplinas + "]";
	}




	
	
	
	
	

}
