package br.com.Escola.repositorio;

import java.sql.Connection;
import java.sql.Statement;

import br.com.Escola.domain.Usuario;

public class UsuarioRepositorio {
	
	public boolean inserirUsuarioAluno(Usuario uA) {
		
		try {
			Connection con = DBConexao.obterConexao();
			
			String comando = "INSERT INTO usuarioAlun (nome, login, senha, cpf, email, telefone)\r\n"
					+ "VALUES(\'" 
					+ uA.getNome() + "\',\'" 
					+ uA.getIdade() + "\',\'"
					+ uA.getLogin() + "\',\'"
					+ uA.getSenha() + "\',\'"
					+ uA.getCpf() + "\',\'"
					+ uA.getDatadeNascimento() + "\',\'"
					+ uA.getEmail() + "\',\'"
					+ uA.getTelefone()+ "\')";
			
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
	
public boolean inserirUsuarioProfessor(Usuario uP) {
		
		try {
			Connection con = DBConexao.obterConexao();
			
			String comando2 = "INSERT INTO usuarioProf (nome, login, senha, cpf, email, telefone)\r\n"
					+ "VALUES(\'" 
					+ uP.getNome() + "\',\'" 
					+ uP.getIdade() + "\',\'"
					+ uP.getLogin() + "\',\'"
					+ uP.getSenha() + "\',\'"
					+ uP.getCpf() + "\',\'"
					+ uP.getDatadeNascimento() + "\',\'"
					+ uP.getEmail() + "\',\'"
					+ uP.getTelefone()+ "\')";
			
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
