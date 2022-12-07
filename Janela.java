package view;

import javax.swing.JFrame;
import java.awt.event.ActionListener;


public abstract class Janela extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

    public void inicializaJanela() {
        this.setSize(this.getLargura(), this.getAltura());
        this.setTitle(this.getTitulo());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
    }
}