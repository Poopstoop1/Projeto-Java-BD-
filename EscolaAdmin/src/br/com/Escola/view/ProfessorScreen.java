package br.com.Escola.view;

import java.util.Date;

import javax.swing.JOptionPane;

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
		user1.setDatadeNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Professor"));
		user1.setTelefone(JOptionPane.showInputDialog("Digite o Telefon do Professor"));
		user1.setSenha(JOptionPane.showInputDialog("Digite a senha do Professor"));
		
		rep.inserirUsuarioProfessor(user1);
		
		Professor professor = new Professor();
		professor.setU(user1);
		professor.setDataCadastro( new Date() );
	

		
		return professor;
	}
}
