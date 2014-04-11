package pantallasABM;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class Altaestablecimiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanelAltaEstablecimientos = null;
	private JLabel jLabelNombre = null;
	private Choice choiceEmpresas = null;
	private JLabel jLabelSuperficie = null;
	private JTextField jTextFieldMetrosCuadrados = null;
	private JLabel jLabelCantTrabajadores = null;
	private JTextField jTextFieldTrabajadores = null;
	private JLabel jLabeldomicilio = null;
	private JLabel jLabelLocalidad = null;
	private JLabel jLabelProvincia = null;
	private JLabel jLabelCP = null;

	/**
	 * This is the default constructor
	 */
	public Altaestablecimiento() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(738, 283);
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
			jLabelCP = new JLabel();
			jLabelCP.setBounds(new Rectangle(376, 142, 59, 21));
			jLabelCP.setText("CP/CPA");
			jLabelProvincia = new JLabel();
			jLabelProvincia.setBounds(new Rectangle(374, 103, 179, 20));
			jLabelProvincia.setText("Provincia");
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setBounds(new Rectangle(374, 62, 306, 21));
			jLabelLocalidad.setText("Localidad");
			jLabeldomicilio = new JLabel();
			jLabeldomicilio.setBounds(new Rectangle(372, 15, 309, 25));
			jLabeldomicilio.setText("Domicilio");
			jLabelCantTrabajadores = new JLabel();
			jLabelCantTrabajadores.setBounds(new Rectangle(12, 124, 188, 26));
			jLabelCantTrabajadores.setText("Cantidad de Trabajadores");
			jLabelSuperficie = new JLabel();
			jLabelSuperficie.setBounds(new Rectangle(10, 64, 190, 25));
			jLabelSuperficie.setText("Superficie en Metros Cuadrados");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(9, 10, 138, 18));
			jLabelNombre.setText("Nombre de la Empresa");
			jPanelAltaEstablecimientos = new JPanel();
			jPanelAltaEstablecimientos.setLayout(null);
			jPanelAltaEstablecimientos.setBounds(new Rectangle(10, 8, 710, 240));
			jPanelAltaEstablecimientos.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanelAltaEstablecimientos.add(jLabelNombre, null);
			jPanelAltaEstablecimientos.add(getChoiceEmpresas(), null);
			jPanelAltaEstablecimientos.add(jLabelSuperficie, null);
			jPanelAltaEstablecimientos.add(getJTextFieldMetrosCuadrados(), null);
			jPanelAltaEstablecimientos.add(jLabelCantTrabajadores, null);
			jPanelAltaEstablecimientos.add(getJTextFieldTrabajadores(), null);
			jPanelAltaEstablecimientos.add(jLabeldomicilio, null);
			jPanelAltaEstablecimientos.add(jLabelLocalidad, null);
			jPanelAltaEstablecimientos.add(jLabelProvincia, null);
			jPanelAltaEstablecimientos.add(jLabelCP, null);
		}
		return jPanelAltaEstablecimientos;
	}

	/**
	 * This method initializes choiceEmpresas	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceEmpresas() {
		if (choiceEmpresas == null) {
			choiceEmpresas = new Choice();
			choiceEmpresas.setBounds(new Rectangle(9, 30, 321, 22));
		}
		return choiceEmpresas;
	}

	/**
	 * This method initializes jTextFieldMetrosCuadrados	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMetrosCuadrados() {
		if (jTextFieldMetrosCuadrados == null) {
			jTextFieldMetrosCuadrados = new JTextField();
			jTextFieldMetrosCuadrados.setBounds(new Rectangle(11, 95, 188, 25));
		}
		return jTextFieldMetrosCuadrados;
	}

	/**
	 * This method initializes jTextFieldTrabajadores	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTrabajadores() {
		if (jTextFieldTrabajadores == null) {
			jTextFieldTrabajadores = new JTextField();
			jTextFieldTrabajadores.setBounds(new Rectangle(13, 154, 186, 26));
		}
		return jTextFieldTrabajadores;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
