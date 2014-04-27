package PantallasConsulta;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.JLabel;

import Base.metodosSql;

@SuppressWarnings("unused")
public class VerConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPaneConsulta = null;
	private JTable jTableConsulta = null;
	private JLabel jLabelConsulta = null;

	/**
	 * This is the default constructor
	 */
	public VerConsulta(String query) {
		super();
		initialize(query);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize(String query) {
		this.setSize(1255, 403);
		this.setContentPane(getJContentPane());
		this.setTitle("Mostranndo consulta creada");
		jLabelConsulta.setText(query);
		metodosSql metodos=new metodosSql();
		metodos.llenarJtable(jTableConsulta, query);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelConsulta = new JLabel();
			jLabelConsulta.setBounds(new Rectangle(5, 2, 1238, 30));
			jLabelConsulta.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPaneConsulta(), null);
			jContentPane.add(jLabelConsulta, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPaneConsulta	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneConsulta() {
		if (jScrollPaneConsulta == null) {
			jScrollPaneConsulta = new JScrollPane();
			jScrollPaneConsulta.setBounds(new Rectangle(4, 32, 1243, 335));
			jScrollPaneConsulta.setViewportView(getJTableConsulta());
		}
		return jScrollPaneConsulta;
	}

	/**
	 * This method initializes jTableConsulta	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableConsulta() {
		if (jTableConsulta == null) {
			jTableConsulta = new JTable();
		}
		return jTableConsulta;
	}

}  //  @jve:decl-index=0:visual-constraint="5,10"
