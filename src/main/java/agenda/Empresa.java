package agenda;

public class Empresa extends Entrada {
	public Empresa() {
		super();
	}
	
	public Empresa(String nombre, String telefono) {
		super(nombre, telefono);
	}

	@Override
	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t<entrada>\n");
		sb.append("\t\t<nombre>" + getNombre() + "</nombre>\n");
		sb.append("\t\t<telefono>" + getTelefono() + "</telefono>\n");
		sb.append("\t<\\entrada>\n");
		
		return sb.toString();
	}
}
