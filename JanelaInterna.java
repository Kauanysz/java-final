package view;

import java.awt.Color;

import javax.swing.JInternalFrame;

public abstract class JanelaInterna extends JInternalFrame {

	
    private int largura;
    private int altura;
    private String titulo;
    
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void inicializaJanela(){
        this.setTitle(this.getTitulo());
        this.setClosable(true);// Se o frame vai poder ser fechado pelo botão fechar
        this.setIconifiable(true);// Se o frame vai poder ser minimizado.
        this.setResizable(true);// Pemite editar o tamanho.
        this.setSize(this.getLargura(), this.getAltura());
        this.setLayout(null);
        
   	    	
    }

}
