package pantallasABM;

import herramientas.FileChooser;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Choice;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

import persistencia.Hibernate;

import Base.metodosSql;
import ObjetosPersistentes.Departamento;
import ObjetosPersistentes.Empresa;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("unused")
public class ModifDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanelAltaEstablecimientos = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelSuperficie = null;
	
	private JLabel jLabeldomicilio = null;
	private JLabel jLabelLocalidad = null;
	private JLabel jLabelProvincia = null;
	private JLabel jLabelCP = null;
	private JLabel jLabelNombreDepto = null;
	private JLabel jLabelEmail = null;
	private JLabel jLabelTelefono = null;
	private JLabel jLabelDepartamento = null;
	private JTextField jTextFieldMetrosCuadrados = null;
	private JTextField jTextFieldDepartamentoNro = null;
	private JTextField jTextFieldNombreDepto = null;	
	private JTextField jTextFieldEmail = null;
	private JTextField jTextFieldDomicilio = null;
	private JTextField jTextFieldProvincia = null;
	private JTextField jTextFieldCpPA = null;
	private JTextField jTextFieldLocalidad = null;	
	private JTextField jTextFieldTelefono = null;
	private JLabel jLabelCUITVALOR = null;
	private JLabel jLabelTipoZona = null;
	private JComboBox <String>jComboBoxTipoZona = null;
	private JLabel jLabelCertificado = null;
	private JButton jButtonCertificado = null;
	private JLabel jLabelRutaCertificado = null;
	private JLabel jLabelCuit = null;
	
	private ArrayList<Object>empresas=null;  //  @jve:decl-index=0:
	private JComboBox<String> jComboBoxNombreEmpresa = null;
	private JButton jButtonAlta = null;
	private JScrollPane jScrollPaneDepto = null;
	private JTable jTableDeptos = null;

	/**
	 * This is the default constructor
	 */
	public ModifDepartamento() {
		
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1146, 639);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/Departamento.png")));
		this.setContentPane(getJContentPane());
		this.setTitle("Modificación de Departamentos");
		Empresa emp=new Empresa();
		empresas=Hibernate.DameListaDeObjetos("select cuit_cuip from empresa", emp);
		
		
		try {
			
		
			
			for(int i=0;i<empresas.size();i++)
			jComboBoxNombreEmpresa.addItem(((Empresa) empresas.get(i)).getNombre());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			jContentPane.add(getJPanelAltaEstablecimientos(), null);
			jContentPane.add(getJScrollPaneDepto(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelAltaEstablecimientos	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelAltaEstablecimientos() {
		if (jPanelAltaEstablecimientos == null) {
			jLabelCUITVALOR = new JLabel();
			jLabelCUITVALOR.setBounds(new Rectangle(467, 78, 312, 29));
			jLabelCUITVALOR.setText("");
			jLabelCuit = new JLabel();
			jLabelCuit.setBounds(new Rectangle(403, 77, 62, 29));
			jLabelCuit.setText("CUIT/CUIP");
			jLabelRutaCertificado = new JLabel();
			jLabelRutaCertificado.setBounds(new Rectangle(8, 303, 743, 25));
			jLabelRutaCertificado.setText("Ruta al certificado");
			jLabelCertificado = new JLabel();
			jLabelCertificado.setBounds(new Rectangle(7, 268, 301, 30));
			jLabelCertificado.setText("Certiificado              ====>");
			jLabelTipoZona = new JLabel();
			jLabelTipoZona.setBounds(new Rectangle(405, 10, 301, 25));
			jLabelTipoZona.setIcon(new ImageIcon(getClass().getResource("/iconos/Info.png")));
			jLabelTipoZona.setText("Tipo de Zona");
			jLabelTelefono = new JLabel();
			jLabelTelefono.setBounds(new Rectangle(780, 211, 301, 30));
			jLabelTelefono.setIcon(new ImageIcon(getClass().getResource("/iconos/Phone-icon.png")));
			jLabelTelefono.setText("Telefono");
			jLabelEmail = new JLabel();
			jLabelEmail.setBounds(new Rectangle(3, 196, 301, 31));
			jLabelEmail.setIcon(new ImageIcon(getClass().getResource("/iconos/Email.png")));
			jLabelEmail.setText("Email");
			jLabelNombreDepto = new JLabel();
			jLabelNombreDepto.setBounds(new Rectangle(779, 6, 301, 31));
			jLabelNombreDepto.setText("Nombre del Departamento");
			jLabelDepartamento = new JLabel();
			jLabelDepartamento.setBounds(new Rectangle(3, 66, 301, 31));
			jLabelDepartamento.setText("Departamento Nro");
			jLabelCP = new JLabel();
			jLabelCP.setBounds(new Rectangle(780, 79, 301, 30));
			jLabelCP.setText("CP/CPA");
			jLabelProvincia = new JLabel();
			jLabelProvincia.setBounds(new Rectangle(406, 197, 301, 30));
			jLabelProvincia.setText("Provincia");
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setBounds(new Rectangle(780, 145, 301, 30));
			jLabelLocalidad.setText("Localidad");
			jLabeldomicilio = new JLabel();
			jLabeldomicilio.setBounds(new Rectangle(406, 131, 301, 30));
			jLabeldomicilio.setIcon(new ImageIcon(getClass().getResource("/iconos/Departamento.png")));
			jLabeldomicilio.setText("Domicilio");
			jLabelSuperficie = new JLabel();
			jLabelSuperficie.setBounds(new Rectangle(3, 130, 301, 31));
			jLabelSuperficie.setText("Superficie en Metros Cuadrados (nro decimal)");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(2, 2, 301, 31));
			jLabelNombre.setIcon(new ImageIcon(getClass().getResource("/iconos/Profile.png")));
			jLabelNombre.setText("Nombre de la Empresa");
			
			jPanelAltaEstablecimientos = new JPanel();
			jPanelAltaEstablecimientos.setLayout(null);
			jPanelAltaEstablecimientos.setBounds(new Rectangle(7, 273, 1104, 335));
			jPanelAltaEstablecimientos.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanelAltaEstablecimientos.add(jLabelNombre, null);
			jPanelAltaEstablecimientos.add(jLabelSuperficie, null);
			jPanelAltaEstablecimientos.add(getJTextFieldMetrosCuadrados(), null);
			jPanelAltaEstablecimientos.add(jLabeldomicilio, null);
			jPanelAltaEstablecimientos.add(jLabelLocalidad, null);
			jPanelAltaEstablecimientos.add(jLabelProvincia, null);
			jPanelAltaEstablecimientos.add(jLabelCP, null);
			jPanelAltaEstablecimientos.add(getJTextFieldDepartamentoNro(), null);
			jPanelAltaEstablecimientos.add(jLabelDepartamento, null);
			jPanelAltaEstablecimientos.add(getJTextFieldNombreDepto(), null);
			jPanelAltaEstablecimientos.add(jLabelNombreDepto, null);
			jPanelAltaEstablecimientos.add(jLabelEmail, null);
			jPanelAltaEstablecimientos.add(getJTextFieldEmail(), null);
			jPanelAltaEstablecimientos.add(getJTextFieldDomicilio(), null);
			jPanelAltaEstablecimientos.add(getJTextFieldProvincia(), null);
			jPanelAltaEstablecimientos.add(getJTextFieldCpPA(), null);
			jPanelAltaEstablecimientos.add(getJTextFieldLocalidad(), null);
			jPanelAltaEstablecimientos.add(jLabelTelefono, null);
			jPanelAltaEstablecimientos.add(getJTextFieldTelefono(), null);
			jPanelAltaEstablecimientos.add(jLabelTipoZona, null);
			jPanelAltaEstablecimientos.add(getJComboBoxTipoZona(), null);
			jPanelAltaEstablecimientos.add(jLabelCertificado, null);
			jPanelAltaEstablecimientos.add(getJButtonCertificado(), null);
			jPanelAltaEstablecimientos.add(jLabelRutaCertificado, null);
			jPanelAltaEstablecimientos.add(jLabelCuit, null);
			jPanelAltaEstablecimientos.add(jLabelCUITVALOR, null);
			jPanelAltaEstablecimientos.add(getJComboBoxNombreEmpresa(), null);
			jPanelAltaEstablecimientos.add(getJButtonAlta(), null);
		}
		return jPanelAltaEstablecimientos;
	}

	/**
	 * This method initializes jTextFieldMetrosCuadrados	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMetrosCuadrados() {
		if (jTextFieldMetrosCuadrados == null) {
			jTextFieldMetrosCuadrados = new JTextField();
			jTextFieldMetrosCuadrados.setBounds(new Rectangle(3, 163, 301, 31));
		}
		return jTextFieldMetrosCuadrados;
	}

	/**
	 * This method initializes jTextFieldDepartamentoNro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDepartamentoNro() {
		if (jTextFieldDepartamentoNro == null) {
			jTextFieldDepartamentoNro = new JTextField();
			jTextFieldDepartamentoNro.setBounds(new Rectangle(3, 95, 301, 31));
		}
		return jTextFieldDepartamentoNro;
	}

	/**
	 * This method initializes jTextFieldNombreDepto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombreDepto() {
		if (jTextFieldNombreDepto == null) {
			jTextFieldNombreDepto = new JTextField();
			jTextFieldNombreDepto.setBounds(new Rectangle(779, 38, 301, 31));
		}
		return jTextFieldNombreDepto;
	}

	/**
	 * This method initializes jTextFieldEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEmail() {
		if (jTextFieldEmail == null) {
			jTextFieldEmail = new JTextField();
			jTextFieldEmail.setBounds(new Rectangle(3, 229, 301, 31));
		}
		return jTextFieldEmail;
	}

	/**
	 * This method initializes jTextFieldDomicilio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDomicilio() {
		if (jTextFieldDomicilio == null) {
			jTextFieldDomicilio = new JTextField();
			jTextFieldDomicilio.setBounds(new Rectangle(406, 164, 301, 30));
		}
		return jTextFieldDomicilio;
	}

	/**
	 * This method initializes jTextFieldProvincia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProvincia() {
		if (jTextFieldProvincia == null) {
			jTextFieldProvincia = new JTextField();
			jTextFieldProvincia.setBounds(new Rectangle(406, 230, 301, 30));
		}
		return jTextFieldProvincia;
	}

	/**
	 * This method initializes jTextFieldCpPA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCpPA() {
		if (jTextFieldCpPA == null) {
			jTextFieldCpPA = new JTextField();
			jTextFieldCpPA.setBounds(new Rectangle(780, 109, 301, 30));
		}
		return jTextFieldCpPA;
	}

	/**
	 * This method initializes jTextFieldLocalidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalidad() {
		if (jTextFieldLocalidad == null) {
			jTextFieldLocalidad = new JTextField();
			jTextFieldLocalidad.setBounds(new Rectangle(780, 178, 301, 30));
		}
		return jTextFieldLocalidad;
	}

	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(780, 244, 301, 30));
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes jComboBoxTipoZona	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxTipoZona() {
		if (jComboBoxTipoZona == null) {
			jComboBoxTipoZona = new JComboBox<String>();
			jComboBoxTipoZona.setBounds(new Rectangle(405, 36, 301, 31));
			jComboBoxTipoZona.addItem("Zona Residencial exclusiva");
			jComboBoxTipoZona.addItem("Zona Industrial exclusiva");
			jComboBoxTipoZona.addItem("Zona Residencial mixta");
			jComboBoxTipoZona.addItem("Zona Rural");
			jComboBoxTipoZona.addItem("Zona Industrial mixta");
			jComboBoxTipoZona.addItem("Parque industrial");

		}
		return jComboBoxTipoZona;
	}

	/**
	 * This method initializes jButtonCertificado	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCertificado() {
		if (jButtonCertificado == null) {
			jButtonCertificado = new JButton();
			jButtonCertificado.setBounds(new Rectangle(313, 267, 50, 32));
			jButtonCertificado.setIcon(new ImageIcon(getClass().getResource("/iconos/Modify.png")));
			jButtonCertificado.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						JOptionPane.showMessageDialog(null,"(Solo se guardará la ruta no el archivo en sí, por lo que el archivo en el servidor debe ser INAMOVIBLE O INRENOMBRABLE)");
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						
						
						jLabelRutaCertificado.setText(ruta);
						
						}catch(Exception e1){}
				
				}
			});
		}
		return jButtonCertificado;
	}

	/**
	 * This method initializes jComboBoxNombreEmpresa	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String>getJComboBoxNombreEmpresa() {
		if (jComboBoxNombreEmpresa == null) {
			jComboBoxNombreEmpresa = new JComboBox<String>();
			jComboBoxNombreEmpresa.setBounds(new Rectangle(3, 35, 300, 29));
			jComboBoxNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					jLabelCUITVALOR.setText(String.valueOf(((Empresa)empresas.get(jComboBoxNombreEmpresa.getSelectedIndex())).getCuit_cuip()));
					}catch(Exception e1){
						
					}
				}
			});
			
		}
		return jComboBoxNombreEmpresa;
	}

	/**
	 * This method initializes jButtonAlta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAlta() {
		if (jButtonAlta == null) {
			jButtonAlta = new JButton();
			jButtonAlta.setBounds(new Rectangle(936, 283, 145, 33));
			jButtonAlta.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonAlta.setText("Dar de Alta");
			jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String cuitEmpresa=jLabelCUITVALOR.getText();
					Departamento depa=new Departamento();
					//MAX CONCAT 9,223,372,036,854,775,807
					
					String nombre=jTextFieldNombreDepto.getText();
					depa.setNombre(nombre);
					String departamento_nro=jTextFieldDepartamentoNro.getText();
					depa.setDepartamento_nro(departamento_nro);
					String eMail=jTextFieldEmail.getText();
					depa.setEmail(eMail);
					String domicilio=jTextFieldDomicilio.getText();
					depa.setDomicilio(domicilio);
					float superficie=Float.parseFloat(jTextFieldMetrosCuadrados.getText());
					depa.setSuperficie(superficie);
					String provincia=jTextFieldProvincia.getText();
					depa.setProvincia(provincia);
					int cp_cpa=Integer.parseInt(jTextFieldCpPA.getText());
					depa.setCp_cpa(cp_cpa);
					String empresa_cuit=jLabelCUITVALOR.getText();
					depa.setEmpresa_cuit(empresa_cuit);
					String telefono= jTextFieldTelefono.getText();
					depa.setTelefono(telefono);
					String tipo_zona=jComboBoxTipoZona.getSelectedItem().toString();
					depa.setTipo_zona(tipo_zona);
					String certificadoMunicTipoZona=jLabelRutaCertificado.getText();
					depa.setCertificadoMunicTipoZona(certificadoMunicTipoZona);
					String localidad=jTextFieldLocalidad.getText();	
					depa.setLocalidad(localidad);
					String concatIdCli=depa.getEmpresa_cuit()+depa.getDepartamento_nro();
					String idCliente=concatIdCli;
					depa.setIdCliente(idCliente);
					int status=0;
					status=Hibernate.guardarObjeto(depa);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Guardado ok");
					}else{
						JOptionPane.showMessageDialog(null,"No se guardaron lo datos, verifique campos.");
					}
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error verifique campos "+e1.getMessage());
						
					}
					
					
					
					 
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
		}
		return jButtonAlta;
	}

	/**
	 * This method initializes jScrollPaneDepto	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneDepto() {
		if (jScrollPaneDepto == null) {
			jScrollPaneDepto = new JScrollPane();
			jScrollPaneDepto.setBounds(new Rectangle(4, 7, 1110, 250));
			jScrollPaneDepto.setViewportView(getJTableDeptos());
		}
		return jScrollPaneDepto;
	}

	/**
	 * This method initializes jTableDeptos	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableDeptos() {
		if (jTableDeptos == null) {
			jTableDeptos = new JTable();
		}
		return jTableDeptos;
	}

}  //  @jve:decl-index=0:visual-constraint="10,-71"
