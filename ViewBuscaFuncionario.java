package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ViewBuscaFuncionario extends JanelaInterna {

    private JLabel lblTitulo;
    private JLabel lblNome;
    private JTextField txtNome;
    private JList lstNomes;
    private JButton btnBuscar;

    public void inicializaComponentes(){
        lblTitulo = new JLabel("BUSCAR PETS");
        lblTitulo.setBounds(10,10,400,60);

        lblNome = new JLabel("Nome:");
        lblNome.setBounds(10,50,50,60);
        
        txtNome = new JTextField();
        txtNome.setBounds(60,70,200,20);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(270,70,100,20);

        String[] nomes = {"Digite um nome para buscar"};
        lstNomes = new JList(nomes);
        lstNomes.setBounds(10,100,360,200);

        this.add(lblTitulo);
        this.add(lblNome);
        this.add(txtNome);
        this.add(lstNomes);
        this.add(btnBuscar);
    }

    public ViewBuscaFuncionario(int largura, int altura, String titulo) {
        this.setLargura(largura);
        this.setAltura(altura);
        this.setTitulo(titulo);
        this.inicializaJanela();
        this.inicializaComponentes();
    }
}
