package petshop;

import view.TelaPrincipal;

public class Main {
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        TelaPrincipal tl = new TelaPrincipal(640, 780, "petShop");
        }
        });
		
//		  SplashScreen splash = new SplashScreen(10000);
//	        splash.executar();     
	}
}
