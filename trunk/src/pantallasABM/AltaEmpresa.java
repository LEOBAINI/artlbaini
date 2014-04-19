package pantallasABM;

import herramientas.FileChooser;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import ObjetosPersistentes.Empresa;

import persistencia.Hibernate;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

@SuppressWarnings("unused")
public class AltaEmpresa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanelAltaEmpresa = null;
	private JButton jButtonDarAlta = null;
	private JTextField jTextFieldNombre = null;
	private JLabel jLabelNombre = null;
	private JTextField jTextFieldActEconomica = null;
	private JLabel jLabelActividadEconomica = null;
	private JTextField jTextFieldCuit = null;
	private JLabel jLabelCuit = null;
	private JTextField jTextFieldDomicilio = null;
	private JLabel jLabelDomicilio = null;
	private JLabel jLabelLocalidad = null;
	private JTextField jTextFieldlLocalidad = null;
	private JLabel jLabelProvincia = null;
	private JTextField jTextFieldProvincia = null;
	private JLabel jLabelCodigoPostal = null;
	private JTextField jTextFieldCodigoPostal = null;
	private JLabel jLabelContrato = null;
	private JTextField jTextFieldContrato = null;
	private JLabel jLabelEmail = null;
	private JTextField jTextFieldEmail = null;
	private JLabel jLabelLogo = null;
	private JButton jButtonLogo = null;
	private JLabel jLabeltelefono = null;
	private JTextField jTextFieldTelefono = null;
	private JPanel jPanelFoto = null;
	private String rutaFoto=null;

	/**
	 * This is the default constructor
	 */
	public AltaEmpresa() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(759, 410);
		this.setContentPane(getJContentPane());
		this.setTitle("Alta de Empresas y Clientes");
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJPanelAltaEmpresa(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelAltaEmpresa	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelAltaEmpresa() {
		if (jPanelAltaEmpresa == null) {
			jLabeltelefono = new JLabel();
			jLabeltelefono.setBounds(new Rectangle(252, 312, 220, 20));
			jLabeltelefono.setText("Teléfono");
			jLabelLogo = new JLabel();
			jLabelLogo.setBackground(new Color(153, 153, 255));
			jLabelLogo.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabelLogo.setBounds(new Rectangle(6, 6, 393, 163));
			jLabelLogo.setText("                                                    Logotipo de la empresa");
			jLabelEmail = new JLabel();
			jLabelEmail.setBounds(new Rectangle(252, 264, 220, 20));
			jLabelEmail.setText("E-Mail");
			jLabelContrato = new JLabel();
			jLabelContrato.setBounds(new Rectangle(15, 312, 220, 20));
			jLabelContrato.setText("Contrato Número");
			jLabelCodigoPostal = new JLabel();
			jLabelCodigoPostal.setBounds(new Rectangle(15, 264, 220, 20));
			jLabelCodigoPostal.setText("Código Postal");
			jLabelProvincia = new JLabel();
			jLabelProvincia.setBounds(new Rectangle(252, 214, 220, 20));
			jLabelProvincia.setText("Provincia");
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setBounds(new Rectangle(15, 214, 220, 20));
			jLabelLocalidad.setText("Localidad");
			jLabelDomicilio = new JLabel();
			jLabelDomicilio.setBounds(new Rectangle(15, 164, 220, 20));
			jLabelDomicilio.setText("Domicilio");
			jLabelCuit = new JLabel();
			jLabelCuit.setBounds(new Rectangle(15, 114, 220, 20));
			jLabelCuit.setText("Cuit/Cuip");
			jLabelActividadEconomica = new JLabel();
			jLabelActividadEconomica.setBounds(new Rectangle(15, 64, 220, 20));
			jLabelActividadEconomica.setText("Actividad Económica");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(15, 14, 220, 20));
			jLabelNombre.setText("Nombre de la Empresa");
			jPanelAltaEmpresa = new JPanel();
			jPanelAltaEmpresa.setLayout(null);
			jPanelAltaEmpresa.setBounds(new Rectangle(9, 2, 731, 379));
			jPanelAltaEmpresa.setBorder(BorderFactory.createTitledBorder(null, "Alta de Empresas", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, null, null));
			jPanelAltaEmpresa.add(getJButtonDarAlta(), null);
			jPanelAltaEmpresa.add(getJTextFieldNombre(), null);
			jPanelAltaEmpresa.add(jLabelNombre, null);
			jPanelAltaEmpresa.add(getJTextFieldActEconomica(), null);
			jPanelAltaEmpresa.add(jLabelActividadEconomica, null);
			jPanelAltaEmpresa.add(getJTextFieldCuit(), null);
			jPanelAltaEmpresa.add(jLabelCuit, null);
			jPanelAltaEmpresa.add(getJTextFieldDomicilio(), null);
			jPanelAltaEmpresa.add(jLabelDomicilio, null);
			jPanelAltaEmpresa.add(jLabelLocalidad, null);
			jPanelAltaEmpresa.add(getJTextFieldlLocalidad(), null);
			jPanelAltaEmpresa.add(jLabelProvincia, null);
			jPanelAltaEmpresa.add(getJTextFieldProvincia(), null);
			jPanelAltaEmpresa.add(jLabelCodigoPostal, null);
			jPanelAltaEmpresa.add(getJTextFieldCodigoPostal(), null);
			jPanelAltaEmpresa.add(jLabelContrato, null);
			jPanelAltaEmpresa.add(getJTextFieldContrato(), null);
			jPanelAltaEmpresa.add(jLabelEmail, null);
			jPanelAltaEmpresa.add(getJTextFieldEmail(), null);
			jPanelAltaEmpresa.add(getJButtonLogo(), null);
			jPanelAltaEmpresa.add(jLabeltelefono, null);
			jPanelAltaEmpresa.add(getJTextFieldTelefono(), null);
			jPanelAltaEmpresa.add(getJPanelFoto(), null);
		}
		return jPanelAltaEmpresa;
	}

	/**
	 * This method initializes jButtonDarAlta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAlta() {
		if (jButtonDarAlta == null) {
			jButtonDarAlta = new JButton();
			jButtonDarAlta.setBounds(new Rectangle(610, 330, 116, 32));
			jButtonDarAlta.setText("Dar de Alta");
			jButtonDarAlta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {			 
			        try {
			        
						String cuit_cuip=jTextFieldCuit.getText();
						String nombre=jTextFieldNombre.getText();
						String domicilio=jTextFieldDomicilio.getText();
						String localidad=jTextFieldlLocalidad.getText();
						String actividad_economica=jTextFieldActEconomica.getText();
						int cp_cpa=Integer.parseInt(jTextFieldCodigoPostal.getText());
						String provincia=jTextFieldProvincia.getText();
						String contrato=jTextFieldContrato.getText();
						String eMail=jTextFieldEmail.getText();
						String telefono=jTextFieldTelefono.getText();
						File foto=null;
						byte[] bFoto=null;
						if(rutaFoto!=null){
						foto = new File(rutaFoto);
				        bFoto = new byte[(int) foto.length()];
				     FileInputStream fileInputStream = new FileInputStream(foto);
				     //convert file into array of bytes
				     fileInputStream.read(bFoto);				     
				     fileInputStream.close();
						}
				     
				     Empresa emp=new Empresa();
				     emp.setActividad_economica(actividad_economica);
				     emp.setContrato(contrato);
				     emp.setCp_cpa(cp_cpa);
				     emp.setCuit_cuip(cuit_cuip);
				     emp.setDomicilio(domicilio);
				     emp.seteMail(eMail);
				     emp.setLocalidad(localidad);
				     emp.setLogo(bFoto);
				     emp.setNombre(nombre);
				     emp.setProvincia(provincia);
				     emp.setTelefono(telefono);
				     String Check=emp.noHayVacios();
				     if(Check=="Ok"){				     
				     int status=Hibernate.guardarObjeto(emp);
				     if (status==1)
				    	 JOptionPane.showMessageDialog(null,"Guardado Ok!.");
				     
				     }else{
				    	 JOptionPane.showMessageDialog(null,"Error corrija o complete campo: "+Check);
				     }
				     
			        } catch (Exception e1) {
			        	JOptionPane.showMessageDialog(null,e1.getMessage());
				     e1.printStackTrace();
			        }
					
				}
			});
		}
		return jButtonDarAlta;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(15, 39, 220, 20));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldActEconomica	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldActEconomica() {
		if (jTextFieldActEconomica == null) {
			jTextFieldActEconomica = new JTextField();
			jTextFieldActEconomica.setBounds(new Rectangle(15, 89, 220, 20));
		}
		return jTextFieldActEconomica;
	}

	/**
	 * This method initializes jTextFieldCuit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCuit() {
		if (jTextFieldCuit == null) {
			jTextFieldCuit = new JTextField();
			jTextFieldCuit.setBounds(new Rectangle(15, 139, 220, 20));
		}
		return jTextFieldCuit;
	}

	/**
	 * This method initializes jTextFieldDomicilio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDomicilio() {
		if (jTextFieldDomicilio == null) {
			jTextFieldDomicilio = new JTextField();
			jTextFieldDomicilio.setBounds(new Rectangle(15, 189, 220, 20));
		}
		return jTextFieldDomicilio;
	}

	/**
	 * This method initializes jTextFieldlLocalidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldlLocalidad() {
		if (jTextFieldlLocalidad == null) {
			jTextFieldlLocalidad = new JTextField();
			jTextFieldlLocalidad.setBounds(new Rectangle(15, 240, 220, 20));
		}
		return jTextFieldlLocalidad;
	}

	/**
	 * This method initializes jTextFieldProvincia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProvincia() {
		if (jTextFieldProvincia == null) {
			jTextFieldProvincia = new JTextField();
			jTextFieldProvincia.setBounds(new Rectangle(252, 240, 220, 20));
		}
		return jTextFieldProvincia;
	}

	/**
	 * This method initializes jTextFieldCodigoPostal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigoPostal() {
		if (jTextFieldCodigoPostal == null) {
			jTextFieldCodigoPostal = new JTextField();
			jTextFieldCodigoPostal.setBounds(new Rectangle(15, 289, 220, 20));
		}
		return jTextFieldCodigoPostal;
	}

	/**
	 * This method initializes jTextFieldContrato	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldContrato() {
		if (jTextFieldContrato == null) {
			jTextFieldContrato = new JTextField();
			jTextFieldContrato.setBounds(new Rectangle(15, 336, 220, 20));
		}
		return jTextFieldContrato;
	}

	/**
	 * This method initializes jTextFieldEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEmail() {
		if (jTextFieldEmail == null) {
			jTextFieldEmail = new JTextField();
			jTextFieldEmail.setBounds(new Rectangle(252, 288, 220, 20));
		}
		return jTextFieldEmail;
	}

	/**
	 * This method initializes jButtonLogo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLogo() {
		if (jButtonLogo == null) {
			jButtonLogo = new JButton();
			jButtonLogo.setBounds(new Rectangle(650, 13, 76, 30));
			jButtonLogo.setText("Logo");
			jButtonLogo.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						jButtonLogo.doClick();
						
					}
					
					
				}
			});
			jButtonLogo.addFocusListener(new java.awt.event.FocusAdapter() {   
				public void focusLost(java.awt.event.FocusEvent e) {    
					jButtonLogo.setBackground(Color.getColor("9FB2D5"));
				}
				public void focusGained(java.awt.event.FocusEvent e) {
					jButtonLogo.setBackground(Color.GREEN);
				}
			});
			jButtonLogo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					try{
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						rutaFoto=ruta;
						ImageIcon fot = new ImageIcon(ruta);
			            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(), Image.SCALE_DEFAULT));
			            jLabelLogo.setIcon(icono);
						
						
						jLabelLogo.setText("");
						}catch(Exception e1){}
					
					
					
					
					
				}
			});
			
		
		}
		return jButtonLogo;
	}

	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(252, 336, 220, 20));
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes jPanelFoto	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelFoto() {
		if (jPanelFoto == null) {
			jPanelFoto = new JPanel();
			jPanelFoto.setLayout(null);
			jPanelFoto.setBounds(new Rectangle(245, 32, 403, 174));
			jPanelFoto.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelFoto.add(jLabelLogo, null);
		}
		return jPanelFoto;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
