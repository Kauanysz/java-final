package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.FuncionarioController;

public class ViewCadastraFuncionario extends JanelaInterna {

    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblPrte;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JTextField txtNome;
    private JTextField txtPorte;
    private JTextField txtSenha;
    private JTextField txtLogin;
    private JButton btnSalvar;

    public void inicializaComponentes(){
        lblTitulo = new JLabel("CADASTRO DE PETS");
        lblTitulo.setBounds(10,10,400,60);

        lblNome = new JLabel("Nome:");
        lblNome.setBounds(10,50,50,60);
        
        txtNome = new JTextField();
        txtNome.setBounds(60,70,200,20);

        JLabel lblPorte = new JLabel("Porte:");
        lblPorte.setBounds(10,80,50,60);
        
        txtPorte = new JTextField();
        txtPorte.setBounds(60,100,200,20);
        
        lblLogin = new JLabel("Login:");
        lblLogin.setBounds(10,110,50,60);
        
        txtLogin = new JTextField();
        txtLogin.setBounds(60,130,200,20);
        
        lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(10,140,50,60);
        
        txtSenha = new JTextField();
        txtSenha.setBounds(60,160,200,20);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(150,200,100,20);
        
   
        
        btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionarioController fc = new FuncionarioController();
				boolean salvou = false;
				try {
					salvou = fc.cadastrarFuncionario(
							txtNome.getText(),
							txtPorte.getText(),
							txtLogin.getText(),
							txtSenha.getText());
					if(salvou == true) {
						JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");
					}else {
						JOptionPane.showMessageDialog(null, "Alguma coisa deu erro");
					}
				} catch (SQLException eSql) {
					}
				}
        	
			});
        
        this.add(lblTitulo);
        this.add(lblNome);
        this.add(txtNome);
        this.add(lblPorte);
        this.add(txtPorte);
        this.add(lblLogin);
        this.add(txtLogin);
        this.add(lblSenha);
        this.add(txtSenha );
        this.add(btnSalvar);
    }
    
    
    

    public ViewCadastraFuncionario(int largura, int altura, String titulo) {
        this.setLargura(largura);
        this.setAltura(altura);
        this.setTitulo(titulo);
        this.inicializaJanela();
        this.inicializaComponentes();
    }
}
