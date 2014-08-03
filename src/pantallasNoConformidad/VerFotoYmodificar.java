package pantallasNoConformidad;

import herramientas.FileChooser;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JTextArea;

import persistencia.Hibernate;

import noConformidad.ComoMitigar;
import javax.swing.JCheckBox;

public class VerFotoYmodificar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelFotomal = null;
	private JLabel jLabelFotoBien = null;
	private JButton jButtonCambiarFotoMal = null;
	private JButton jButtonCambiarFotoBien = null;
	private JButton jButtonGuardarCambios = null;
	private JButton jButtonSalir = null;
	private JButton jButtonBorrar = null;
	private JTextArea jTextAreaDescripcionMal = null;
	private JTextArea jTextAreaDescripcionBien = null;
	private static String rutaFotoMal=null;
	private static String rutaFotoBien=null;
	private static VerFotoYmodificar instance; 
	private ComoMitigar como=new ComoMitigar();  //  @jve:decl-index=0:
	private JCheckBox jCheckBoxBorrar = null;
	private JLabel jLabel = null;
	/**
	 * This is the default constructor
	 */
	
	public static VerFotoYmodificar getInstance(int id){
		if(instance==null){
			instance=new VerFotoYmodificar(id);
		}
		return instance;
		
	}
	
	public VerFotoYmodificar(int id) {
		initialize();
		
		como=(ComoMitigar) Hibernate.dameObjeto(id, como);
		rutaFotoBien=como.getFotografiaOk();
		rutaFotoMal=como.getFotografia();
		setJLabelFotomal(como.getFotografia());
		setJLabelFotoBien(como.getFotografiaOk());
		setJTextAreaDescripcionBien(como.getDescripcionOk());
		setJTextAreaDescripcionMal(como.getDescripcion());
		
	}
	
	private JLabel getJLabelFotomal() {
		return jLabelFotomal;
	}

	private void setJLabelFotomal(String ruta) {
		if(ruta!=null){
		ImageIcon imagen=new ImageIcon(ruta);
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabelFotomal.getWidth(),jLabelFotomal.getHeight(), Image.SCALE_DEFAULT));
		jLabelFotomal.setIcon(icono);
		}
	}

	private JLabel getJLabelFotoBien() {
		return jLabelFotoBien;
	}

	private void setJLabelFotoBien(String ruta) {
		if(ruta!=null){
		ImageIcon imagen=new ImageIcon(ruta);
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabelFotoBien.getWidth(),jLabelFotoBien.getHeight(), Image.SCALE_DEFAULT));
		jLabelFotoBien.setIcon(icono);
		}
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(716, 436);
		this.setContentPane(getJContentPane());
		this.setTitle("Ver fotos y modificar");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(412, 363, 106, 22));
			jLabel.setText("Habilitar borrado");
			jLabelFotoBien = new JLabel();
			jLabelFotoBien.setBounds(new Rectangle(352, 16, 332, 206));
			jLabelFotoBien.setText("Sin Foto");
			jLabelFotomal = new JLabel();
			jLabelFotomal.setBounds(new Rectangle(12, 18, 333, 204));
			jLabelFotomal.setText("Sin Foto");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelFotomal, null);
			jContentPane.add(jLabelFotoBien, null);
			jContentPane.add(getJButtonCambiarFotoMal(), null);
			jContentPane.add(getJButtonCambiarFotoBien(), null);
			jContentPane.add(getJButtonGuardarCambios(), null);
			jContentPane.add(getJButtonSalir(), null);
			jContentPane.add(getJButtonBorrar(), null);
			jContentPane.add(getJTextAreaDescripcionMal(), null);
			jContentPane.add(getJTextAreaDescripcionBien(), null);
			jContentPane.add(getJCheckBoxBorrar(), null);
			jContentPane.add(jLabel, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButtonCambiarFotoMal	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCambiarFotoMal() {
		if (jButtonCambiarFotoMal == null) {
			jButtonCambiarFotoMal = new JButton();
			jButtonCambiarFotoMal.setBounds(new Rectangle(12, 223, 120, 31));
			jButtonCambiarFotoMal.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonCambiarFotoMal.setText("Cambiar");
			jButtonCambiarFotoMal.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						if(ruta!="No seleccion")
			            setJLabelFotomal(ruta);
						rutaFotoMal=ruta;
						}catch(Exception w){
							
						}
				}
			});
		}
		return jButtonCambiarFotoMal;
	}

	/**
	 * This method initializes jButtonCambiarFotoBien	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCambiarFotoBien() {
		if (jButtonCambiarFotoBien == null) {
			jButtonCambiarFotoBien = new JButton();
			jButtonCambiarFotoBien.setBounds(new Rectangle(353, 223, 123, 31));
			jButtonCambiarFotoBien.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonCambiarFotoBien.setText("Cambiar");
			jButtonCambiarFotoBien.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						if(ruta!="No seleccion")
			            setJLabelFotoBien(ruta);
						rutaFotoBien=ruta;
						}catch(Exception w){
							
						}
				}
			});
		}
		return jButtonCambiarFotoBien;
	}

	/**
	 * This method initializes jButtonGuardarCambios	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGuardarCambios() {
		if (jButtonGuardarCambios == null) {
			jButtonGuardarCambios = new JButton();
			jButtonGuardarCambios.setBounds(new Rectangle(14, 363, 120, 31));
			jButtonGuardarCambios.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonGuardarCambios.setText("Guardar ");
			jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					como.setFotografia(rutaFotoMal);
					como.setFotografiaOk(rutaFotoBien);
					como.setDescripcion(jTextAreaDescripcionMal.getText());
					como.setDescripcionOk(jTextAreaDescripcionBien.getText());
					if(Hibernate.modificarObjeto(como)==1){
						JOptionPane.showMessageDialog(null,"Guardado correcto");
					}else{
						JOptionPane.showMessageDialog(null,"El dato no se guardó, reintente...");
					}
				}
			});
		}
		return jButtonGuardarCambios;
	}

	private void setJTextAreaDescripcionMal(String texto) {
		jTextAreaDescripcionMal.setText(texto);
	}
	private void setJTextAreaDescripcionBien(String texto) {
		jTextAreaDescripcionBien.setText(texto);
	}
	/**
	 * This method initializes jButtonSalir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(161, 363, 107, 31));
			jButtonSalir.setIcon(new ImageIcon(getClass().getResource("/iconos/Exit.png")));
			jButtonSalir.setText("Salir");
			jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					instance=null;
					dispose();
				}
			});
		}
		return jButtonSalir;
	}

	/**
	 * This method initializes jButtonBorrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBorrar() {
		if (jButtonBorrar == null) {
			jButtonBorrar = new JButton();
			jButtonBorrar.setBounds(new Rectangle(579, 363, 107, 31));
			jButtonBorrar.setEnabled(false);
			jButtonBorrar.setIcon(new ImageIcon(getClass().getResource("/iconos/Delete.png")));
			jButtonBorrar.setText("Borrar");
			jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(Hibernate.borrarObjeto(como)==1){
						JOptionPane.showMessageDialog(null,"Borrado correcto");
						dispose();
					}else{
						JOptionPane.showMessageDialog(null,"No se pudo borrar , reintente...");
					}
				}
			});
		}
		return jButtonBorrar;
	}
	/**
	 * This method initializes jTextAreaDescripcionMal	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaDescripcionMal() {
		if (jTextAreaDescripcionMal == null) {
			jTextAreaDescripcionMal = new JTextArea();
			jTextAreaDescripcionMal.setBounds(new Rectangle(13, 256, 332, 92));
		}
		return jTextAreaDescripcionMal;
	}
	/**
	 * This method initializes jTextAreaDescripcionBien	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaDescripcionBien() {
		if (jTextAreaDescripcionBien == null) {
			jTextAreaDescripcionBien = new JTextArea();
			jTextAreaDescripcionBien.setBounds(new Rectangle(351, 256, 333, 92));
		}
		return jTextAreaDescripcionBien;
	}

	/**
	 * This method initializes jCheckBoxBorrar	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxBorrar() {
		if (jCheckBoxBorrar == null) {
			jCheckBoxBorrar = new JCheckBox();
			jCheckBoxBorrar.setBounds(new Rectangle(532, 363, 32, 26));
			jCheckBoxBorrar.setIcon(new ImageIcon(getClass().getResource("/iconos/Warning.png")));
			jCheckBoxBorrar.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jCheckBoxBorrar.isSelected()){
						jButtonBorrar.setEnabled(true);
					}else{
						jButtonBorrar.setEnabled(false);
					}
				}
			});
		}
		return jCheckBoxBorrar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
