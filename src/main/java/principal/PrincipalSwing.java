package principal;

import javax.swing.SwingUtilities;

import modelo.Modelo;
import vista.Vista;
import controlador.Controlador;

public class PrincipalSwing {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Vista vista = new Vista();
				Modelo modelo = new Modelo();
				Controlador controlador = new Controlador();
				vista.setControlador(controlador);
				vista.setModelo(modelo);
				modelo.setVista(vista);
				controlador.setModelo(modelo);
				controlador.setVista(vista);
			}
		});
	}
}
