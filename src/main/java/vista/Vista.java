package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.InterfaceModelo;
import controlador.InterfaceControlador;

public class Vista implements InterfaceVista {
	private InterfaceControlador controlador;
	private InterfaceModelo modelo;
	private JTextField jtfNombre;
	private JTextField jtfApellidos;
	private JTextField jtfTelefono;
	private JTextArea jtaInfo;
	private JLabel jlNumeroEntradas;

	public Vista() {
		creaInterfazVisual();
	}
	
	public void setControlador(InterfaceControlador controlador) {
		this.controlador = controlador;
	}
	
	public void setModelo(InterfaceModelo modelo) {
		this.modelo = modelo;
	}
	
	private void creaInterfazVisual() {
		jtfNombre = new JTextField(10);
		jtfApellidos = new JTextField(10);
		jtfTelefono = new JTextField(10);
		JButton jbNuevo = new JButton("Nuevo");
		jbNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.nuevaEntrada();
			}
		});
		JButton jbBusca = new JButton("Busca");
		jbBusca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.buscaEntrada();
			}
		});
		JButton jbListar = new JButton("Listar");
		jbListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.listaTXT();
			}
		});
		JButton jbGenerarXML = new JButton("XML");
		jbGenerarXML.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.listaXML();
			}
		});
		JButton jbLimpia = new JButton("Limpia");
		jbLimpia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaInfo.setText("");
			}
		});
		JPanel jpDatos = new JPanel();
		jpDatos.add(new JLabel("Nombre: "));
		jpDatos.add(jtfNombre);
		jpDatos.add(new JLabel("Apellidos: "));
		jpDatos.add(jtfApellidos);
		jpDatos.add(new JLabel("Telefono: "));
		jpDatos.add(jtfTelefono);
		jpDatos.add(jbNuevo);
		jpDatos.add(jbBusca);
		jpDatos.add(jbListar);
		jpDatos.add(jbGenerarXML);
		jpDatos.add(jbLimpia);
		jtaInfo = new JTextArea(20, 50);
		JScrollPane scroll = new JScrollPane(jtaInfo);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JFrame ventana = new JFrame("Agenda");
		ventana.getContentPane().add(jpDatos, BorderLayout.NORTH);
		jlNumeroEntradas = new JLabel("Numero entradas: 0");
		ventana.getContentPane().add(jlNumeroEntradas);
		ventana.getContentPane().add(scroll, BorderLayout.SOUTH);
		ventana.pack();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	@Override
	public String getNombre() {
		return jtfNombre.getText();
	}
	
	@Override
	public String getApellidos() {
		return jtfApellidos.getText();
	}
	
	@Override
	public String getTelefono() {
		return jtfTelefono.getText();
	}
	
	@Override
	public void nuevoResultado() {
		jtaInfo.append(modelo.getResultado() + "\n");
	}
	
	@Override
	public void actualiza() {
		int nEntradas = modelo.getnEntradas();
		jlNumeroEntradas.setText("Numero entradas: " + nEntradas);
	}
}
