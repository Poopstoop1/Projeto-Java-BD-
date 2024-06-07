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

		JOptionPane.showMessageDialog(null,"Projeto Sistema da Escola");
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		boolean isCadastrar = true;
		while( isCadastrar ) {
			Aluno a = AlunoScreen.cadastrarAluno();
			listaAluno.add(a);
			isCadastrar = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outro Aluno") == 0;
			}
		
		JOptionPane.showMessageDialog(null, "Cadastro de Aluno com sucesso!\n " + listaAluno.size() );
		
	
		for (Aluno aluno : listaAluno) {
			System.out.println( aluno.getU()  + "" + aluno.getMatricula() + " " + aluno.getDisciplinas() + "Media= " + aluno.getMedia()); 
		}
		
		
		
		List<Professor> listaProfessor = new ArrayList<Professor>();
		boolean Cadastrarp = true;
		while( Cadastrarp ) {
			Professor p = ProfessorScreen.cadastrarProfessor();
			listaProfessor.add(p);
			
			Cadastrarp = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outro Professor") == 0;
			
		}
		JOptionPane.showMessageDialog(null, "Cadastro de Professor com sucesso!\n " + listaProfessor.size() );
		
		for (Professor professor : listaProfessor) {
			System.out.println( professor.getU()  +" Disciplina: " + professor.getNomeDisciplina()); 
		}
		
		boolean inserirNotas = true;
        while (inserirNotas) {
            String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do Professor que deseja inserir notas");
            Professor professor = null;
            for (Professor p : listaProfessor) {
                if (p.getU().getNome().equalsIgnoreCase(nomeProfessor)) {
                    professor = p;
                    break;
                }
            }

            if (professor == null) {
                JOptionPane.showMessageDialog(null, "Professor não encontrado!");
            } else {
                ProfessorScreen.inserirNotaParaAluno(listaAluno, professor);
            }

            inserirNotas = JOptionPane.showConfirmDialog(null, "Deseja que outro Professor insira notas?") == 0;
        }
        
        for (Aluno aluno : listaAluno) {
			System.out.println( aluno.getU()  + " "+ aluno.getMatricula() + " "+ aluno.getDisciplinas() + " " +  aluno.getMedia() ); 
		}
	}
	

}
