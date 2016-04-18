package controlador;

import modelo.InterfaceModelo;
import vista.InterfaceVista;
import agenda.Empresa;
import agenda.Persona;

public class Controlador implements InterfaceControlador {
	private InterfaceVista vista;
	private InterfaceModelo modelo;
	
	public Controlador() {}
	
	public void setVista(InterfaceVista vista) {
		this.vista = vista;
	}
	
	public void setModelo(InterfaceModelo modelo) {
		this.modelo = modelo;
	}
	
	public void nuevaEntrada() {
		String nombre = vista.getNombre();
		String apellidos = vista.getApellidos();
		String telefono = vista.getTelefono();
		if(apellidos.equals(""))
			modelo.nuevaEntrada(new Empresa(nombre, telefono));
		else 
			modelo.nuevaEntrada(new Persona(nombre, apellidos, telefono));
	}
	
	@Override
	public void buscaEntrada() {
		String nombre = vista.getNombre();
		modelo.buscaEntrada(nombre);
	}
	
	@Override
	public void listaTXT() {
		modelo.descripcionTXT();
	}
	
	@Override
	public void listaXML() {
		modelo.descripcionXML();
	}
}
