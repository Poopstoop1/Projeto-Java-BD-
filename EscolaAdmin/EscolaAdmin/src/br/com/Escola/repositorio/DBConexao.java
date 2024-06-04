package br.com.Escola.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexao {

	public static Connection obterConexao() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		// passo 1 - carregar o driver do BD na memória
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		// passo 2 - fazer a conexão com o meu BD
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/clubeadm?user=root");

		return con;

	}

}
