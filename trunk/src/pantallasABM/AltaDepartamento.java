package pantallasABM;

import herramientas.FileChooser;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AltaDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanelAltaEstablecimientos = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelSuperficie = null;
	private JTextField jTextFieldMetrosCuadrados = null;
	private JLabel jLabeldomicilio = null;
	private JLabel jLabelLocalidad = null;
	private JLabel jLabelProvincia = null;
	private JLabel jLabelCP = null;
	private JTextField jTextFieldDepartamentoNro = null;
	private JLabel jLabelDepartamento = null;
	private JComboBox jComboBoxNombreEmpresa = null;
	private JTextField jTextFieldNombreDepto = null;
	private JLabel jLabelNombreDepto = null;
	private JLabel jLabelEmail = null;
	private JTextField jTextFieldEmail = null;
	private JTextField jTextFieldDomicilio = null;
	private JTextField jTextFieldProvincia = null;
	private JTextField jTextFieldCpPA = null;
	private JTextField jTextFieldLocalidad = null;
	private JLabel jLabelTelefono = null;
	private JTextField jTextFieldTelefono = null;
	private JLabel jLabelTipoZona = null;
	private JComboBox <String>jComboBoxTipoZona = null;
	private JLabel jLabelCertificado = null;
	private JButton jButtonCertificado = null;
	private JLabel jLabelRutaCertificado = null;

	/**
	 * This is the default constructor
	 */
	public AltaDepartamento() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(792, 455);
		this.setContentPane(getJContentPane());
		this.setTitle("Alta de Establecimientos");
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
			jLabelRutaCertificado = new JLabel();
			jLabelRutaCertificado.setBounds(new Rectangle(13, 375, 743, 25));
			jLabelRutaCertificado.setText("Ruta al certificado");
			jLabelCertificado = new JLabel();
			jLabelCertificado.setBounds(new Rectangle(375, 335, 301, 30));
			jLabelCertificado.setText("Certiificado              ====>");
			jLabelTipoZona = new JLabel();
			jLabelTipoZona.setBounds(new Rectangle(13, 64, 301, 31));
			jLabelTipoZona.setIcon(new ImageIcon(getClass().getResource("/iconos/Info.png")));
			jLabelTipoZona.setText("Tipo de Zona");
			jLabelTelefono = new JLabel();
			jLabelTelefono.setBounds(new Rectangle(375, 269, 301, 30));
			jLabelTelefono.setIcon(new ImageIcon(getClass().getResource("/iconos/Phone-icon.png")));
			jLabelTelefono.setText("Telefono");
			jLabelEmail = new JLabel();
			jLabelEmail.setBounds(new Rectangle(13, 304, 301, 31));
			jLabelEmail.setIcon(new ImageIcon(getClass().getResource("/iconos/Email.png")));
			jLabelEmail.setText("Email");
			jLabelNombreDepto = new JLabel();
			jLabelNombreDepto.setBounds(new Rectangle(13, 126, 301, 31));
			jLabelNombreDepto.setText("Nombre del Departamento");
			jLabelDepartamento = new JLabel();
			jLabelDepartamento.setBounds(new Rectangle(13, 188, 301, 31));
			jLabelDepartamento.setText("Departamento Nro");
			jLabelCP = new JLabel();
			jLabelCP.setBounds(new Rectangle(375, 137, 301, 30));
			jLabelCP.setText("CP/CPA");
			jLabelProvincia = new JLabel();
			jLabelProvincia.setBounds(new Rectangle(375, 71, 301, 30));
			jLabelProvincia.setText("Provincia");
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setBounds(new Rectangle(375, 203, 301, 30));
			jLabelLocalidad.setText("Localidad");
			jLabeldomicilio = new JLabel();
			jLabeldomicilio.setBounds(new Rectangle(375, 5, 301, 30));
			jLabeldomicilio.setIcon(new ImageIcon(getClass().getResource("/iconos/Departamento.png")));
			jLabeldomicilio.setText("Domicilio");
			jLabelSuperficie = new JLabel();
			jLabelSuperficie.setBounds(new Rectangle(13, 246, 301, 31));
			jLabelSuperficie.setText("Superficie en Metros Cuadrados (nro decimal)");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(13, 4, 301, 31));
			jLabelNombre.setIcon(new ImageIcon(getClass().getResource("/iconos/Profile.png")));
			jLabelNombre.setText("Nombre de la Empresa");
			jPanelAltaEstablecimientos = new JPanel();
			jPanelAltaEstablecimientos.setLayout(null);
			jPanelAltaEstablecimientos.setBounds(new Rectangle(10, 8, 763, 406));
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
			jPanelAltaEstablecimientos.add(getJComboBoxNombreEmpresa(), null);
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
			jTextFieldMetrosCuadrados.setBounds(new Rectangle(13, 275, 301, 31));
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
			jTextFieldDepartamentoNro.setBounds(new Rectangle(13, 217, 301, 31));
		}
		return jTextFieldDepartamentoNro;
	}

	/**
	 * This method initializes jComboBoxNombreEmpresa	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxNombreEmpresa() {
		if (jComboBoxNombreEmpresa == null) {
			jComboBoxNombreEmpresa = new JComboBox();
			jComboBoxNombreEmpresa.setBounds(new Rectangle(13, 32, 301, 31));
		}
		return jComboBoxNombreEmpresa;
	}

	/**
	 * This method initializes jTextFieldNombreDepto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombreDepto() {
		if (jTextFieldNombreDepto == null) {
			jTextFieldNombreDepto = new JTextField();
			jTextFieldNombreDepto.setBounds(new Rectangle(13, 153, 301, 31));
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
			jTextFieldEmail.setBounds(new Rectangle(13, 333, 301, 31));
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
			jTextFieldDomicilio.setBounds(new Rectangle(375, 38, 301, 30));
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
			jTextFieldProvincia.setBounds(new Rectangle(375, 104, 301, 30));
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
			jTextFieldCpPA.setBounds(new Rectangle(375, 170, 301, 30));
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
			jTextFieldLocalidad.setBounds(new Rectangle(375, 236, 301, 30));
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
			jTextFieldTelefono.setBounds(new Rectangle(375, 302, 301, 30));
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
			jComboBoxTipoZona.setBounds(new Rectangle(13, 90, 301, 31));
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
			jButtonCertificado.setBounds(new Rectangle(678, 302, 50, 32));
			jButtonCertificado.setIcon(new ImageIcon(getClass().getResource("/iconos/Modify.png")));
			jButtonCertificado.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						String ruta=null;
						FileChooser fileChoose=new FileChooser();
						ruta=fileChoose.lanzarSeleccion();
						
						ImageIcon fot = new ImageIcon(ruta);
						jLabelRutaCertificado.setText(ruta);
						
						}catch(Exception e1){}
				
				}
			});
		}
		return jButtonCertificado;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
