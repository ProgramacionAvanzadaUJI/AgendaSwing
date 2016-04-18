package modelo;

import vista.InterfaceVista;
import agenda.Agenda;
import agenda.Entrada;
import agenda.Listados;

public class Modelo implements InterfaceModelo {
	private Agenda agenda;
	private InterfaceVista vista;
	private String descripcion;
	
	public Modelo() {
		agenda = new Agenda();
	}
	
	public void setVista(InterfaceVista vista) {
		this.vista = vista;
	}
	
	@Override
	public void nuevaEntrada(Entrada entrada) {
		agenda.nuevaEntrada(entrada);
		vista.actualiza();
	}

	@Override
	public int getnEntradas() {
		return agenda.getnEntradas();
	}

	@Override
	public void buscaEntrada(String nombre) {
		descripcion = agenda.buscaEntrada(nombre).toString();
		vista.nuevoResultado();
	}

	@Override
	public String getResultado() {
		return descripcion;
	}

	@Override
	public void descripcionTXT() {
		descripcion = Listados.listaEntradasTXT(agenda);
		vista.nuevoResultado();
	}

	@Override
	public void descripcionXML() {
		descripcion = Listados.listaEntradasXML(agenda, null);
		vista.nuevoResultado();
	}

}
