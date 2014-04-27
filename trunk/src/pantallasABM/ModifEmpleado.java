package pantallasABM;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import persistencia.Hibernate;

import Base.metodosSql;
import ObjetosPersistentes.Empleado;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("unused")
public class ModifEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelCuil = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelApellido = null;
	private JLabel jLabelSexo = null;
	private JLabel jLabelPuesto = null;
	private JLabel jLabelTurno = null;
	private JLabel jLabelEmpresa = null;
	private JTextField jTextFieldCuil = null;
	private JTextField jTextFieldNombre = null;
	private JTextField jTextFieldApellido = null;
	private JComboBox<String> jComboBoxSexo = null;
	private JComboBox<String> jComboBoxPuesto = null;
	private JComboBox<String> jComboBoxTurno = null;
	private JComboBox<String> jComboBoxEmpresaDepto = null;
	private JButton jButtonModificacion = null;
	private JButton jButtonBorrar = null;
	private JScrollPane jScrollPaneEmpleados = null;
	private JTable jTableEmpleados = null;
	/**
	 * This is the default constructor
	 */
	public ModifEmpleado() {
		super();
		initialize();
	}
	
	private void refreshTabla(){
		metodosSql metodos=new metodosSql();
		metodos.llenarJtable(jTableEmpleados, "select * from empleado");
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1265, 350);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/Profile.png")));
		this.setContentPane(getJContentPane());
		this.setTitle("Modificación de empleados");
		metodosSql metodos=new metodosSql();
		try {
			String consulta="SELECT concat('EMPRESA NOMBRE :', e.nombre,'||NOMBRE DEPTO :' " +
					" ,c.nombre,'||NRO_DEPTO :',c.idcliente) FROM cliente c,empresa e " +
					" where c.empresa_cuit=e.cuit_cuip;";
			metodos.llenarComboBox(jComboBoxEmpresaDepto,consulta);
			refreshTabla();
		} catch (SQLException e) {
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
			jLabelEmpresa = new JLabel();
			jLabelEmpresa.setBounds(new Rectangle(11, 273, 139, 28));
			jLabelEmpresa.setText("Empresa/Departamento");
			jLabelTurno = new JLabel();
			jLabelTurno.setBounds(new Rectangle(11, 230, 133, 28));
			jLabelTurno.setText("Turno");
			jLabelPuesto = new JLabel();
			jLabelPuesto.setBounds(new Rectangle(11, 187, 135, 28));
			jLabelPuesto.setText("Tipo de puesto");
			jLabelSexo = new JLabel();
			jLabelSexo.setBounds(new Rectangle(11, 144, 134, 28));
			jLabelSexo.setText("Sexo");
			jLabelApellido = new JLabel();
			jLabelApellido.setBounds(new Rectangle(11, 101, 133, 28));
			jLabelApellido.setText("Apellido");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(11, 58, 132, 28));
			jLabelNombre.setText("Nombre");
			jLabelCuil = new JLabel();
			jLabelCuil.setBounds(new Rectangle(11, 15, 133, 28));
			jLabelCuil.setText("Cuil");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBorder(BorderFactory.createTitledBorder(null, "Modificación de Empleados", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, null, null));
			jContentPane.add(jLabelCuil, null);
			jContentPane.add(jLabelNombre, null);
			jContentPane.add(jLabelApellido, null);
			jContentPane.add(jLabelSexo, null);
			jContentPane.add(jLabelPuesto, null);
			jContentPane.add(jLabelTurno, null);
			jContentPane.add(jLabelEmpresa, null);
			jContentPane.add(getJTextFieldCuil(), null);
			jContentPane.add(getJTextFieldNombre(), null);
			jContentPane.add(getJTextFieldApellido(), null);
			jContentPane.add(getJComboBoxSexo(), null);
			jContentPane.add(getJComboBoxPuesto(), null);
			jContentPane.add(getJComboBoxTurno(), null);
			jContentPane.add(getJComboBoxEmpresaDepto(), null);
			jContentPane.add(getJButtonModificacion(), null);
			jContentPane.add(getJButtonBorrar(), null);
			jContentPane.add(getJScrollPaneEmpleados(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldCuil	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCuil() {
		if (jTextFieldCuil == null) {
			jTextFieldCuil = new JTextField();
			jTextFieldCuil.setBounds(new Rectangle(153, 15, 296, 28));
		}
		return jTextFieldCuil;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(153, 58, 296, 28));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldApellido	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldApellido() {
		if (jTextFieldApellido == null) {
			jTextFieldApellido = new JTextField();
			jTextFieldApellido.setBounds(new Rectangle(153, 101, 296, 28));
		}
		return jTextFieldApellido;
	}

	/**
	 * This method initializes jComboBoxSexo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxSexo() {
		if (jComboBoxSexo == null) {
			jComboBoxSexo = new JComboBox<String>();
			jComboBoxSexo.setBounds(new Rectangle(153, 144, 296, 28));
			jComboBoxSexo.addItem("Femenino");
			jComboBoxSexo.addItem("Masculino");
		}
		return jComboBoxSexo;
	}

	/**
	 * This method initializes jComboBoxPuesto	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxPuesto() {
		if (jComboBoxPuesto == null) {
			jComboBoxPuesto = new JComboBox<String>();
			jComboBoxPuesto.setBounds(new Rectangle(153, 187, 296, 28));
			jComboBoxPuesto.addItem("Administrativo");
			jComboBoxPuesto.addItem("Operario");
			
		}
		return jComboBoxPuesto;
	}

	/**
	 * This method initializes jComboBoxTurno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxTurno() {
		if (jComboBoxTurno == null) {
			jComboBoxTurno = new JComboBox<String>();
			jComboBoxTurno.setBounds(new Rectangle(153, 230, 296, 28));
			jComboBoxTurno.addItem("Mañana");
			jComboBoxTurno.addItem("Tarde");
			jComboBoxTurno.addItem("Noche");
		}
		return jComboBoxTurno;
	}

	private void limpiarCampos(){
		jTextFieldApellido.setText("");
		jTextFieldCuil.setText("");
		jTextFieldNombre.setText("");
		jComboBoxEmpresaDepto.setSelectedIndex(0);
		jComboBoxPuesto.setSelectedIndex(0);
		jComboBoxSexo.setSelectedIndex(0);
		jComboBoxTurno.setSelectedIndex(0);
	}
	/**
	 * This method initializes jComboBoxEmpresaDepto	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxEmpresaDepto() {
		if (jComboBoxEmpresaDepto == null) {
			jComboBoxEmpresaDepto = new JComboBox<String>();
			jComboBoxEmpresaDepto.setBounds(new Rectangle(153, 273, 768, 28));
		}
		return jComboBoxEmpresaDepto;
	}
	private boolean hayCamposVacios(){
		if(jTextFieldApellido.getText().isEmpty()||jTextFieldCuil.getText().isEmpty()||jTextFieldApellido.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Complete todos los campos en blanco");
			return true;
		}
		return false;
		
	}

	/**
	 * This method initializes jButtonModificacion	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificacion() {
		if (jButtonModificacion == null) {
			jButtonModificacion = new JButton();
			jButtonModificacion.setBounds(new Rectangle(930, 273, 153, 29));
			jButtonModificacion.setText("Modificar");
			jButtonModificacion.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					if(!hayCamposVacios()){
					String seleccion=jComboBoxEmpresaDepto.getSelectedItem().toString();
					int ultimoIndice=seleccion.lastIndexOf("NRO_DEPTO :");
					ultimoIndice=ultimoIndice+11;//lo que esta después de NRO_DEPTO :				
					
					//System.out.println(seleccion.substring(ultimoIndice)); // TODO Auto-generated Event stub actionPerformed()
						
					Empleado emp=new Empleado();
					emp.setNombre(jTextFieldNombre.getText().toUpperCase());
					emp.setApellido(jTextFieldApellido.getText().toUpperCase());
					emp.setCuil(jTextFieldCuil.getText().toUpperCase());
					emp.setEmpresa(seleccion.substring(ultimoIndice));
					emp.setPuesto(jComboBoxPuesto.getSelectedItem().toString());
					emp.setSexo(jComboBoxSexo.getSelectedItem().toString());
					emp.setTurno(jComboBoxTurno.getSelectedItem().toString());
					
					int status=Hibernate.modificarObjeto(emp);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Datos guardados OK!");
						refreshTabla();
					}else{
						JOptionPane.showMessageDialog(null,"Error, no se guardaron los datos ");
						
					}
					
					
					}
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error, no se guardaron los datos "+e1.getMessage());
						if(e1.getMessage().contains("nested transactions")){
							JOptionPane.showMessageDialog(null,"Error, no se guardaron los datos, la ventana se cerrará. Vuelva a abrirla y continúe");
							dispose();
						}
						
					}
					
					
					}
			});
			
			jButtonModificacion.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						jButtonModificacion.doClick();
					}
				}
			});
		}
		return jButtonModificacion;
	}

	/**
	 * This method initializes jButtonBorrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBorrar() {
		if (jButtonBorrar == null) {
			jButtonBorrar = new JButton();
			jButtonBorrar.setBounds(new Rectangle(1091, 273, 153, 29));
			jButtonBorrar.setText("Borrar");
			jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jTableEmpleados.getSelectedRow()!=-1){
					int status=0;
					String cuilEmpleado=(String) jTableEmpleados.getValueAt(jTableEmpleados.getSelectedRow(), jTableEmpleados.getColumn("CUIL").getModelIndex());;
					Empleado emp=new Empleado();
					emp=(Empleado) Hibernate.dameObjeto(cuilEmpleado, emp);
					status=Hibernate.borrarObjeto(emp);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Borrado exitoso!");
						refreshTabla();
						limpiarCampos();
					}else{
						JOptionPane.showMessageDialog(null,"Hubo un problema al borrar, reintente");
					}
					}else{
						
						JOptionPane.showMessageDialog(null,"Seleccione elemento de la tabla para borrar");
						
					}
					
				}
			});
		}
		return jButtonBorrar;
	}

	/**
	 * This method initializes jScrollPaneEmpleados	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneEmpleados() {
		if (jScrollPaneEmpleados == null) {
			jScrollPaneEmpleados = new JScrollPane();
			jScrollPaneEmpleados.setBounds(new Rectangle(458, 15, 785, 199));
			jScrollPaneEmpleados.setViewportView(getJTableEmpleados());
		}
		return jScrollPaneEmpleados;
	}

	/**
	 * This method initializes jTableEmpleados	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableEmpleados() {
		if (jTableEmpleados == null) {
			jTableEmpleados = new JTable();
			jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String cuilEmpleado=(String) jTableEmpleados.getValueAt(jTableEmpleados.getSelectedRow(), jTableEmpleados.getColumn("CUIL").getModelIndex());;
					Empleado emp=new Empleado();
					emp=(Empleado) Hibernate.dameObjeto(cuilEmpleado, emp);
					jTextFieldCuil.setText(emp.getCuil());
					jTextFieldNombre.setText(emp.getNombre());
					jTextFieldApellido.setText(emp.getApellido());
					jComboBoxSexo.setSelectedItem(emp.getSexo());
					jComboBoxPuesto.setSelectedItem(emp.getPuesto());
					jComboBoxTurno.setSelectedItem(emp.getTurno());
					String seleccion=null;
					int ultimoIndice=0;
					
					for(int i=0;i<jComboBoxEmpresaDepto.getItemCount();i++){
						
							
					   seleccion=jComboBoxEmpresaDepto.getItemAt(i).toString();
					   ultimoIndice=seleccion.lastIndexOf("NRO_DEPTO :");
					   ultimoIndice=ultimoIndice+11;//lo que esta después de NRO_DEPTO :				
						System.out.println("*"+seleccion.substring(ultimoIndice)+"*");
						if(seleccion.substring(ultimoIndice).equals(emp.getEmpresa())){
								jComboBoxEmpresaDepto.setSelectedIndex(i);
						}else{
							jComboBoxEmpresaDepto.setSelectedItem("Seleccione...");
						}
					}				
				
				
				}
			});
		}
		return jTableEmpleados;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
