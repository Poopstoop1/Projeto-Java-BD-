package br.com.Escola;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Professor;
import br.com.Escola.view.AlunoScreen;
import br.com.Escola.view.ProfessorScreen;

public class Main {

	public static void main(String[] args) throws Exception {

		JOptionPane.showMessageDialog(null,"Projeto Administração da Escola");
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		boolean isCadastrar = true;
		while( isCadastrar ) {
			Aluno a = AlunoScreen.cadastrarAluno();
			listaAluno.add(a);
			
			isCadastrar = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outro Aluno") == 0;
			
		}
		
		List<Professor> listaProfessor = new ArrayList<Professor>();
		while( isCadastrar ) {
			Professor p = ProfessorScreen.cadastrarProfessor();
			listaProfessor.add(p);
			
			isCadastrar = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outro Professor") == 0;
			
		}
		
		
		
		// Cadastrar Sócio
		JOptionPane.showMessageDialog(null, "Cadastro de sócio\n " + listaAluno.size() );
	}

}
