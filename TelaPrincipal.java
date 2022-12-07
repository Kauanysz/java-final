package view;

import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaPrincipal extends Janela {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private JDesktopPane painel;

    public TelaPrincipal(int altura, int largura, String titulo) {
        this.setAltura(altura);
        this.setLargura(largura);
        this.setTitulo(titulo);
        this.setLayout(null);
        this.inicializaJanela();
        this.inicializaComponentes();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    
   

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TelaPrincipal.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(new ImageIcon(imgURL).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        } else {
            System.err.println("arquivo nao encontrado: " + path);
            return null;
        }
    }

    public void gerarMenu() {
        // Menu
        menuBar = new JMenuBar();
        // Usuarios
        menu = new JMenu("Usuarios");
        menu.setMnemonic(KeyEvent.VK_U);
        menu.getAccessibleContext().setAccessibleDescription("Gerencie usuarios");
        menuBar.add(menu);

        // Itens do Menu gerenciar usuarios
        // Cadastro
        
        ImageIcon IconCadastro = createImageIcon("../assets/gato.jpg");
        menuItem = new JMenuItem("Cadastrar Pets",IconCadastro);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("Cadastre pets");
        menuItem.setActionCommand("novo");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menu.addSeparator();

        // Cadastro
        // ImageIcon icon = createImageIcon("../images/add.png");
        // menuItem = new JMenuItem("Both text and icon", icon);

        ImageIcon Icon = createImageIcon("../assets/gato.jpg");
        menuItem = new JMenuItem("Buscar Pets", Icon);
        menu.setMnemonic(KeyEvent.VK_B);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("Buscar pets");
        menuItem.setActionCommand("buscar");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        this.setJMenuBar(menuBar);
    }

    public void inicializaComponentes() {
        painel = new JDesktopPane();
        painel.setBackground(Color.pink);
        this.setLayout(null);
        this.setContentPane(painel);
        setContentPane(painel);
        this.gerarMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "novo") {
            ViewCadastraFuncionario janelCadastraFuncionario = new ViewCadastraFuncionario(640, 480,"Cadastre Seu Pet");
            painel.add(janelCadastraFuncionario);
            janelCadastraFuncionario.setVisible(true);
        }

        if (e.getActionCommand() == "buscar") {
            ViewBuscaFuncionario janelBuscaFuncionario = new ViewBuscaFuncionario(640, 480,"Buscar Pet");
            painel.add(janelBuscaFuncionario);
            janelBuscaFuncionario.setVisible(true);
        }
    }
}
