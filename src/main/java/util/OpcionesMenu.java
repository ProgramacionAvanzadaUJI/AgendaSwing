package util;

public enum OpcionesMenu {
	SALIR("Salir"),
	NUEVA_PERSONA("Nueva Persona."),
	NUEVA_EMPRESA("Nueva Empresa."),
	BUSCA_ENTRADA("Busca por nombre."),
	MUESTRA_ENTRADAS("Muestra todas las entradas."),
	GENERA_XML("Genera XML.");
	
	private String descripcion;
	
	private OpcionesMenu(String descripcion) {
		this.descripcion  = descripcion;
	}
	
	public static OpcionesMenu enteroAOpcion(int opcion) {
		return values()[opcion];
	}
	
	public static String menu() {
		StringBuilder sb = new StringBuilder();
		for(OpcionesMenu opcion: values()) {
			sb.append(opcion.ordinal() + ".- ");
			sb.append(opcion.descripcion + "\n");
		}
		
		return sb.toString();
	}
}
