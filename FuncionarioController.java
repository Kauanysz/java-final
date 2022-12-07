package controller;

import java.sql.SQLException;

import classes.Funcionario;
import dao.FuncionarioDao;

public class FuncionarioController {
	public boolean  cadastrarFuncionario(String nome, String porte, String login, String senha) throws SQLException{
		boolean salvou = false;
		if(nome != null && porte != null && login != null && senha != null) {
			Funcionario funcionario = new Funcionario();
			FuncionarioDao funcionarioDao = new FuncionarioDao();
			funcionario.setNome(nome);
			funcionario.setNome(porte);
			funcionario.setLogin(login);
			funcionario.setSenha(senha);
			salvou = funcionarioDao.cadastrarFuncionario(funcionario);
		}
		return salvou;
	}
}
