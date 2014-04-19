package pantallasABM;

import herramientas.FileChooser;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import javax.swing.JTable;

import Base.metodosSql;
import ObjetosPersistentes.Empresa;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import persistencia.Hibernate;
import util.HibernateUtil;

@SuppressWarnings("unused")
public class ModifEmpresa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPaneEmpresas = null;
	private JTable jTableEmpresas = null;
	private JTextField jTextFieldCuit = null;
	private JTextField jTextFieldNombre = null;
	private JTextField jTextFieldDomicilio = null;
	private JTextField jTextFieldLocalidad = null;
	private JTextField jTextFieldActividadEconomica = null;
	private JTextField jTextFieldCppa = null;
	private JTextField jTextFieldProvincia = null;
	private JTextField jTextFieldContrato = null;
	private JTextField jTextFieldEmail = null;
	private JTextField jTextFieldTelefono = null;
	private JLabel jLabelCuit = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelDomicilio = null;
	private JLabel jLabellOCALIDAD = null;
	private JLabel jLabelActividadEc = null;
	private JLabel jLabelCodPostal = null;
	private JLabel jLabelProvincia = null;
	private JLabel jLabelContratoNro = null;
	private JLabel jLabelEmail = null;
	private JLabel jLabelTelefono = null;
	private JButton jButtonModificar = null;
	private JButton jButtonBorrar = null;
	private JLabel jLabelLogo = null;
	private JPanel jPanelLogo = null;
	private JLabel jLabellOGO = null;
	private JButton jButtonlOGO = null;
	private JCheckBox jCheckBoxbORRAR = null;
	private JLabel jLabel = null;
	private String rutaLogo=null;
	private JButton jButtonModificarCuit = null;
	private JCheckBox jCheckBoxModifCuit = null;
	private JLabel jLabel1 = null;
	/**
	 * This is the default constructor
	 */
	public ModifEmpresa() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void llenarTablaEmpresa(){
		
		metodosSql metodos= new metodosSql();
		metodos.llenarJtable(jTableEmpresas, "SELECT cuit_cuip as CUIT,NOMBRE,DOMICILIO,LOCALIDAD,ACTIVIDAD_ECONOMICA AS ACT_ECONOMICA,CP_CPA,PROVINCIA,CONTRATO,EMAIL,TELEFONO FROM empresa;");
	}
	private void initialize() {
		this.setSize(1001, 589);
		this.setContentPane(getJContentPane());
		this.setTitle("Modificación de Empresas");
		llenarTablaEmpresa();
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(65, 207, 147, 30));
			jLabel1.setText("Tilde para modificar CUIT");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(771, 497, 221, 17));
			jLabel.setText("Presione el tílde para activar borrado");
			jLabellOGO = new JLabel();
			jLabellOGO.setBounds(new Rectangle(779, 209, 120, 23));
			jLabellOGO.setText("LOGO");
			jLabelLogo = new JLabel();
			jLabelLogo.setBackground(new Color(51, 0, 204));
			jLabelLogo.setBounds(new Rectangle(4, 4, 202, 165));
			jLabelLogo.setText("");
			jLabelTelefono = new JLabel();
			jLabelTelefono.setBounds(new Rectangle(440, 489, 330, 32));
			jLabelTelefono.setText("TELEFONO");
			jLabelEmail = new JLabel();
			jLabelEmail.setBounds(new Rectangle(440, 416, 331, 31));
			jLabelEmail.setText("EMAIL");
			jLabelContratoNro = new JLabel();
			jLabelContratoNro.setBounds(new Rectangle(440, 342, 328, 31));
			jLabelContratoNro.setText("CONTRATO NRO");
			jLabelProvincia = new JLabel();
			jLabelProvincia.setBounds(new Rectangle(440, 273, 210, 29));
			jLabelProvincia.setText("PROVINCIA");
			jLabelCodPostal = new JLabel();
			jLabelCodPostal.setBounds(new Rectangle(440, 211, 194, 26));
			jLabelCodPostal.setText("CODIGO POSTAL");
			jLabelActividadEc = new JLabel();
			jLabelActividadEc.setBounds(new Rectangle(8, 486, 149, 34));
			jLabelActividadEc.setText("ACTIVIDAD ECONÓMICA");
			jLabellOCALIDAD = new JLabel();
			jLabellOCALIDAD.setBounds(new Rectangle(7, 420, 74, 28));
			jLabellOCALIDAD.setText("LOCALIDAD");
			jLabelDomicilio = new JLabel();
			jLabelDomicilio.setBounds(new Rectangle(8, 345, 67, 28));
			jLabelDomicilio.setText("DOMICILIO");
			jLabelNombre = new JLabel();
			jLabelNombre.setBounds(new Rectangle(9, 275, 155, 26));
			jLabelNombre.setText("NOMBRE DE LA EMPRESA");
			jLabelCuit = new JLabel();
			jLabelCuit.setBounds(new Rectangle(8, 208, 33, 27));
			jLabelCuit.setText("CUIT");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPaneEmpresas(), null);
			jContentPane.add(getJTextFieldCuit(), null);
			jContentPane.add(getJTextFieldNombre(), null);
			jContentPane.add(getJTextFieldDomicilio(), null);
			jContentPane.add(getJTextFieldLocalidad(), null);
			jContentPane.add(getJTextFieldActividadEconomica(), null);
			jContentPane.add(getJTextFieldCppa(), null);
			jContentPane.add(getJTextFieldProvincia(), null);
			jContentPane.add(getJTextFieldContrato(), null);
			jContentPane.add(getJTextFieldEmail(), null);
			jContentPane.add(getJTextFieldTelefono(), null);
			jContentPane.add(jLabelCuit, null);
			jContentPane.add(jLabelNombre, null);
			jContentPane.add(jLabelDomicilio, null);
			jContentPane.add(jLabellOCALIDAD, null);
			jContentPane.add(jLabelActividadEc, null);
			jContentPane.add(jLabelCodPostal, null);
			jContentPane.add(jLabelProvincia, null);
			jContentPane.add(jLabelContratoNro, null);
			jContentPane.add(jLabelEmail, null);
			jContentPane.add(jLabelTelefono, null);
			jContentPane.add(getJButtonModificar(), null);
			jContentPane.add(getJButtonBorrar(), null);
			jContentPane.add(getJPanelLogo(), null);
			jContentPane.add(jLabellOGO, null);
			jContentPane.add(getJButtonlOGO(), null);
			jContentPane.add(getJCheckBoxbORRAR(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJButtonModificarCuit(), null);
			jContentPane.add(getJCheckBoxModifCuit(), null);
			jContentPane.add(jLabel1, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPaneEmpresas	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneEmpresas() {
		if (jScrollPaneEmpresas == null) {
			jScrollPaneEmpresas = new JScrollPane();
			jScrollPaneEmpresas.setBounds(new Rectangle(14, 13, 968, 178));
			jScrollPaneEmpresas.setViewportView(getJTableEmpresas());
		}
		return jScrollPaneEmpresas;
	}

	private void vaciarCampos(){
		jTextFieldCuit.setText("");
		jTextFieldNombre.setText("");
		jTextFieldDomicilio.setText("");
		jTextFieldLocalidad.setText("");
		jTextFieldActividadEconomica.setText("");
		jTextFieldCppa.setText("");
		jTextFieldProvincia.setText("");
		jTextFieldContrato.setText("");
		jTextFieldEmail.setText("");
		jTextFieldTelefono.setText("");
		jLabelLogo.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));;
		
	}
	/**
	 * This method initializes jTableEmpresas	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableEmpresas() {
		if (jTableEmpresas == null) {
			jTableEmpresas = new JTable();
			jTableEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
				vaciarCampos();
				String cuit=jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(),0).toString();
				System.out.println(cuit);
				try{
					String l = cuit;
					System.out.println("Esto es l="+l);
					
					Empresa emp=new Empresa();
					
					emp=(Empresa) Hibernate.dameObjeto(l, emp);
					
					System.out.println();
					jTextFieldCuit.setText(String.valueOf(emp.getCuit_cuip()));
					jTextFieldNombre.setText(emp.getNombre());
					jTextFieldDomicilio.setText(emp.getDomicilio());
					jTextFieldLocalidad.setText(emp.getLocalidad());
					jTextFieldActividadEconomica.setText(emp.getActividad_economica());
					jTextFieldCppa.setText(String.valueOf(emp.getCp_cpa()));
					jTextFieldProvincia.setText(emp.getProvincia());
					jTextFieldContrato.setText(emp.getContrato());
					jTextFieldEmail.setText(emp.geteMail());
					jTextFieldTelefono.setText(emp.getTelefono());
					
					ImageIcon icono=null;
					metodosSql metodos=new metodosSql();
					
					icono=metodos.dameImagen("select logo from empresa where cuit_cuip= '"+emp.getCuit_cuip()+"';","logo");
				
					if(icono!=null){
					ImageIcon ok=new ImageIcon(icono.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(), Image.SCALE_DEFAULT));
					jLabelLogo.setIcon(ok);
					}else{
						jLabelLogo.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));;
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "AL MODIFICAR UN ***CLAVE PRIMARIA*** EL PROGRAMA NECESITA REINICIARSE PARA MOSTRAR CORRECTAMENTE ÉSE REGISTRO,\n CIERRE EL PROGRAMA ***COMPLETAMENTE*** Y VUELA A ABRIRLO" );
					llenarTablaEmpresa();
					e1.printStackTrace();
					
				}
				
				}
			});
		}
		return jTableEmpresas;
	}

	/**
	 * This method initializes jTextFieldCuit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCuit() {
		if (jTextFieldCuit == null) {
			jTextFieldCuit = new JTextField();
			jTextFieldCuit.setBounds(new Rectangle(7, 238, 404, 35));
			jTextFieldCuit.setEditable(false);
		}
		return jTextFieldCuit;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(7, 303, 404, 35));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldDomicilio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDomicilio() {
		if (jTextFieldDomicilio == null) {
			jTextFieldDomicilio = new JTextField();
			jTextFieldDomicilio.setBounds(new Rectangle(7, 376, 404, 35));
		}
		return jTextFieldDomicilio;
	}

	/**
	 * This method initializes jTextFieldLocalidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalidad() {
		if (jTextFieldLocalidad == null) {
			jTextFieldLocalidad = new JTextField();
			jTextFieldLocalidad.setBounds(new Rectangle(7, 451, 404, 35));
		}
		return jTextFieldLocalidad;
	}

	/**
	 * This method initializes jTextFieldActividadEconomica	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldActividadEconomica() {
		if (jTextFieldActividadEconomica == null) {
			jTextFieldActividadEconomica = new JTextField();
			jTextFieldActividadEconomica.setBounds(new Rectangle(7, 523, 404, 35));
		}
		return jTextFieldActividadEconomica;
	}

	/**
	 * This method initializes jTextFieldCppa	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCppa() {
		if (jTextFieldCppa == null) {
			jTextFieldCppa = new JTextField();
			jTextFieldCppa.setBounds(new Rectangle(440, 238, 336, 35));
		}
		return jTextFieldCppa;
	}

	/**
	 * This method initializes jTextFieldProvincia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProvincia() {
		if (jTextFieldProvincia == null) {
			jTextFieldProvincia = new JTextField();
			jTextFieldProvincia.setBounds(new Rectangle(440, 303, 336, 35));
		}
		return jTextFieldProvincia;
	}

	/**
	 * This method initializes jTextFieldContrato	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldContrato() {
		if (jTextFieldContrato == null) {
			jTextFieldContrato = new JTextField();
			jTextFieldContrato.setBounds(new Rectangle(440, 376, 336, 35));
		}
		return jTextFieldContrato;
	}

	/**
	 * This method initializes jTextFieldEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEmail() {
		if (jTextFieldEmail == null) {
			jTextFieldEmail = new JTextField();
			jTextFieldEmail.setBounds(new Rectangle(440, 451, 336, 35));
		}
		return jTextFieldEmail;
	}

	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(440, 523, 336, 35));
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes jButtonModificar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificar() {
		if (jButtonModificar == null) {
			jButtonModificar = new JButton();
			jButtonModificar.setBounds(new Rectangle(781, 411, 200, 46));
			jButtonModificar.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonModificar.setText("MODIFICAR");
			jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						String cuit=jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 0).toString();
						
						
						Empresa emp=new Empresa();
						emp=(Empresa) Hibernate.dameObjeto(cuit,emp);
						
						
						
						emp.setCuit_cuip(jTextFieldCuit.getText());
						emp.setNombre(jTextFieldNombre.getText());
						emp.setDomicilio(jTextFieldDomicilio.getText());
						emp.setLocalidad(jTextFieldLocalidad.getText());
						emp.setActividad_economica(jTextFieldActividadEconomica.getText());
						emp.setCp_cpa(Integer.parseInt(jTextFieldCppa.getText()));
						emp.setProvincia(jTextFieldProvincia.getText());
						emp.setContrato(jTextFieldContrato.getText());
						emp.seteMail(jTextFieldEmail.getText());
						emp.setTelefono(jTextFieldTelefono.getText());
						emp.setLogo(emp.getLogo());
						if(rutaLogo!=null){
							
								File fileMal = new File(rutaLogo);					
						        byte[] bLogo = new byte[(int) fileMal.length()];
						        FileInputStream fileInputStream = new FileInputStream(fileMal);
							     //convert file into array of bytes
							     fileInputStream.read(bLogo);
							     fileInputStream.close();
							     emp.setLogo(bLogo);
							     
							
							
						}
						
						int status=0;
						
						status=Hibernate.modificarObjeto(emp);
						if(status==1){
							JOptionPane.showMessageDialog(null,"Guardado Correcto!");
						}else{
							JOptionPane.showMessageDialog(null,"Carga fallida, reintente");
						}
						llenarTablaEmpresa();
						
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error! "+e1.getMessage());
						llenarTablaEmpresa();
						//e1.printStackTrace();
						
					}
				
				
					
					
					
					
				}
			});
		}
		return jButtonModificar;
	}

	/**
	 * This method initializes jButtonBorrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBorrar() {
		if (jButtonBorrar == null) {
			jButtonBorrar = new JButton();
			jButtonBorrar.setBounds(new Rectangle(873, 517, 116, 39));
			jButtonBorrar.setIcon(new ImageIcon(getClass().getResource("/iconos/Warning.png")));
			jButtonBorrar.setText("BORRAR");
			jButtonBorrar.setEnabled(false);
			jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int accion=JOptionPane.showConfirmDialog(null, "Al borrar un elemento, también borrará T-O-D-O-S los elementos RELACIONADOS A ÉL \n ¿Está completamente seguro?");
				
				if(accion==0){
					if(jTableEmpresas.getSelectedRow()==-1){
						JOptionPane.showMessageDialog(null,"Seleccione un elemento a borrar");//si
						
					}else{
						
						String cuit=jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 0).toString();
						
						
						Empresa emp=new Empresa();
						emp=(Empresa) Hibernate.dameObjeto(cuit,emp);
						int status=0;
						try{
							status=Hibernate.borrarObjeto(emp);
							}catch(Exception e1)
							{JOptionPane.showMessageDialog(null,e1.getMessage());};
						if(status==1){
							JOptionPane.showMessageDialog(null,"Borrado exitoso");//si
							llenarTablaEmpresa();
							vaciarCampos();
						}
						else{
							JOptionPane.showMessageDialog(null,"No se pudo borrar, reintente");
						}
					}
				}if(accion==1){
					JOptionPane.showMessageDialog(null,"No se realizaron cambios");//no
				}if(accion==2){
					JOptionPane.showMessageDialog(null,"No se realizaron cambios");//cancel
				}
				
				
				
				
				
				
				}
				
				
			});
		}
		return jButtonBorrar;
	}

	/**
	 * This method initializes jPanelLogo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelLogo() {
		if (jPanelLogo == null) {
			jPanelLogo = new JPanel();
			jPanelLogo.setLayout(null);
			jPanelLogo.setBounds(new Rectangle(779, 237, 209, 172));
			jPanelLogo.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelLogo.add(jLabelLogo, null);
		}
		return jPanelLogo;
	}

	/**
	 * This method initializes jButtonlOGO	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonlOGO() {
		if (jButtonlOGO == null) {
			jButtonlOGO = new JButton();
			jButtonlOGO.setBounds(new Rectangle(936, 200, 41, 34));
			jButtonlOGO.setIcon(new ImageIcon(getClass().getResource("/iconos/Picture.png")));
			jButtonlOGO.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					rutaLogo=null;
					FileChooser fileChoose=new FileChooser();
					rutaLogo=fileChoose.lanzarSeleccion();	
					
					ImageIcon fot = new ImageIcon(rutaLogo);
		            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(), Image.SCALE_DEFAULT));
		            jLabelLogo.setIcon(icono);
					}catch(Exception e1){
						
						
					}
				}
			});
		}
		return jButtonlOGO;
	}

	/**
	 * This method initializes jCheckBoxbORRAR	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxbORRAR() {
		if (jCheckBoxbORRAR == null) {
			jCheckBoxbORRAR = new JCheckBox();
			jCheckBoxbORRAR.setBounds(new Rectangle(776, 541, 19, 16));
			jCheckBoxbORRAR.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jCheckBoxbORRAR.isSelected()){
						jButtonBorrar.setEnabled(true);
					}else{
						jButtonBorrar.setEnabled(false);
					}
				}
			});
		}
		return jCheckBoxbORRAR;
	}

	/**
	 * This method initializes jButtonModificarCuit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificarCuit() {
		if (jButtonModificarCuit == null) {
			jButtonModificarCuit = new JButton();
			jButtonModificarCuit.setBounds(new Rectangle(288, 207, 122, 30));
			jButtonModificarCuit.setEnabled(false);
			jButtonModificarCuit.setText("Modificar CUIT");
			jButtonModificarCuit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int desicion=JOptionPane.showConfirmDialog(null,"El Cuit es id único y se modifica en cascada, NECESITARÁ CERRAR Y VOLVER A ABRIR EL PROGRAMA PARA VER EL/LOS REGISTROS MODIFICADOS...\n seguro que quiere hacer esto?");
					if(desicion==0){
						if(jTableEmpresas.getSelectedColumn()==-1){
							JOptionPane.showMessageDialog(null,"Seleccione un elemento de la tabla.");
						
						}
						else{
							String valor=JOptionPane.showInputDialog("Modifique el valor",jTextFieldCuit.getText());//=si
						
					try{
						String sentenciaSql="update empresa set cuit_cuip ='"+valor+"' where cuit_cuip ='"+jTextFieldCuit.getText()+"';";
						metodosSql metodos=new metodosSql();						
						int status=metodos.insertarOmodif(sentenciaSql);
						if(status==1){
							JOptionPane.showMessageDialog(null,"Guardado ok");
							
						}else{
							JOptionPane.showMessageDialog(null,"Error!,reintente...");
							llenarTablaEmpresa();
						}
						
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, e1.getLocalizedMessage());
						llenarTablaEmpresa();
						
					}
					
					}
				}
					if(desicion==1){
						JOptionPane.showMessageDialog(null,"No se realizaron cambios");//no
					}
					if(desicion==2){
						JOptionPane.showMessageDialog(null,"No se realizaron cambios");//cancelar
					}
				
				
				}
			});
		}
		return jButtonModificarCuit;
	}

	/**
	 * This method initializes jCheckBoxModifCuit	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxModifCuit() {
		if (jCheckBoxModifCuit == null) {
			jCheckBoxModifCuit = new JCheckBox();
			jCheckBoxModifCuit.setBounds(new Rectangle(44, 208, 22, 15));
			jCheckBoxModifCuit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				if(jCheckBoxModifCuit.isSelected()){
					
					jButtonModificarCuit.setEnabled(true);
				}else{
					jButtonModificarCuit.setEnabled(false);
				}
				
				
				}
			});
		}
		return jCheckBoxModifCuit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
