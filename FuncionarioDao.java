package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import classes.Funcionario;

public class FuncionarioDao {

	private Connection connection;
	
	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean cadastrarFuncionario(Funcionario funcionario) throws SQLException{
		boolean insert = false;
		try {
			String query= "INSERT INTO tbfuncionario(nome, porte, login, senha) values (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString (1, funcionario.getNome());
			stmt.setString (2, funcionario.getCpf());
			stmt.setString (3, funcionario.getLogin());
			stmt.setString (4, funcionario.getSenha());
			insert = stmt.execute();
			stmt.close();
		return insert;
		}catch(Exception e){
			System.out.println("Erro: "+ e);
		}finally {
			connection.close();
		}
		return insert;
	}
	
}
