package pantallasNoConformidad;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JTextArea;

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

	/**
	 * This is the default constructor
	 */
	public VerFotoYmodificar() {
		super();
		initialize();
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
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelFotoBien = new JLabel();
			jLabelFotoBien.setBounds(new Rectangle(352, 16, 332, 206));
			jLabelFotoBien.setText("JLabel");
			jLabelFotomal = new JLabel();
			jLabelFotomal.setBounds(new Rectangle(12, 18, 333, 204));
			jLabelFotomal.setText("JLabel");
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
			jButtonCambiarFotoMal.setBounds(new Rectangle(12, 223, 107, 31));
			jButtonCambiarFotoMal.setText("Cambiar");
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
			jButtonCambiarFotoBien.setBounds(new Rectangle(353, 223, 107, 31));
			jButtonCambiarFotoBien.setText("Cambiar");
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
			jButtonGuardarCambios.setBounds(new Rectangle(14, 361, 107, 31));
			jButtonGuardarCambios.setText("Guardar ");
		}
		return jButtonGuardarCambios;
	}

	/**
	 * This method initializes jButtonSalir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(583, 364, 107, 31));
			jButtonSalir.setText("Salir");
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
			jButtonBorrar.setBounds(new Rectangle(296, 362, 107, 31));
			jButtonBorrar.setText("Borrar");
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
			jTextAreaDescripcionMal.setBounds(new Rectangle(14, 260, 333, 87));
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
			jTextAreaDescripcionBien.setBounds(new Rectangle(354, 260, 334, 87));
		}
		return jTextAreaDescripcionBien;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
