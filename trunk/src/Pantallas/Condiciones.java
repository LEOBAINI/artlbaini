package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class Condiciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelNro = null;
	private JLabel jLabelCond = null;
	private JLabel jLabelSi = null;
	private JLabel jLabelNo = null;
	private JLabel jLabelNoApl = null;
	private JLabel jLabelFecha = null;
	private JLabel jLabelNorma = null;
	private JLabel jLabelServHig = null;
	private JLabel jLabel1 = null;
	private JCheckBox jCheckBoxhigienesi = null;
	private JCheckBox jCheckBoxhigieneNo = null;
	private JCheckBox jCheckBoxHigieneNoApl = null;
	private JLabel jLabelNorma1 = null;
	private JLabel jLabel_1 = null;
	private JTextField jTextFieldFecha1 = null;
	/**
	 * This is the default constructor
	 */
	public Condiciones() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(923, 293);
		this.setContentPane(getJContentPane());
		this.setTitle("Condiciones a cumplir");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel_1 = new JLabel();
			jLabel_1.setBounds(new Rectangle(12, 64, 186, 21));
			jLabel_1.setText("1");
			jLabelNorma1 = new JLabel();
			jLabelNorma1.setBounds(new Rectangle(777, 64, 133, 21));
			jLabelNorma1.setText("Art. 3, Dec. 1338/96");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(215, 64, 269, 21));
			jLabel1.setText("¿Dispone del Servicio de Higiene y Seguridad?");
			jLabelServHig = new JLabel();
			jLabelServHig.setBounds(new Rectangle(12, 37, 899, 25));
			jLabelServHig.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabelServHig.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelServHig.setBackground(Color.red);
			jLabelServHig.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabelServHig.setForeground(SystemColor.activeCaption);
			jLabelServHig.setText("Servicio de Higiene y seguridad en el trabajo");
			jLabelNorma = new JLabel();
			jLabelNorma.setBounds(new Rectangle(777, 12, 134, 23));
			jLabelNorma.setText("Norma vigente");
			jLabelFecha = new JLabel();
			jLabelFecha.setBounds(new Rectangle(643, 12, 124, 23));
			jLabelFecha.setText("Fecha Regularización");
			jLabelNoApl = new JLabel();
			jLabelNoApl.setBounds(new Rectangle(573, 12, 57, 23));
			jLabelNoApl.setText("N/A");
			jLabelNo = new JLabel();
			jLabelNo.setBounds(new Rectangle(533, 12, 31, 23));
			jLabelNo.setText("No");
			jLabelSi = new JLabel();
			jLabelSi.setBounds(new Rectangle(496, 12, 22, 23));
			jLabelSi.setText("Si");
			jLabelCond = new JLabel();
			jLabelCond.setBounds(new Rectangle(215, 12, 269, 23));
			jLabelCond.setText("Condiciones a cumplir");
			jLabelNro = new JLabel();
			jLabelNro.setBounds(new Rectangle(11, 12, 189, 23));
			jLabelNro.setText("Nro");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(SystemColor.activeCaptionBorder);
			jContentPane.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.darkGray));
			jContentPane.add(jLabelNro, null);
			jContentPane.add(jLabelCond, null);
			jContentPane.add(jLabelSi, null);
			jContentPane.add(jLabelNo, null);
			jContentPane.add(jLabelNoApl, null);
			jContentPane.add(jLabelFecha, null);
			jContentPane.add(jLabelNorma, null);
			jContentPane.add(jLabelServHig, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getJCheckBoxhigienesi(), null);
			jContentPane.add(getJCheckBoxhigieneNo(), null);
			jContentPane.add(getJCheckBoxHigieneNoApl(), null);
			jContentPane.add(jLabelNorma1, null);
			jContentPane.add(jLabel_1, null);
			jContentPane.add(getJTextFieldFecha1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jCheckBoxhigienesi	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxhigienesi() {
		if (jCheckBoxhigienesi == null) {
			jCheckBoxhigienesi = new JCheckBox();
			jCheckBoxhigienesi.setBounds(new Rectangle(495, 64, 25, 21));
		}
		return jCheckBoxhigienesi;
	}

	/**
	 * This method initializes jCheckBoxhigieneNo	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxhigieneNo() {
		if (jCheckBoxhigieneNo == null) {
			jCheckBoxhigieneNo = new JCheckBox();
			jCheckBoxhigieneNo.setBounds(new Rectangle(534, 64, 23, 21));
		}
		return jCheckBoxhigieneNo;
	}

	/**
	 * This method initializes jCheckBoxHigieneNoApl	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxHigieneNoApl() {
		if (jCheckBoxHigieneNoApl == null) {
			jCheckBoxHigieneNoApl = new JCheckBox();
			jCheckBoxHigieneNoApl.setBounds(new Rectangle(573, 64, 25, 21));
		}
		return jCheckBoxHigieneNoApl;
	}

	/**
	 * This method initializes jTextFieldFecha1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFecha1() {
		if (jTextFieldFecha1 == null) {
			jTextFieldFecha1 = new JTextField();
			jTextFieldFecha1.setBounds(new Rectangle(645, 64, 120, 20));
		}
		return jTextFieldFecha1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
