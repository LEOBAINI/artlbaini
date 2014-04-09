package pantallasNoConformidad;

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
import javax.swing.JOptionPane;

import persistencia.Hibernate;

import noConformidad.ComoMitigar;
import java.awt.Panel;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import java.awt.Color;

@SuppressWarnings("unused")
public class Mitigacion extends JFrame {

	private String getRutaFotoBien() {
		return rutaFotoBien;
	}

	private void setRutaFotoBien(String rutaFotoBien) {
		this.rutaFotoBien = rutaFotoBien;
	}


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
	
	private String rutaFoto;  //  @jve:decl-index=0:
	private String rutaFotoBien;  //  @jve:decl-index=0:
	private JLabel jLabelFoto = null;
	private JEditorPane jEditorPane = null;
	private JButton jButtonExaminar = null;
	private JButton jButtonAceptar = null;
	private JLabel jLabelDetalle = null;
	private JLabel jLabelFotografia = null;
	private JLabel jLabelProblema = null;
	private JLabel jLabelSolucion = null;
	private JPanel jPanelFotoMal = null;
	private JPanel jPanelFotoBien = null;
	private JLabel jLabelFotoBien = null;
	private JEditorPane jEditorPaneDetalleFotoBien = null;
	private JButton jButtonExaminarFotoBien = null;
	private JLabel jLabelDetalle1 = null;
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
		this.setTitle("Mitigacion, detalle con imágenes y descripciónes, cómo se debe soluciónarse la anomalía detectada.");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelDetalle1 = new JLabel();
			jLabelDetalle1.setBounds(new Rectangle(373, 233, 316, 22));
			jLabelDetalle1.setText("Detalle de cómo debe ser corregido el ítem a corregir.");
			jLabelSolucion = new JLabel();
			jLabelSolucion.setBounds(new Rectangle(434, 10, 283, 22));
			jLabelSolucion.setText("Cómo debería verse la solución.");
			jLabelProblema = new JLabel();
			jLabelProblema.setBounds(new Rectangle(20, 13, 274, 21));
			jLabelProblema.setText("Cómo se ve el problema");
			jLabelFotografia = new JLabel();
			jLabelFotografia.setBounds(new Rectangle(293, 2, 140, 19));
			jLabelFotografia.setText("Fotografías descriptivas ");
			jLabelDetalle = new JLabel();
			jLabelDetalle.setBounds(new Rectangle(12, 233, 281, 22));
			jLabelDetalle.setText("Detalle del ítem a corregir.");
			jLabelFoto = new JLabel();
			
