package PantallasConsulta;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;

public class PantallaConsultaHistoriaAuditorias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelInfo = null;

	/**
	 * This is the default constructor
	 */
	public PantallaConsultaHistoriaAuditorias() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(765, 381);
		this.setContentPane(getJContentPane());
		this.setTitle("Consulta de historial de auditorias");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelInfo = new JLabel();
			jLabelInfo.setBounds(new Rectangle(4, 4, 146, 22));
			jLabelInfo.setText("Seleccione cliente ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelInfo, null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
