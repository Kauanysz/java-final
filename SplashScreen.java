package view;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class SplashScreen extends Janela{


    public SplashScreen(int duracao) {
        this.setLayout(null);
        this.inicializaJanela();
		this.setVisible(true);
		
		try {
			Thread.sleep(duracao);
		}catch (Exception e) {
			this.setVisible(false);
		}

    }

		
	public void executar() {
		this.show();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        TelaPrincipal tl = new TelaPrincipal(640, 780, "Petshop");
        }
        });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
