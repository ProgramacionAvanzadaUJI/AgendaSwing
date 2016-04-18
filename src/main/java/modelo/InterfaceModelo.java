package modelo;

import agenda.Entrada;

public interface InterfaceModelo {
	void nuevaEntrada(Entrada entrada);
	int getnEntradas();
	void buscaEntrada(String nombre);
	String getResultado();
	void descripcionTXT();
	void descripcionXML();
}
