package br.com.Escola.view;

import java.util.Date;

import javax.swing.JOptionPane;
import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Disciplina;
import br.com.Escola.domain.Usuario;
import br.com.Escola.repositorio.UsuarioRepositorio;

public class AlunoScreen {
	
	static UsuarioRepositorio rep = new UsuarioRepositorio();
	
	public static Aluno cadastrarAluno() throws Exception {
		
		JOptionPane.showMessageDialog(null, "Cadastramento de Aluno");
		
		Usuario user = new Usuario();
		user.setNome( JOptionPane.showInputDialog("Digite o nome do Aluno"));
		user.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno")));
		user.setCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno"));
		user.setEmail(JOptionPane.showInputDialog("Digite o Email do Aluno"));
		user.setLogin(JOptionPane.showInputDialog("Digite o Login do Aluno"));
		user.setDatadeNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Aluno"));
		user.setTelefone(JOptionPane.showInputDialog("Digite o Telefon do Aluno"));
		user.setSenha(JOptionPane.showInputDialog("Digite a senha do Aluno"));
		
		rep.inserirUsuarioAluno(user);
		
		Aluno aluno = new Aluno();
		aluno.setU(user);
		aluno.setDataCadastro( new Date() );
		aluno.setMatricula("00001");
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina= JOptionPane.showInputDialog("Digite o nome da disciplina" + pos);
			String valorNota= JOptionPane.showInputDialog("Digite a nota" + pos);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Integer.parseInt(valorNota));	
		
		aluno.getDisciplinas().add(disciplina);
		}

		
		return aluno;
	}

}
