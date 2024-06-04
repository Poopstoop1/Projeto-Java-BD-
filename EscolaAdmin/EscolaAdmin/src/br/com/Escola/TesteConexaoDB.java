package br.com.Escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TesteConexaoDB {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// Apenas um tutorial de conexão com o BD
		// em java
		
		try {
			// passo 1 - carregar o driver do BD na memória
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			// passo 2 - fazer a conexão com o meu BD
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/clubeadm?user=root");
			JOptionPane.showMessageDialog(null, "Conexão feita com sucesso");
			
			
			JOptionPane.showMessageDialog(null, "Inserindo um dado no BD");
			
			String login = JOptionPane.showInputDialog("Digite um login");
			String email = JOptionPane.showInputDialog("Digite um email");
			
			String sqlInsert = "INSERT INTO teste (nome, email) VALUES(\'" + login + "\', \'" + email + "\')";
			System.out.println( "executando: \n" + sqlInsert );
			
			Statement stInsert = con.createStatement();
			stInsert.execute(sqlInsert);			
			
			JOptionPane.showMessageDialog(null, "Inserção feita com sucesso");
			System.out.println( con );
			
			// passo 3 - escrevo o comando SQL a ser executado
			String select = "select * from teste t";

			// passo 4 - peço para a minha conexão executar o meu comando
			Statement st = con.createStatement();
			st.execute(select);
			
			// passo 5 - verifico o resultado do comando;
			ResultSet res =  st.getResultSet();
			
			while(res.next()) {
				System.out.println( res.getString(1));
				System.out.println( res.getString(2));
				System.out.println( res.getString(3));
				System.out.println( "----------------------- ");
				
			}
			

			// obs: para executar outros comandos , volte para o passo 3;

		} catch (Exception e) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD");
		}

	}

}
