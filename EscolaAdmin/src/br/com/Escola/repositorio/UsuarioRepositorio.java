package br.com.Escola.repositorio;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.Escola.domain.Aluno;
import br.com.Escola.domain.Disciplina;
import br.com.Escola.domain.Professor;
import br.com.Escola.domain.Usuario;

public class UsuarioRepositorio {
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	public boolean inserirUsuarioAluno(Usuario uA,Aluno A, Disciplina d1, Disciplina d2, Disciplina d3, Disciplina d4) {
		
		try {
			Connection con = DBConexao.obterConexao();
			
			String comando = "INSERT INTO usuarioAlun (NumMatricula,nome, idade, login, senha, cpf, DatadeNascimento"
					+ ", email, telefone, nota1, nota2, nota3, nota4, Media, Status )\r\n"
					+ "VALUES(\'"
					+ A.getMatricula() + "\',\'" 
					+ uA.getNome() + "\',\'" 
					+ uA.getIdade() + "\',\'"
					+ uA.getLogin() + "\',\'"
					+ uA.getSenha() + "\',\'"
					+ uA.getCpf() + "\',\'"
					+ uA.getDatadeNascimento() + "\',\'"
					+ uA.getEmail() + "\',\'"
					+ uA.getTelefone() + "\')"
					+ d1.getNota() + "\')"
					+ d2.getNota() +  "\')"
					+ d3.getNota() + "\')"
					+ d4.getNota() + "\')"
					+ A.getMedia() + "\')"
					+ A.alunoAprovado() + "\')";
			
			System.out.println( comando );
			
			Statement st = con.createStatement();
			st.execute(comando);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Um erro inesperado aconteceu");
		}
		return false;
	}
	
public boolean inserirUsuarioProfessor(Usuario uP, Professor P) {
		
		try {
			Connection con = DBConexao.obterConexao();
			
			String comando2 = "INSERT INTO usuarioProf (nome, idade,  login, senha, cpf, DatadeNascimento, email, telefone, Disciplina)\r\n"
					+ "VALUES(\'" 
					+ uP.getNome() + "\',\'" 
					+ uP.getIdade() + "\',\'"
					+ uP.getLogin() + "\',\'"
					+ uP.getSenha() + "\',\'"
					+ uP.getCpf() + "\',\'"
					+ uP.getDatadeNascimento() + "\',\'"
					+ uP.getEmail() + "\',\'"
					+ uP.getTelefone()+ "\')"
					+ P.getNomeDisciplina()+ "\')";
			
			System.out.println( comando2 );
			
			Statement st = con.createStatement();
			st.execute(comando2);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Um erro inesperado aconteceu");
		}
		return false;
	}

}
