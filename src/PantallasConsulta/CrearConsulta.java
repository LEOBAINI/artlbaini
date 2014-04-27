package PantallasConsulta;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

import persistencia.Hibernate;

import Base.metodosSql;
import ObjetosPersistentes.Consulta;

@SuppressWarnings("unused")
public class CrearConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextField jTextFieldNombre = null;
	private JTextField jTextFieldDescripcion = null;
	private JEditorPane jEditorPaneQuery = null;
	private JLabel jLabelContador = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelDescripcion = null;
	private JLabel jLabelQuery = null;
	private JButton jButtonVer = null;
	private JButton jButtonGuardar = null;
	/**
	 * This is the default constructor
	 */
	public CrearConsulta() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(858, 313);
		this.setContentPane(getJContentPane());
		this.setTitle("Crear consulta");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelQuery = new JLabel();
			jLabelQuery.setBounds(new Rectangle(15, 119, 155, 26));
			jLabelQuery.setText("Consulta (Query en MySql)");
			jLabelDescripcion = new JLabel();
			jLabelDescripcion.setBounds(new Rectangle(15, 55, 301, 28));
			jLabelDescripcion.setText("Descripción");
			jLabelContador = new JLabel();
			jLabelContador.setBounds(new Rectangle(174, 121, 62, 22));
			jLabelContador.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJTextFieldNombre(), null);
			jContentPane.add(getJTextFieldDescripcion(), null);
			jContentPane.add(getJEditorPaneQuery(), null);
			jContentPane.add(jLabelContador, null);
			jContentPane.add(getJLabelNombre(), null);
			jContentPane.add(jLabelDescripcion, null);
			jContentPane.add(jLabelQuery, null);
			jContentPane.add(getJButtonVer(), null);
			jContentPane.add(getJButtonGuardar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(15, 23, 227, 30));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldDescripcion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDescripcion() {
		if (jTextFieldDescripcion == null) {
			jTextFieldDescripcion = new JTextField();
			jTextFieldDescripcion.setBounds(new Rectangle(15, 86, 625, 32));
		}
		return jTextFieldDescripcion;
	}

	/**
	 * This method initializes jEditorPaneQuery	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getJEditorPaneQuery() {
		if (jEditorPaneQuery == null) {
			jEditorPaneQuery = new JEditorPane();
			jEditorPaneQuery.setBounds(new Rectangle(15, 146, 622, 129));
			
			jEditorPaneQuery.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					jLabelContador.setText(String.valueOf(jEditorPaneQuery.getText().length()));
					if(jEditorPaneQuery.getText().length()>599){
						JOptionPane.showMessageDialog(null,"Supera los 599 caracteres, achique la consulta");
						
					}
				}
			});
		}
		return jEditorPaneQuery;
	}

	/**
	 * This method initializes jLabelNombre	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabelNombre() {
		if (jLabelNombre == null) {
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre de la consulta");
			jLabelNombre.setBounds(new Rectangle(15, -2, 192, 26));
		}
		return jLabelNombre;
	}

	/**
	 * This method initializes jButtonVer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVer() {
		if (jButtonVer == null) {
			jButtonVer = new JButton();
			jButtonVer.setBounds(new Rectangle(651, 6, 108, 26));
			jButtonVer.setText("Ver");
			jButtonVer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					VerConsulta ver=new VerConsulta(jEditorPaneQuery.getText());
					ver.setVisible(true);
					
				}
			});
		}
		return jButtonVer;
	}

	/**
	 * This method initializes jButtonGuardar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGuardar() {
		if (jButtonGuardar == null) {
			jButtonGuardar = new JButton();
			jButtonGuardar.setBounds(new Rectangle(648, 245, 108, 26));
			jButtonGuardar.setText("Guardar");
			jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					try{
					metodosSql metodos=new metodosSql();
					
					if((metodos.consultar(jEditorPaneQuery.getText())!=null)&&(jTextFieldNombre.getText().length()!=0)&&(jTextFieldDescripcion.getText().length()!=0)&&(jEditorPaneQuery.getText().length()!=0)){
					Consulta con=new Consulta();
					con.setNombreConsulta(jTextFieldNombre.getText());
					con.setDescripcion(jTextFieldDescripcion.getText());
					con.setQuery(jEditorPaneQuery.getText());
					int status=0;
					status=Hibernate.guardarObjeto(con);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Guardado ok!");
					}else{
						JOptionPane.showMessageDialog(null,"Falla al guardar");
					}
					}else{
						JOptionPane.showMessageDialog(null,"No se permiten campos vacíos o consultas que no funcionen.");
					}
					}
						catch(Exception e1){
					
						JOptionPane.showMessageDialog(null,"No se guardará una consulta que no funcione.");
					
					}
				}
			});
		}
		return jButtonGuardar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
