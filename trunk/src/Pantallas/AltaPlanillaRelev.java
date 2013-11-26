package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class AltaPlanillaRelev extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanelDatosCliente = null;
	private JLabel jLabelNroEstablec = null;
	private JTextField jTextFieldNroEstablec = null;
	private JButton jButtonGuardar = null;
	private JButton jButtonGuardar1 = null;
	private JButton jButtonCancelar = null;
	private JLabel jLabelEmpresa = null;
	private JTextField jTextFieldNombEmpresa = null;
	private JLabel jLabelCuit = null;
	private JTextField jTextFieldCuit = null;
	private JLabel jLabelDomicilio = null;
	private JTextField jTextFieldDomicilio = null;
	private JLabel jLabelActEconomica = null;
	private JTextField jTextFieldActEconomica = null;
	private JLabel jLabelSuperficie = null;
	private JTextField jTextFieldSuperficie = null;
	private JLabel jLabelTrabajadores = null;
	private JTextField jTextFieldTrabajadores = null;
	private JLabel jLabelNroest = null;
	private JTextField jTextFieldNroTotalEstablec = null;
	private JLabel jLabelLocalidad = null;
	private JTextField jTextFieldLocalidad = null;
	private JLabel jLabelContrato = null;
	private JTextField jTextFieldContrato = null;
	private JLabel jLabelPcia = null;
	private JTextField jTextFieldProvincia = null;
	private JLabel jLabelCP = null;
	private JTextField jTextFieldCodPostal = null;
	private JButton jButtonCond = null;
	/**
	 * This is the default constructor
	 */
	public AltaPlanillaRelev() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(755, 413);
		this.setContentPane(getJContentPane());
		this.setTitle("Alta de planilla de relevamiento");
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
			jContentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white), "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jContentPane.add(getJPanelDatosCliente(), null);
			jContentPane.add(getJButtonGuardar1(), null);
			jContentPane.add(getJButtonCancelar(), null);
			jContentPane.add(getJButtonCond(), null);
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelDatosCliente	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelDatosCliente() {
		if (jPanelDatosCliente == null) {
			jLabelCP = new JLabel();
			jLabelCP.setBounds(new Rectangle(513, 160, 155, 19));
			jLabelCP.setText("Código Postal");
			jLabelPcia = new JLabel();
			jLabelPcia.setBounds(new Rectangle(513, 110, 155, 19));
			jLabelPcia.setText("Provincia");
			jLabelContrato = new JLabel();
			jLabelContrato.setBounds(new Rectangle(513, 68, 155, 19));
			jLabelContrato.setText("Contrato");
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setBounds(new Rectangle(10, 165, 159, 19));
			jLabelLocalidad.setText("Localidad");
			jLabelNroest = new JLabel();
			jLabelNroest.setBounds(new Rectangle(267, 165, 208, 19));
			jLabelNroest.setText("N° total de establecimientos");
			jLabelTrabajadores = new JLabel();
			jLabelTrabajadores.setBounds(new Rectangle(267, 117, 208, 19));
			jLabelTrabajadores.setText("Cantidad de trabajadores en el est.");
			jLabelSuperficie = new JLabel();
			jLabelSuperficie.setBounds(new Rectangle(267, 69, 208, 19));
			jLabelSuperficie.setText("Superficie del Est. en M^2");
			jLabelActEconomica = new JLabel();
			jLabelActEconomica.setBounds(new Rectangle(267, 21, 208, 19));
			jLabelActEconomica.setText("Actividad económica - Rev.3");
			jLabelDomicilio = new JLabel();
			jLabelDomicilio.setBounds(new Rectangle(10, 117, 159, 19));
			jLabelDomicilio.setText("Domicilio completo");
			jLabelCuit = new JLabel();
			jLabelCuit.setBounds(new Rectangle(10, 69, 159, 19));
			jLabelCuit.setText("Cuit/Cuip N°");
			jLabelNroEstablec = new JLabel();
			jLabelNroEstablec.setText("Nro de Establecimiento");
			jLabelNroEstablec.setBounds(new Rectangle(513, 25, 155, 19));
			jPanelDatosCliente = new JPanel();
			jPanelDatosCliente.setLayout(null);
			jPanelDatosCliente.setBounds(new Rectangle(21, 20, 695, 311));
			jPanelDatosCliente.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white), "Datos del cliente", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanelDatosCliente.setBackground(new Color(204, 204, 255));
			jPanelDatosCliente.add(jLabelNroEstablec, null);
			jPanelDatosCliente.add(getJTextFieldNroEstablec(), null);
			jPanelDatosCliente.add(getJLabelEmpresa(), null);
			jPanelDatosCliente.add(getJTextFieldNombEmpresa(), null);
			jPanelDatosCliente.add(jLabelCuit, null);
			jPanelDatosCliente.add(getJTextFieldCuit(), null);
			jPanelDatosCliente.add(jLabelDomicilio, null);
			jPanelDatosCliente.add(getJTextFieldDomicilio(), null);
			jPanelDatosCliente.add(jLabelActEconomica, null);
			jPanelDatosCliente.add(getJTextFieldActEconomica(), null);
			jPanelDatosCliente.add(jLabelSuperficie, null);
			jPanelDatosCliente.add(getJTextFieldSuperficie(), null);
			jPanelDatosCliente.add(jLabelTrabajadores, null);
			jPanelDatosCliente.add(getJTextFieldTrabajadores(), null);
			jPanelDatosCliente.add(jLabelNroest, null);
			jPanelDatosCliente.add(getJTextFieldNroTotalEstablec(), null);
			jPanelDatosCliente.add(jLabelLocalidad, null);
			jPanelDatosCliente.add(getJTextFieldLocalidad(), null);
			jPanelDatosCliente.add(jLabelContrato, null);
			jPanelDatosCliente.add(getJTextFieldContrato(), null);
			jPanelDatosCliente.add(jLabelPcia, null);
			jPanelDatosCliente.add(getJTextFieldProvincia(), null);
			jPanelDatosCliente.add(jLabelCP, null);
			jPanelDatosCliente.add(getJTextFieldCodPostal(), null);
		}
		return jPanelDatosCliente;
	}

	/**
	 * This method initializes jTextFieldNroEstablec	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroEstablec() {
		if (jTextFieldNroEstablec == null) {
			jTextFieldNroEstablec = new JTextField();
			jTextFieldNroEstablec.setBounds(new Rectangle(513, 44, 155, 19));
		}
		return jTextFieldNroEstablec;
	}

	/**
	 * This method initializes jButtonGuardar1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGuardar1() {
		if (jButtonGuardar1 == null) {
			jButtonGuardar1 = new JButton();
			jButtonGuardar1.setBounds(new Rectangle(486, 348, 124, 31));
			jButtonGuardar1.setText("Guardar");
		}
		return jButtonGuardar1;
	}

	/**
	 * This method initializes jButtonCancelar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton();
			jButtonCancelar.setBounds(new Rectangle(616, 350, 126, 30));
			jButtonCancelar.setText("Cancelar");
		}
		return jButtonCancelar;
	}

	/**
	 * This method initializes jLabelEmpresa	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabelEmpresa() {
		if (jLabelEmpresa == null) {
			jLabelEmpresa = new JLabel();
			jLabelEmpresa.setText("Nombre de la empresa");
			jLabelEmpresa.setBounds(new Rectangle(10, 21, 159, 19));
		}
		return jLabelEmpresa;
	}

	/**
	 * This method initializes jTextFieldNombEmpresa	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombEmpresa() {
		if (jTextFieldNombEmpresa == null) {
			jTextFieldNombEmpresa = new JTextField();
			jTextFieldNombEmpresa.setBounds(new Rectangle(10, 44, 159, 19));
		}
		return jTextFieldNombEmpresa;
	}

	/**
	 * This method initializes jTextFieldCuit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCuit() {
		if (jTextFieldCuit == null) {
			jTextFieldCuit = new JTextField();
			jTextFieldCuit.setBounds(new Rectangle(10, 93, 159, 19));
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
			jTextFieldDomicilio.setBounds(new Rectangle(10, 141, 159, 19));
		}
		return jTextFieldDomicilio;
	}

	/**
	 * This method initializes jTextFieldActEconomica	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldActEconomica() {
		if (jTextFieldActEconomica == null) {
			jTextFieldActEconomica = new JTextField();
			jTextFieldActEconomica.setBounds(new Rectangle(267, 44, 208, 19));
		}
		return jTextFieldActEconomica;
	}

	/**
	 * This method initializes jTextFieldSuperficie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSuperficie() {
		if (jTextFieldSuperficie == null) {
			jTextFieldSuperficie = new JTextField();
			jTextFieldSuperficie.setBounds(new Rectangle(267, 93, 208, 19));
		}
		return jTextFieldSuperficie;
	}

	/**
	 * This method initializes jTextFieldTrabajadores	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTrabajadores() {
		if (jTextFieldTrabajadores == null) {
			jTextFieldTrabajadores = new JTextField();
			jTextFieldTrabajadores.setBounds(new Rectangle(267, 141, 208, 19));
		}
		return jTextFieldTrabajadores;
	}

	/**
	 * This method initializes jTextFieldNroTotalEstablec	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroTotalEstablec() {
		if (jTextFieldNroTotalEstablec == null) {
			jTextFieldNroTotalEstablec = new JTextField();
			jTextFieldNroTotalEstablec.setBounds(new Rectangle(267, 189, 208, 19));
		}
		return jTextFieldNroTotalEstablec;
	}

	/**
	 * This method initializes jTextFieldLocalidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalidad() {
		if (jTextFieldLocalidad == null) {
			jTextFieldLocalidad = new JTextField();
			jTextFieldLocalidad.setBounds(new Rectangle(10, 189, 159, 19));
		}
		return jTextFieldLocalidad;
	}

	/**
	 * This method initializes jTextFieldContrato	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldContrato() {
		if (jTextFieldContrato == null) {
			jTextFieldContrato = new JTextField();
			jTextFieldContrato.setBounds(new Rectangle(513, 89, 155, 19));
		}
		return jTextFieldContrato;
	}

	/**
	 * This method initializes jTextFieldProvincia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProvincia() {
		if (jTextFieldProvincia == null) {
			jTextFieldProvincia = new JTextField();
			jTextFieldProvincia.setBounds(new Rectangle(513, 134, 155, 19));
		}
		return jTextFieldProvincia;
	}

	/**
	 * This method initializes jTextFieldCodPostal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodPostal() {
		if (jTextFieldCodPostal == null) {
			jTextFieldCodPostal = new JTextField();
			jTextFieldCodPostal.setBounds(new Rectangle(513, 182, 155, 19));
		}
		return jTextFieldCodPostal;
	}

	/**
	 * This method initializes jButtonCond	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCond() {
		if (jButtonCond == null) {
			jButtonCond = new JButton();
			jButtonCond.setBounds(new Rectangle(24, 344, 122, 30));
			jButtonCond.setText("Condiciones");
			jButtonCond.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				Condiciones con=new  Condiciones();
				con.setLocationRelativeTo(jButtonCancelar);
				con.setVisible(true);
				
				}
			});
		}
		return jButtonCond;
	}

	/**
	 * This method initializes jButtonGuardar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

}  //  @jve:decl-index=0:visual-constraint="10,10"
