package br.com.Escola.view;

import java.util.Date;

import javax.swing.JOptionPane;
import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Usuario;
import br.com.Escola.domain.Disciplina;
import br.com.Escola.repositorio.UsuarioRepositorio;

public class AlunoScreen {
	
	static UsuarioRepositorio rep = new UsuarioRepositorio();
	static int nextmatricula = 1;
	
	public static Aluno cadastrarAluno() throws Exception {
		
		JOptionPane.showMessageDialog(null, "Cadastramento de Aluno");
		
		Usuario user = new Usuario();
		user.setNome( JOptionPane.showInputDialog("Digite o nome do Aluno"));
		user.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno")));
		user.setCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno"));
		user.setEmail(JOptionPane.showInputDialog("Digite o Email do Aluno"));
		user.setLogin(JOptionPane.showInputDialog("Digite o Login do Aluno"));
		user.setDataDeNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Aluno"));
		user.setNomeMae(JOptionPane.showInputDialog("Digite o Nome da Mãe do Aluno"));
		user.setNomePai(JOptionPane.showInputDialog("Digite o Nome do Pai do Aluno"));
		user.setTelefone(JOptionPane.showInputDialog("Digite o Telefone do Aluno"));
		user.setSenha(JOptionPane.showInputDialog("Digite a senha do Aluno"));
		
		
		
		Aluno aluno = new Aluno();
		aluno.setU(user);
		aluno.setDataCadastro( new Date() );
		aluno.setTurma(JOptionPane.showInputDialog("Digite a turma do Aluno"));
		aluno.setTurno(JOptionPane.showInputDialog("Digite o turno do Aluno"));
		aluno.setSerie(JOptionPane.showInputDialog("Digite a serie do Aluno"));
		
		//cada vez que criar um novo aluno a matricula incrementa +1 
		aluno.setMatricula(String.format("%05d", nextmatricula++));
		
		
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Matematica");
		
		aluno.getDisciplinas().add(disciplina1);
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Português");
		
		aluno.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Física");
		
		aluno.getDisciplinas().add(disciplina4);
		rep.inserirUsuarioAluno(user,aluno,disciplina1,disciplina2,disciplina3,disciplina4);
		return aluno;
	}

}
