package pantallas;

import herramientas.FileChooser;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.JPanel;
import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import persistencia.Hibernate;

import noConformidad.ComoMitigar;

public class Mitigacion extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Mitigacion( String cliente_depto,
			long itemNoConfNro) throws HeadlessException {
		super();
		
		this.cliente_depto = cliente_depto;
		this.id_item_no_conf = itemNoConfNro;
		initialize();
	}

	
	String cliente_depto;
	long id_item_no_conf;
	
	private JPanel jContentPane = null;
	
	private String rutaFoto;
	private JLabel jLabelFoto = null;
	private JEditorPane jEditorPane = null;
	private JButton jButtonExaminar = null;
	private JButton jButtonAceptar = null;
	private JLabel jLabelDetalle = null;
	private JLabel jLabelFotografia = null;
	public String getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	
	public Mitigacion() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(760, 395);
		this.setContentPane(getJContentPane());
		this.setTitle("Mitigacion");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelFotografia = new JLabel();
			jLabelFotografia.setBounds(new Rectangle(224, 7, 215, 19));
			jLabelFotografia.setText("Fotografía descriptiva");
			jLabelDetalle = new JLabel();
			jLabelDetalle.setBounds(new Rectangle(12, 233, 281, 22));
			jLabelDetalle.setText("Detalle");
			jLabelFoto = new JLabel();
			jLabelFoto.setBounds(new Rectangle(108, 42, 453, 176));
			
			jLabelFoto.setText("Seleccione fotografia con el botón");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelFoto, null);
			jContentPane.add(getJEditorPane(), null);
			jContentPane.add(getJButtonExaminar(), null);
			jContentPane.add(getJButtonAceptar(), null);
			jContentPane.add(jLabelDetalle, null);
			jContentPane.add(jLabelFotografia, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jEditorPane	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getJEditorPane() {
		if (jEditorPane == null) {
			jEditorPane = new JEditorPane();
			jEditorPane.setBounds(new Rectangle(12, 261, 712, 60));
		}
		return jEditorPane;
	}

	/**
	 * This method initializes jButtonExaminar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExaminar() {
		if (jButtonExaminar == null) {
			jButtonExaminar = new JButton();
			jButtonExaminar.setBounds(new Rectangle(672, 2, 69, 48));
			jButtonExaminar.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonExaminar.setText("");
			jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String ruta=null;
					FileChooser fileChoose=new FileChooser();
					ruta=fileChoose.lanzarSeleccion();
					setRutaFoto(ruta);
					ImageIcon fot = new ImageIcon(ruta);
		            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
		            jLabelFoto.setIcon(icono);
					//jLabelFoto.setIcon(new ImageIcon(ruta));
					
					jLabelFoto.setText("");
					
				}
			});
		}
		return jButtonExaminar;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setBounds(new Rectangle(599, 323, 133, 28));
			jButtonAceptar.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonAceptar.setText("Aceptar");
			jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ComoMitigar comoM=new ComoMitigar();
					
					File file = new File(rutaFoto);
			        byte[] bFile = new byte[(int) file.length()];
			 
			        try {
				     FileInputStream fileInputStream = new FileInputStream(file);
				     //convert file into array of bytes
				     fileInputStream.read(bFile);
				     fileInputStream.close();
			        } catch (Exception e1) {
				     e1.printStackTrace();
			        }
			        comoM.setFotografia(bFile);
			        comoM.setDescripcion(jEditorPane.getText());
			        comoM.setCliente_depto(cliente_depto);
			        comoM.setId_item_no_conf(id_item_no_conf);
			        
			       
			        Hibernate.guardarObjeto(comoM);
			        
			 
			      //  Avatar avatar = new Avatar();
			        
					
				}
			});
		}
		return jButtonAceptar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
