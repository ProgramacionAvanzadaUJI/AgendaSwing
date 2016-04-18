package agenda;
public abstract class Entrada {
	private String nombre;
	private String telefono;

	public Entrada() {
		super();
		nombre = ""; 
		telefono = "";
	}

	public Entrada(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		}

	public String getNombre() {
		return nombre;
		}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return new String("(" + nombre + ", " + telefono + ")");
	}
	
	public abstract String toXML();
}
