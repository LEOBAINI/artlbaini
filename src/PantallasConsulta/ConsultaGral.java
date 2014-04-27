package PantallasConsulta;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import persistencia.Hibernate;

import Base.metodosSql;
import ObjetosPersistentes.Consulta;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class ConsultaGral extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelConsultasCreadasa = null;
	private JComboBox<String> jComboBoxConsultas = null;
	private JScrollPane jScrollPaneConsultas = null;
	private JTable jTableConsulta = null;
	private JButton jButtonBorrar = null;
	private JLabel jLabelDescripcion = null;

	/**
	 * This is the default constructor
	 */
	public ConsultaGral() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1250, 515);
		this.setContentPane(getJContentPane());
		this.setTitle("Consulta general");
		metodosSql metodos=new metodosSql();
		try {
			metodos.llenarComboBox(jComboBoxConsultas, "select nombreconsulta from consulta");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Error! causa ->"+ e.getMessage());
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
			jLabelDescripcion = new JLabel();
			jLabelDescripcion.setBounds(new Rectangle(154, 3, 809, 26));
			jLabelDescripcion.setText("");
			jLabelConsultasCreadasa = new JLabel();
			jLabelConsultasCreadasa.setBounds(new Rectangle(7, 4, 144, 25));
			jLabelConsultasCreadasa.setText("Consultas almacenadas");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelConsultasCreadasa, null);
			jContentPane.add(getJComboBoxConsultas(), null);
			jContentPane.add(getJScrollPaneConsultas(), null);
			jContentPane.add(getJButtonBorrar(), null);
			jContentPane.add(jLabelDescripcion, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jComboBoxConsultas	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox <String >getJComboBoxConsultas() {
		if (jComboBoxConsultas == null) {
			jComboBoxConsultas = new JComboBox<String>();
			jComboBoxConsultas.setBounds(new Rectangle(8, 32, 857, 29));
			jComboBoxConsultas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					Consulta con=new Consulta();
					con=(Consulta) Hibernate.dameObjeto(jComboBoxConsultas.getSelectedItem().toString(),con);
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableConsulta, con.getQuery());
					jLabelDescripcion.setText(con.getDescripcion());
					}catch(Exception e1){
						
					}
				}
			});
		}
		return jComboBoxConsultas;
	}

	/**
	 * This method initializes jScrollPaneConsultas	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneConsultas() {
		if (jScrollPaneConsultas == null) {
			jScrollPaneConsultas = new JScrollPane();
			jScrollPaneConsultas.setBounds(new Rectangle(8, 65, 1228, 416));
			jScrollPaneConsultas.setViewportView(getJTableConsulta());
		}
		return jScrollPaneConsultas;
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

	/**
	 * This method initializes jButtonBorrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBorrar() {
		if (jButtonBorrar == null) {
			jButtonBorrar = new JButton();
			jButtonBorrar.setBounds(new Rectangle(875, 28, 282, 33));
			jButtonBorrar.setText("Borrar consulta");
			jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					Consulta cons=new Consulta();
					cons=(Consulta) Hibernate.dameObjeto(jComboBoxConsultas.getSelectedItem().toString(), cons);
					int status=0;
					
					status=Hibernate.borrarObjeto(cons);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Guardado ok!");
						jComboBoxConsultas.removeItem(cons.getNombreConsulta());
					}else{
						JOptionPane.showMessageDialog(null,"Error!, dato no borrado ");
					}
					
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error! causa ->"+e1.getMessage());
						
					}
					
					
					
					
					}
					
					
					
					
			});
		}
		return jButtonBorrar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
