package br.com.Escola.view;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Professor;
import br.com.Escola.domain.Usuario;
import br.com.Escola.repositorio.UsuarioRepositorio;

public class ProfessorScreen {
	
static UsuarioRepositorio rep = new UsuarioRepositorio();
	
	public static Professor cadastrarProfessor() throws Exception {
		
		JOptionPane.showMessageDialog(null, "Cadastramento de Professor");
		
		Usuario user = new Usuario();
		user.setNome( JOptionPane.showInputDialog("Digite o nome do Professor"));
		user.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno")));
		user.setCpf(JOptionPane.showInputDialog("Digite o CPF do Professor"));
		user.setEmail(JOptionPane.showInputDialog("Digite o Email do Professor"));
		user.setLogin(JOptionPane.showInputDialog("Digite o Login do Professor"));
		user.setDatadeNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Aluno"));
		user.setTelefone(JOptionPane.showInputDialog("Digite o Telefon do Professor"));
		user.setSenha(JOptionPane.showInputDialog("Digite a senha do Professor"));
		
		rep.inserirUsuarioProfessor(user);
		
		Professor professor = new Professor();
		professor.setU(user);
		professor.setDataCadastro( new Date() );
	

		
		return professor;
	}
}
