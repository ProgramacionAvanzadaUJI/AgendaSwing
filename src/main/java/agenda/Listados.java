package agenda;
public abstract class Listados {
	public static String listaEntradasXML(Agenda agenda, String xsl) {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding='ISO-8859-1'?>\n");
		if(xsl != null) sb.append("<?xml-stylesheet href=\""+xsl+"\" type=\"text/xsl\"?>\n");
		sb.append("<agenda>\n");
		for(int i = 0; i < agenda.getnEntradas(); i++) {
			sb.append(agenda.getEntrada(i).toXML());
		}
		sb.append("</agenda>\n");
		
		return sb.toString();
	}
	
	public static String listaEntradasTXT(Agenda agenda) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < agenda.getnEntradas(); i++)
			sb.append(agenda.getEntrada(i).toString() + "\n");
		
		return sb.toString();
	}
}
