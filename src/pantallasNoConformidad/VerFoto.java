package pantallasNoConformidad;

//import java.awt.BorderLayout;
import herramientas.FileChooser;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
//import java.awt.Dimension;
import javax.swing.JLabel;



import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;

import persistencia.Hibernate;

import noConformidad.ComoMitigar;
import noConformidad.MitigacionItemNoConf;

@SuppressWarnings("unused")
public class VerFoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelFoto = null;
	private JLabel jLabelFotoBien = null;
	private JLabel jLabelProblema = null;
	private JLabel jLabelSolución = null;
	private JButton jButtonCambiarFoto1 = null;
	private JButton jButtonCambiarFoto2 = null;
	private JButton jButtonConfirmar = null;
	private int idComoMitigar=0;
	private String rutaFotoMAl;
	private String rutaFotoBien;
	private JButton jButtonSalir = null;

	/**
	 * This is the default constructor
	 */
	public VerFoto(ImageIcon fotoMal,ImageIcon fotoBien,int id) {
		super();
		initialize(fotoMal,fotoBien,id);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize(ImageIcon fotoMal,ImageIcon fotoBien,int id) {
		this.idComoMitigar=id;
		this.setSize(712, 420);
		this.setContentPane(getJContentPane());
		if(fotoMal!=null){
        ImageIcon icono = new ImageIcon(fotoMal.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
        jLabelFoto.setIcon(icono);
		}
        
		if(fotoBien!=null){
        ImageIcon iconoBien = new ImageIcon(fotoBien.getImage().getScaledInstance(jLabelFotoBien.getWidth(),jLabelFotoBien.getHeight(), Image.SCALE_DEFAULT));
        jLabelFotoBien.setIcon(iconoBien);
		}
		
		this.setTitle("Foto");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelSolución = new JLabel();
			jLabelSolución.setBounds(new Rectangle(358, 5, 330, 19));
			jLabelSolución.setText("Fotografía de cómo debe ser soluciónado.");
			jLabelProblema = new JLabel();
			jLabelProblema.setBounds(new Rectangle(14, 6, 337, 19));
			jLabelProblema.setText("Fotografía de la anomalía.");
			jLabelFotoBien = new JLabel();
			jLabelFotoBien.setBounds(new Rectangle(359, 30, 332, 315));
			jLabelFotoBien.setText("");
			jLabelFoto = new JLabel();
			jLabelFoto.setBounds(new Rectangle(14, 30, 338, 315));
			jLabelFoto.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelFoto, null);
			jContentPane.add(jLabelFotoBien, null);
			jContentPane.add(jLabelProblema, null);
			jContentPane.add(jLabelSolución, null);
			jContentPane.add(getJButtonCambiarFoto1(), null);
			jContentPane.add(getJButtonCambiarFoto2(), null);
			jContentPane.add(getJButtonConfirmar(), null);
			jContentPane.add(getJButtonSalir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButtonCambiarFoto1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCambiarFoto1() {
		if (jButtonCambiarFoto1 == null) {
			jButtonCambiarFoto1 = new JButton();
			jButtonCambiarFoto1.setBounds(new Rectangle(15, 352, 130, 38));
			jButtonCambiarFoto1.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonCambiarFoto1.setText("Cambiar");
			jButtonCambiarFoto1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String ruta=null;
					FileChooser fileChoose=new FileChooser();
					ruta=fileChoose.lanzarSeleccion();
					setRutaFotoMAl(ruta);
					
					ImageIcon fot = new ImageIcon(ruta);
		            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
		            jLabelFoto.setIcon(icono);
					}catch(Exception w){
						
					}
				}
			});
		}
		return jButtonCambiarFoto1;
	}

	/**
	 * This method initializes jButtonCambiarFoto2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCambiarFoto2() {
		if (jButtonCambiarFoto2 == null) {
			jButtonCambiarFoto2 = new JButton();
			jButtonCambiarFoto2.setBounds(new Rectangle(340, 352, 130, 38));
			jButtonCambiarFoto2.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonCambiarFoto2.setText("Cambiar");
			jButtonCambiarFoto2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String ruta=null;
					FileChooser fileChoose=new FileChooser();
					ruta=fileChoose.lanzarSeleccion();	
					setRutaFotoBien(ruta);
					ImageIcon fot = new ImageIcon(ruta);
		            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFotoBien.getWidth(),jLabelFotoBien.getHeight(), Image.SCALE_DEFAULT));
		            jLabelFotoBien.setIcon(icono);
					}catch(Exception e1){
						
						
					}
				}
			});
		}
		return jButtonCambiarFoto2;
	}

	/**
	 * This method initializes jButtonConfirmar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConfirmar() {
		if (jButtonConfirmar == null) {
			jButtonConfirmar = new JButton();
			jButtonConfirmar.setBounds(new Rectangle(471, 352, 130, 38));
			jButtonConfirmar.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonConfirmar.setText("Confirmar");
			jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 try {
						 int flagBien=0;
						 int flagMal=0;
				        	ComoMitigar comoM=new ComoMitigar();
				        	comoM=(ComoMitigar) Hibernate.dameObjeto(idComoMitigar, comoM);
							if(getRutaFotoMAl()!=null){
							File fileMal = new File(getRutaFotoMAl());					
					        byte[] bFileMal = new byte[(int) fileMal.length()];
					        FileInputStream fileInputStream = new FileInputStream(fileMal);
						     //convert file into array of bytes
						     fileInputStream.read(bFileMal);
						     fileInputStream.close();
						     comoM.setFotografia(bFileMal);
						     flagMal=1;
							}
					        if(getRutaFotoBien()!=null){
					        File fileBien = new File(getRutaFotoBien());
					        byte[] bFileBien = new byte[(int) fileBien.length()];
					        FileInputStream fileInputStream2 = new FileInputStream(fileBien);
						     //convert file into array of bytes
						     fileInputStream2.read(bFileBien);
						     fileInputStream2.close();	
						     comoM.setFotografiaOk(bFileBien);  
						     flagBien=1;
					        }
				       if(flagBien!=0||flagMal!=0){
				        int status=0;
				        status=Hibernate.modificarObjeto(comoM);
				        if(status==1){
				        	  JOptionPane.showMessageDialog(null,"Datos guardados con éxito!");
				        	  dispose();
				        }else{
				        	  JOptionPane.showMessageDialog(null,"Los datos no se guardaron");
				        	  dispose();
				        }
				        
				        
				        
				       }else{
				    	   JOptionPane.showMessageDialog(null,"Saliendo sin modificaciónes");
				    	   dispose();
				       }
				        }catch(Exception e1){
				        	e1.printStackTrace();
				        	
				        }
				       
				}
			});
			
		}
		return jButtonConfirmar;
	}

	public void setRutaFotoMAl(String rutaFotoMAl) {
		this.rutaFotoMAl = rutaFotoMAl;
	}

	public String getRutaFotoMAl() {
		return rutaFotoMAl;
	}

	public void setRutaFotoBien(String rutaFotoBien) {
		this.rutaFotoBien = rutaFotoBien;
	}

	public String getRutaFotoBien() {
		return rutaFotoBien;
	}

	/**
	 * This method initializes jButtonSalir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(604, 352, 88, 38));
			jButtonSalir.setIcon(new ImageIcon(getClass().getResource("/iconos/Exit.png")));
			jButtonSalir.setText("Salir");
			jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jButtonSalir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
