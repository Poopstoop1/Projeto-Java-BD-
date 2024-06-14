package br.com.Escola.view;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Professor;
import br.com.Escola.domain.Usuario;
import br.com.Escola.repositorio.UsuarioRepositorio;

public class ProfessorScreen {
	
static UsuarioRepositorio rep = new UsuarioRepositorio();
	
	public static Professor cadastrarProfessor() throws Exception {
		
		JOptionPane.showMessageDialog(null, "Cadastramento de Professor");
		
		Usuario user1 = new Usuario();
		user1.setNome( JOptionPane.showInputDialog("Digite o nome do Professor"));
		user1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Professor")));
		user1.setCpf(JOptionPane.showInputDialog("Digite o CPF do Professor"));
		user1.setEmail(JOptionPane.showInputDialog("Digite o Email do Professor"));
		user1.setLogin(JOptionPane.showInputDialog("Digite o Login do Professor"));
		user1.setDataDeNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Professor"));
		user1.setTelefone(JOptionPane.showInputDialog("Digite o Telefon do Professor"));
		user1.setSenha(JOptionPane.showInputDialog("Digite a senha do Professor"));
		
		Professor professor = new Professor();
		professor.setU(user1);
		professor.setDataCadastro( new Date() );
		professor.setNomeDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina do Professor"));
		rep.inserirUsuarioProfessor(user1,professor);
	

		
		return professor;
	}
	
	 public static void inserirNotaParaAluno(List<Aluno> listaAluno, Professor professor) {
	        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno para inserir a nota");
	        Aluno aluno = null;
	        for (Aluno a : listaAluno) {
	            if (a.getU().getNome().equalsIgnoreCase(nomeAluno)) {
	                aluno = a;
	                break;
	            }
	        }

	        if (aluno == null) {
	            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
	            return;
	        }

	        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota para " + nomeAluno));
	        professor.inserirNota(aluno, professor.getNomeDisciplina(), nota);
	        JOptionPane.showMessageDialog(null, "Nota inserida com sucesso!");
	    }
	 
	 public static void inserirFaltasParaAluno(List<Aluno> listaAluno, Professor professor) {
	        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno para inserir as faltas");
	        Aluno aluno = null;
	        for (Aluno a : listaAluno) {
	            if (a.getU().getNome().equalsIgnoreCase(nomeAluno)) {
	                aluno = a;
	                break;
	            }
	        }

	        if (aluno == null) {
	            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
	            return;
	        }

	        int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas para " + nomeAluno));
	        professor.inserirFaltas(aluno, professor.getNomeDisciplina(), faltas);
	        JOptionPane.showMessageDialog(null, "Faltas inseridas com sucesso!");
	    }
	}
	

