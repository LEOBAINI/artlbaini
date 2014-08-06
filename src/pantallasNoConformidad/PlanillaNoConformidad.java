package pantallasNoConformidad;

import herramientas.Calendario;
import herramientas.ColumnResizer;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Choice;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

import com.mysql.jdbc.Blob;

import Base.metodosSql;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import persistencia.Hibernate;

import noConformidad.CategoriaNoConf;
import noConformidad.ComoMitigar;
import noConformidad.ItemNoConf;
import noConformidad.MitigacionItemNoConf;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class PlanillaNoConformidad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelClientes = null;
	private JLabel jLabelCategoriaNoConf = null;
	private Choice choiceCategorias = null;
	private JLabel jLabelItemNoConforme = null;
	private Choice choiceItemsNoConforme = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableNoConformes = null;
	private JMenuBar jJMenuBarNoConforme = null;
	private JButton jButtonCargaMitigacion = null;
	private JButton jButtonAgregar = null;
	private JButton jButtonBorrar = null;
	private JButton jButtonTablaRefresh = null;
	private JPanel jPanelBotonera = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabelCliente = null;
	private JTextField jTextFieldFecha = null;
	private JButton jButtonCalendario = null;
	private JLabel jLabel2 = null;
	private JLabel jLabelItemsDetectados = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTableFotosDeItems = null;
	private JLabel jLabelfotosDeItems = null;
	private JLabel jLabelNombreTabla1 = null;
	private JLabel jLabelNombreTabla2 = null;
	private JLabel jLabelNombreTabla3 = null;
	private JComboBox<String> jComboBoxEmpresa = null;
	private JLabel jLabel3NombreEmpresa = null;
	private JLabel jLabel3Cuit = null;
	private JTextField jTextFieldCuit = null;
	private JComboBox <String>jComboBoxCliente = null;
	private JLabel jLabel3InfoDepto = null;
	private JLabel jLabel3Depto = null;
	private JTextArea jTextArea = null;
	private JButton jButtonSalir = null;
	/**
	 * This is the default constructor
	 */
	public PlanillaNoConformidad() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1246, 604);
		this.setJMenuBar(getJJMenuBarNoConforme());
		this.setContentPane(getJContentPane());
		this.setTitle("Planilla de no conformidad");
		metodosSql metodos=new metodosSql();
		try {
			metodos.llenarComboBox(jComboBoxEmpresa,"select nombre from empresa");
		} catch (Exception e) {
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
			jLabel3Depto = new JLabel();
			jLabel3Depto.setBounds(new Rectangle(217, 81, 46, 33));
			jLabel3Depto.setIcon(new ImageIcon(getClass().getResource("/iconos/Departamento.png")));
			jLabel3Depto.setText("");
			jLabel3InfoDepto = new JLabel();
			jLabel3InfoDepto.setBounds(new Rectangle(281, 115, 368, 24));
			jLabel3InfoDepto.setText("");
			jLabel3Cuit = new JLabel();
			jLabel3Cuit.setBounds(new Rectangle(6, 57, 199, 25));
			jLabel3Cuit.setText("Cuit / Cuip nro");
			jLabel3NombreEmpresa = new JLabel();
			jLabel3NombreEmpresa.setBounds(new Rectangle(6, 2, 297, 22));
			jLabel3NombreEmpresa.setText("Nombre de la Empresa");
			jLabelNombreTabla3 = new JLabel();
			jLabelNombreTabla3.setBounds(new Rectangle(401, 409, 264, 20));
			jLabelNombreTabla3.setText("");
			jLabelNombreTabla2 = new JLabel();
			jLabelNombreTabla2.setText("JLabel");
			jLabelNombreTabla1 = new JLabel();
			jLabelNombreTabla1.setBounds(new Rectangle(225, 235, 292, 20));
			jLabelNombreTabla1.setText("");
			jLabelfotosDeItems = new JLabel();
			jLabelfotosDeItems.setBounds(new Rectangle(9, 410, 389, 18));
			jLabelfotosDeItems.setText("Descripcion y Fotos de Items seleccionados en el cuadro de arriba. ");
			jLabelItemsDetectados = new JLabel();
			jLabelItemsDetectados.setBounds(new Rectangle(9, 235, 203, 21));
			jLabelItemsDetectados.setText("Items detectados con anomalías.");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(800, 157, 183, 19));
			jLabel2.setText("Fecha prometida de correccion");
			jLabelCliente = new JLabel();
			jLabelCliente.setBounds(new Rectangle(307, 2, 31, 26));
			jLabelCliente.setIcon(new ImageIcon(getClass().getResource("/iconos/Profile.png")));
			jLabelCliente.setText("");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(722, 203, 26, 32));
			jLabel1.setIcon(new ImageIcon(getClass().getResource("/iconos/Search.png")));
			jLabel1.setText("");
			jLabel1.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(720, 158, 29, 27));
			jLabel.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel.setIcon(new ImageIcon(getClass().getResource("/iconos/Search.png")));
			jLabel.setText("");
			jLabelItemNoConforme = new JLabel();
			jLabelItemNoConforme.setBounds(new Rectangle(6, 186, 255, 22));
			jLabelItemNoConforme.setText("Seleccione Item No conforme");
			jLabelCategoriaNoConf = new JLabel();
			jLabelCategoriaNoConf.setBounds(new Rectangle(6, 138, 197, 21));
			jLabelCategoriaNoConf.setText("Seleccione Categoria");
			jLabelClientes = new JLabel();
			jLabelClientes.setBounds(new Rectangle(6, 86, 203, 20));
			jLabelClientes.setText("Seleccione Departamento");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelClientes, null);
			jContentPane.add(jLabelCategoriaNoConf, null);
			jContentPane.add(getChoiceCategorias(), null);
			jContentPane.add(jLabelItemNoConforme, null);
			jContentPane.add(getChoiceItemsNoConforme(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJPanelBotonera(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabelCliente, null);
			jContentPane.add(getJTextFieldFecha(), null);
			jContentPane.add(getJButtonCalendario(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabelItemsDetectados, null);
			jContentPane.add(getJScrollPane1(), null);
			jContentPane.add(jLabelfotosDeItems, null);
			jContentPane.add(jLabelNombreTabla1, null);
			jContentPane.add(jLabelNombreTabla2, null);
			jContentPane.add(jLabelNombreTabla3, null);
			jContentPane.add(getJComboBoxEmpresa(), null);
			jContentPane.add(jLabel3NombreEmpresa, null);
			jContentPane.add(jLabel3Cuit, null);
			jContentPane.add(getJTextFieldCuit(), null);
			jContentPane.add(getJComboBoxCliente(), null);
			jContentPane.add(jLabel3InfoDepto, null);
			jContentPane.add(jLabel3Depto, null);
			jContentPane.add(getJTextArea(), null);
			jContentPane.add(getJButtonSalir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes choiceCategorias	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceCategorias() {
		if (choiceCategorias == null) {
			choiceCategorias = new Choice();
			choiceCategorias.setBounds(new Rectangle(6, 163, 712, 21));
			choiceCategorias.addMouseListener(new java.awt.event.MouseAdapter() {   
				  
				public void mousePressed(java.awt.event.MouseEvent e) {    
					
	
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceCategorias, "select TRIM(descripcion) from categoriaplanilla351");
					choiceItemsNoConforme.removeAll();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}
		return choiceCategorias;
	}

	/**
	 * This method initializes choiceItemsNoConforme	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceItemsNoConforme() {
		if (choiceItemsNoConforme == null) {
			choiceItemsNoConforme = new Choice();
			choiceItemsNoConforme.setBounds(new Rectangle(6, 213, 711, 21));
			choiceItemsNoConforme.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					metodosSql metodos=new metodosSql();
					String categoria=choiceCategorias.getSelectedItem();
					
					try {
						int nroCategoria=Integer.parseInt(metodos.consultarUnaColumna("Select TRIM(idcategoria) from shiteckhibernate.categoriaplanilla351 where descripcion = '" +categoria+"'").get(0));
						metodos.llenarChoice(choiceItemsNoConforme, "SELECT descripcion FROM shiteckhibernate.itemnoconf where categorianro="+ nroCategoria);
							
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"Seleccione una categoría primero...");
						//e1.printStackTrace();
						
					}
					
				}
			});
		}
		return choiceItemsNoConforme;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(8, 257, 1094, 150));
			jScrollPane.setViewportView(getJTableNoConformes());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableNoConformes	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableNoConformes() {
		if (jTableNoConformes == null) {
			jTableNoConformes = new JTable();
			jTableNoConformes.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jLabelNombreTabla3.setText("TABLA= como_mitigar");
					String idItemNoConf=null;
					idItemNoConf=jTableNoConformes.getValueAt(jTableNoConformes.getSelectedRow(),0).toString();
					String consulta=null;
					/*consulta="SELECT M.idcomo_mitigar,M.descripcion,M.cumplido as 'ESTA CUMPLIDO'," +
					" M.fechaCumplido as 'FECHA DE CUMPLIMIENTO',COUNT(H.IDCOMOMITIGAR) AS 'VECES RELEVADO' " +
					" FROM shiteckhibernate.como_mitigar M,historialrelevamiento H " +
					" where M.id_item_no_conf ="+idItemNoConf+" AND H.IDCOMOMITIGAR=M.IDCOMO_MITIGAR " +
					" GROUP BY M.IDCOMO_MITIGAR;";*/
					consulta="SELECT idcomo_mitigar as id,descripcion as Anomalia_detectada,descripcionFotoBien as Como_solucionar FROM shiteckhibernate.como_mitigar where id_item_no_conf = "+idItemNoConf;
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableFotosDeItems, consulta);
					if(jTableFotosDeItems.getRowCount()==0){
						JOptionPane.showMessageDialog(null,"Cargue al menos una mitigación");
						jButtonCargaMitigacion.setBackground(Color.green);
						jButtonCargaMitigacion.doClick();
					}
					
					ColumnResizer.adjustColumnPreferredWidths(jTableFotosDeItems);
				}
			});
			
		}
		return jTableNoConformes;
	}

	/**
	 * This method initializes jJMenuBarNoConforme	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBarNoConforme() {
		if (jJMenuBarNoConforme == null) {
			jJMenuBarNoConforme = new JMenuBar();
		}
		return jJMenuBarNoConforme;
	}

	/**
	 * This method initializes jButtonCargaMitigacion	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCargaMitigacion() {
		if (jButtonCargaMitigacion == null) {
			jButtonCargaMitigacion = new JButton();
			jButtonCargaMitigacion.setText("Cargar Mitigacion");
			jButtonCargaMitigacion.setIcon(new ImageIcon(getClass().getResource("/iconos/Next.png")));
			jButtonCargaMitigacion.setBounds(new Rectangle(182, 38, 174, 20));
			jButtonCargaMitigacion.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jButtonCargaMitigacion.setBackground(jButtonAgregar.getBackground());
					int row=jTableNoConformes.getSelectedRow();
					if(row==-1){
						JOptionPane.showMessageDialog(null,"Seleccione una fila para asociar la mitigación");
					}else{
					int fila=row;
					int itemNoConfNro=Integer.parseInt(jTableNoConformes.getValueAt(fila,0).toString());
				
					
					String cliente=jComboBoxCliente.getSelectedItem().toString();
					
					if(cliente!=null && itemNoConfNro!=0){
						Mitigacion mi=new Mitigacion(cliente,itemNoConfNro);
						mi.setVisible(true);
					}else{
						JOptionPane.showMessageDialog(null,"El cliente no debe estar vacio, y debe seleccionar un item no conforme para asociar");
					}
					
					
					
					
					}
					
					
					
				}
			});
			
		}
		return jButtonCargaMitigacion;
	}

	/**
	 * This method initializes jButtonAgregar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAgregar() {
		if (jButtonAgregar == null) {
			jButtonAgregar = new JButton();
			jButtonAgregar.setText("Agregar a la tabla");
			jButtonAgregar.setIcon(new ImageIcon(getClass().getResource("/iconos/Save.png")));
			jButtonAgregar.setBounds(new Rectangle(4, 9, 174, 20));
			jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int hayError=0;
					if(jTextFieldFecha.getText().isEmpty()){
						JOptionPane.showMessageDialog(null,"Seleccione una fecha prometida de correción primero");
						hayError=1;
						
					}
					if(jComboBoxCliente.getSelectedItem()==null || jComboBoxCliente.getSelectedItem().toString().equals("Seleccione...")){
						JOptionPane.showMessageDialog(null,"Seleccione un DEPARTAMENTO primero");
						hayError=1;
					}
					if(choiceCategorias.getSelectedItem()==null){
						JOptionPane.showMessageDialog(null,"Seleccione una categoria primero");
						hayError=1;
						
					}if(choiceItemsNoConforme.getSelectedItem()==null){
						JOptionPane.showMessageDialog(null,"Seleccione un ítem primero");
						hayError=1;
						
					}
					
					if(hayError==0){
					
					metodosSql metodos=new metodosSql();
					try{
					String descripcionItem=choiceItemsNoConforme.getSelectedItem().toString();
					String descripcionCategoria=choiceCategorias.getSelectedItem().toString();
					String sentenciaNroItem="select TRIM(nroitem) from shiteckhibernate.itemnoconf where descripcion='"+descripcionItem+"';";
					String sentenciaNroCategoria="select TRIM(idCategoria) from shiteckhibernate.categoriaplanilla351 where descripcion ='"+descripcionCategoria+"';";
					
					int nroItem=Integer.parseInt(metodos.consultarUnaColumna(sentenciaNroItem).get(0));
					
					int nroCategoria=Integer.parseInt(metodos.consultarUnaColumna(sentenciaNroCategoria).get(0));
					
					MitigacionItemNoConf registroNuevoEnTabla=new MitigacionItemNoConf();
					
					CategoriaNoConf cat=new CategoriaNoConf();
					
					cat.setNroCategoria(nroCategoria);
					
					cat.setDescripcion(choiceCategorias.getSelectedItem());
					
					ItemNoConf item=new ItemNoConf();
					
					item.setDescripcion(choiceItemsNoConforme.getSelectedItem());					
					
					item.setNroItem(nroItem);
					
					item.setDescripcion(choiceItemsNoConforme.getSelectedItem());
					
					registroNuevoEnTabla.setNroCategoriaItem(cat.getNroCategoria());
					
					registroNuevoEnTabla.setEstaCumplido("NO");
					
					registroNuevoEnTabla.setFechaPrometidaParaMitigacion(jTextFieldFecha.getText());
					
					registroNuevoEnTabla.setNroItem(item.getNroItem());
					
					registroNuevoEnTabla.setClienteDeptoNro(jComboBoxCliente.getSelectedItem().toString());
					
					int status=0;
					status=Hibernate.guardarObjeto(registroNuevoEnTabla);
					if(status==1){
					JOptionPane.showMessageDialog(null,"Guardado ok");
					jButtonTablaRefresh.doClick();
					int ultimaFila=jTableNoConformes.getRowCount();
					jTableNoConformes.getSelectionModel().setSelectionInterval(ultimaFila-1,ultimaFila-1);
					jButtonCargaMitigacion.doClick();
					
					}else{
					JOptionPane.showMessageDialog(null,"Error!, reintente.");
					}
					
					}catch(Exception e1){
						
						JOptionPane.showMessageDialog(null,"Error "+ e1.getMessage());
						
					}
					
					}
				}
			});
		}
		return jButtonAgregar;
	}

	/**
	 * This method initializes jButtonBorrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBorrar() {
		if (jButtonBorrar == null) {
			jButtonBorrar = new JButton();
			jButtonBorrar.setText("Borrar de la tabla");
			jButtonBorrar.setIcon(new ImageIcon(getClass().getResource("/iconos/Delete.png")));
			jButtonBorrar.setBounds(new Rectangle(182, 9, 174, 20));
			jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					int seleccion=jTableNoConformes.getSelectedRow();
					if(seleccion==-1){
						JOptionPane.showMessageDialog(null,"Seleccione un elemento a borrar");
					}else{		
					MitigacionItemNoConf registroEnJtableNoConformes=new MitigacionItemNoConf();
					long id=Long.parseLong((String) jTableNoConformes.getValueAt(seleccion,jTableNoConformes.getColumn("ID").getModelIndex()));
					registroEnJtableNoConformes=(MitigacionItemNoConf) Hibernate.dameObjeto(id, registroEnJtableNoConformes);
					int status=Hibernate.borrarObjeto(registroEnJtableNoConformes);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Borrado exitoso");
						jButtonTablaRefresh.doClick();
					}else{
						JOptionPane.showMessageDialog(null,"No se pudo borrar");
					}
					}
					}catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Error, "+ex.getLocalizedMessage());
					}
				}
			});
		}
		return jButtonBorrar;
	}

	/**
	 * This method initializes jButtonTablaRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTablaRefresh() {
		if (jButtonTablaRefresh == null) {
			jButtonTablaRefresh = new JButton();
			jButtonTablaRefresh.setText("TablaRefresh");
			jButtonTablaRefresh.setIcon(new ImageIcon(getClass().getResource("/iconos/Next.png")));
			jButtonTablaRefresh.setBounds(new Rectangle(4, 38, 174, 20));
			jButtonTablaRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String consultaSql=null;
					jLabelNombreTabla1.setText("TABLA= mitigacion_item_no_conf");
					String nroCliente=null;
					nroCliente=jComboBoxCliente.getSelectedItem().toString();
					consultaSql="select `m`.`idmitigacion_item_no_conf` AS `id`,`i`.`nroitem` AS `351`,`i`.`descripcion` AS `descripcion`,`m`.`esta_cumplido` "+
					" AS `esta_cumplido`,`m`.`fecha_prometida_mitigacion`"+
					" AS`fecha_prometida_mitigacion`,`m`.`fecha_cumplida_mitigacion`"+ 
					" AS `fecha_cumplida_mitigacion`,`i`.`norma_vigente`" +
					" from (`mitigacion_item_no_conf` `m` join `itemnoconf` `i`)" +
					" where ((`m`.`cliente_depto_nro` = '"+nroCliente+"') and (`i`.`nroItem` = `m`.`nro_item_no_conf`))";
					
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableNoConformes, consultaSql);

					((DefaultTableModel)jTableFotosDeItems.getModel()).setRowCount(0);

					
					
					ColumnResizer.adjustColumnPreferredWidths(jTableNoConformes);
					jContentPane.updateUI();
					}catch(Exception e1){
						System.out.println("Haciendo nada, entrada inválida");
						metodosSql metodos=new metodosSql();
						metodos.vaciarTabla(jTableNoConformes);
						metodos.vaciarTabla(jTableFotosDeItems);
					}
				}
			});
		}
		return jButtonTablaRefresh;
	}

	/**
	 * This method initializes jPanelBotonera	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelBotonera() {
		if (jPanelBotonera == null) {
			jPanelBotonera = new JPanel();
			jPanelBotonera.setLayout(null);
			jPanelBotonera.setBounds(new Rectangle(779, 79, 362, 69));
			jPanelBotonera.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelBotonera.add(getJButtonAgregar(), null);
			jPanelBotonera.add(getJButtonTablaRefresh(), null);
			jPanelBotonera.add(getJButtonBorrar(), null);
			jPanelBotonera.add(getJButtonCargaMitigacion(), null);
		}
		return jPanelBotonera;
	}

	/**
	 * This method initializes jTextFieldFecha	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFecha() {
		if (jTextFieldFecha == null) {
			jTextFieldFecha = new JTextField();
			jTextFieldFecha.setBounds(new Rectangle(1000, 156, 96, 25));
			jTextFieldFecha.setEditable(false);
		}
		return jTextFieldFecha;
	}

	/**
	 * This method initializes jButtonCalendario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCalendario() {
		if (jButtonCalendario == null) {
			jButtonCalendario = new JButton();
			jButtonCalendario.setBounds(new Rectangle(1103, 158, 37, 34));
			jButtonCalendario.setIcon(new ImageIcon(getClass().getResource("/iconos/calendario.png")));
			jButtonCalendario.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Calendario c=new Calendario(jTextFieldFecha);
					c.setVisible(true);
				}
			});
		}
		return jButtonCalendario;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setBounds(new Rectangle(8, 431, 1093, 119));
			jScrollPane1.setViewportView(getJTableFotosDeItems());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTableFotosDeItems	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableFotosDeItems() {
		if (jTableFotosDeItems == null) {
			jTableFotosDeItems = new JTable();
			jTableFotosDeItems.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
				
					String  idComo_mitigar=null;
					idComo_mitigar=jTableFotosDeItems.getValueAt(jTableFotosDeItems.getSelectedRow(),0).toString();
					int id=Integer.parseInt(idComo_mitigar);
									
				//	VerFoto fotos=VerFoto.getInstance(Integer.parseInt(idComo_mitigar));
				//	fotos.setVisible(true);
				VerFotoYmodificar fot;
				fot=VerFotoYmodificar.getInstance(id);
				fot.setLocationRelativeTo(null);
				fot.setVisible(true);
				
					
				}
			});
		}
		return jTableFotosDeItems;
	}

	/**
	 * This method initializes jComboBoxEmpresa	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxEmpresa() {
		if (jComboBoxEmpresa == null) {
			jComboBoxEmpresa = new JComboBox<String>();
			jComboBoxEmpresa.setBounds(new Rectangle(6, 30, 502, 25));
			jComboBoxEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					metodosSql metodos=new metodosSql();
					try { 
						if(jComboBoxEmpresa.getItemCount()>1){
							
						}else{
						
					//	metodos.llenarComboBox(jComboBoxEmpresa,"select nombre from empresa");
						
						}
						
						
							
									
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Hubo un error : "+e1.getMessage());
						
					}
				}
			});
			jComboBoxEmpresa.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					try{
						metodosSql metodos=new metodosSql();
						String cuit=null;
						cuit=metodos.consultarUnaColumna("select cuit_cuip from empresa where nombre= '"+jComboBoxEmpresa.getSelectedItem()+"';").get(0);
						jTextFieldCuit.setText(cuit);
						
						
					
						}catch(java.lang.IndexOutOfBoundsException e1){
							jTextFieldCuit.setText("");
							
						}
				}
			});
		}
		return jComboBoxEmpresa;
	}

	/**
	 * This method initializes jTextFieldCuit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCuit() {
		if (jTextFieldCuit == null) {
			jTextFieldCuit = new JTextField();
			jTextFieldCuit.setBounds(new Rectangle(212, 56, 277, 25));
			jTextFieldCuit.setEditable(false);
			jTextFieldCuit.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					metodosSql metodos=new metodosSql();
					try {
						
						metodos.llenarComboBox(jComboBoxCliente, "select idcliente from cliente where empresa_cuit='"+jTextFieldCuit.getText()+"';");
						if(jComboBoxCliente.getItemCount()>1){
							jComboBoxCliente.setBackground(Color.GREEN);
							//System.out.println(jComboBoxCliente.getItemCount()+" ELEMENTOS");
							jLabel3InfoDepto.setText("Mostrando departamentos de la empresa "+jComboBoxEmpresa.getSelectedItem().toString());
						}else{
							jComboBoxCliente.setBackground(Color.white);
							jLabel3InfoDepto.setText("Esta empresa no tiene departamentos, hágalo con ABM");
						}
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
		}
		return jTextFieldCuit;
	}

	/**
	 * This method initializes jComboBoxCliente	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox<String> getJComboBoxCliente() {
		if (jComboBoxCliente == null) {
			jComboBoxCliente = new JComboBox<String>();
			jComboBoxCliente.setBounds(new Rectangle(6, 115, 272, 24));
			jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jButtonTablaRefresh.doClick();
				}
			});
		}
		return jComboBoxCliente;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(1101, 435, 119, 56));
			jTextArea.setEditable(false);
			jTextArea.setText("Seleccione una fila\npara ver su contenido\n y editar si lo desea.");
		}
		return jTextArea;
	}

	/**
	 * This method initializes jButtonSalir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(1115, 9, 109, 43));
			jButtonSalir.setIcon(new ImageIcon(getClass().getResource("/iconos/Exit.png")));
			jButtonSalir.setText("SALIR");
			jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				dispose();
				}
			});
		}
		return jButtonSalir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
