package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jbdc:mysql://localhost/petshop", "root", "");
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
	
}