			jLabelFoto.setText("    Seleccione fotografia del ítem, use el botón.");
			jLabelFoto.setBounds(new Rectangle(3, 5, 301, 169));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJEditorPane(), null);
			jContentPane.add(getJButtonExaminar(), null);
			jContentPane.add(getJButtonAceptar(), null);
			jContentPane.add(jLabelDetalle, null);
			jContentPane.add(jLabelFotografia, null);
			jContentPane.add(jLabelProblema, null);
			jContentPane.add(jLabelSolucion, null);
			jContentPane.add(getJPanelFotoMal(), null);
			jContentPane.add(getJPanelFotoBien(), null);
			jContentPane.add(getJEditorPaneDetalleFotoBien(), null);
			jContentPane.add(getJButtonExaminarFotoBien(), null);
			jContentPane.add(jLabelDetalle1, null);
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
			jEditorPane.setBounds(new Rectangle(12, 261, 354, 45));
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
			jButtonExaminar.setBounds(new Rectangle(294, 225, 31, 31));
			jButtonExaminar.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonExaminar.setText("");
			jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String ruta=null;
					FileChooser fileChoose=new FileChooser();
					ruta=fileChoose.lanzarSeleccion();
					setRutaFoto(ruta);
					ImageIcon fot = new ImageIcon(ruta);
		            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
		            jLabelFoto.setIcon(icono);
					
					
					jLabelFoto.setText("");
					}catch(Exception e1){}
					
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
					try{
					ComoMitigar comoM=new ComoMitigar();
					
					File file = new File(rutaFoto);
			        byte[] bFile = new byte[(int) file.length()];
			        File file2 = new File(rutaFotoBien);
			        byte[] bFile2 = new byte[(int) file.length()];
			 
			        try {
				     FileInputStream fileInputStream = new FileInputStream(file);
				     //convert file into array of bytes
				     fileInputStream.read(bFile);
				     fileInputStream.close();
				     
				     FileInputStream fileInputStream2 = new FileInputStream(file2);
				     //convert file into array of bytes
				     fileInputStream.read(bFile2);
				     fileInputStream.close();
			        } catch (Exception e1) {
				     e1.printStackTrace();
			        }
			        comoM.setFotografia(bFile);
			        comoM.setDescripcion(jEditorPane.getText());
			        comoM.setFotografiaOk(bFile2);
			        comoM.setDescripcionOk(jEditorPaneDetalleFotoBien.getText());
			        comoM.setCliente_depto(cliente_depto);
			        comoM.setId_item_no_conf(id_item_no_conf);
			        
			       
			        Hibernate.guardarObjeto(comoM);
			        JOptionPane.showMessageDialog(null,"Guardado correcto!");
			        dispose();
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error! "+e1.getMessage());
						
					}
			        
			 
			      //  Avatar avatar = new Avatar();
			        
					
				}
			});
		}
		return jButtonAceptar;
	}

	/**
	 * This method initializes panelFotoBien	
	 * 	
	 * @return java.awt.Panel	
	 */
	

	/**
	 * This method initializes jPanelFotoMal	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelFotoMal() {
		if (jPanelFotoMal == null) {
			jPanelFotoMal = new JPanel();
			jPanelFotoMal.setLayout(null);
			jPanelFotoMal.setBounds(new Rectangle(21, 38, 308, 178));
			jPanelFotoMal.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelFotoMal.add(jLabelFoto, null);
		}
		return jPanelFotoMal;
	}

	/**
	 * This method initializes jPanelFotoBien	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelFotoBien() {
		if (jPanelFotoBien == null) {
			jLabelFotoBien = new JLabel();
			jLabelFotoBien.setBounds(new Rectangle(6, 6, 319, 168));
			jLabelFotoBien.setText("           Seleccione fotografía del ítem, use el botón.");
			jPanelFotoBien = new JPanel();
			jPanelFotoBien.setLayout(null);
			jPanelFotoBien.setBounds(new Rectangle(385, 38, 330, 180));
			jPanelFotoBien.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelFotoBien.add(jLabelFotoBien, null);
		}
		return jPanelFotoBien;
	}

	/**
	 * This method initializes jEditorPaneDetalleFotoBien	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getJEditorPaneDetalleFotoBien() {
		if (jEditorPaneDetalleFotoBien == null) {
			jEditorPaneDetalleFotoBien = new JEditorPane();
			jEditorPaneDetalleFotoBien.setBounds(new Rectangle(374, 261, 364, 45));
		}
		return jEditorPaneDetalleFotoBien;
	}

	/**
	 * This method initializes jButtonExaminarFotoBien	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExaminarFotoBien() {
		if (jButtonExaminarFotoBien == null) {
			jButtonExaminarFotoBien = new JButton();
			jButtonExaminarFotoBien.setBounds(new Rectangle(689, 228, 26, 28));
			jButtonExaminarFotoBien.setText("");
			jButtonExaminarFotoBien.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonExaminarFotoBien.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						setRutaFotoBien(ruta);
						ImageIcon fot = new ImageIcon(ruta);
			            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFotoBien.getWidth(),jLabelFotoBien.getHeight(), Image.SCALE_DEFAULT));
			            jLabelFotoBien.setIcon(icono);
						
						
						jLabelFoto.setText("");
						}catch(Exception e1){}
				}
			});
		}
		return jButtonExaminarFotoBien;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
