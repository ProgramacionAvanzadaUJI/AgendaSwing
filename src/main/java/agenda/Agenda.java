package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Entrada> entradas;

	public Agenda() {
		entradas = new ArrayList<Entrada>();
	}

	public Entrada getEntrada(int posicion) {
		return entradas.get(posicion);
	}

	public int getnEntradas() {
		return entradas.size();
	}

	public Entrada buscaEntrada(String nombre) {
		for(Entrada entrada: entradas)
			if(entrada.getNombre().equalsIgnoreCase(nombre))
				return entrada;
		return new Empresa("No encontrada", "");
	}

	public void nuevaEntrada(Entrada entrada) {
		entradas.add(entrada);
	}
}
