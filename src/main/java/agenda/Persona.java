package agenda;

public class Persona extends Entrada {
	private String apellidos;

	public Persona() {
		super();
		apellidos = "";
	}

	public Persona(String nombre, String apellidos, String telefono) {
		super(nombre, telefono);
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "(" + getNombre() + ", " + apellidos	+ ", " + getTelefono() + ")";
	}
	
	@Override
	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t<entrada>\n");
		sb.append("\t\t<nombre>" + getNombre() + "</nombre>\n");
		sb.append("\t\t<apellidos>" + apellidos + "</apellidos>\n");
		sb.append("\t\t<telefono>" + getTelefono() + "</telefono>\n");
		sb.append("\t</entrada>\n");
		
		return sb.toString();
	}
}
