package pantallas;

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
import noConformidad.ItemNoConf;
import noConformidad.MitigacionItemNoConf;

public class PlanillaNoConformidad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelClientes = null;
	private Choice choiceClientes = null;
	private JLabel jLabelCategoriaNoConf = null;
	private Choice choiceCategorias = null;
	private JLabel jLabelItemNoConforme = null;
	private Choice choiceItemsNoConforme = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableNoConformes = null;
	private JMenuBar jJMenuBarNoConforme = null;
	private JMenu jMenuAbm = null;
	private JMenuItem jMenuItemCliente = null;
	private JMenuItem jMenuItemCategoria = null;
	private JMenuItem jMenuItems = null;
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
		this.setSize(1232, 551);
		this.setJMenuBar(getJJMenuBarNoConforme());
		this.setContentPane(getJContentPane());
		this.setTitle("Planilla de no conformidad");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelNombreTabla3 = new JLabel();
			jLabelNombreTabla3.setBounds(new Rectangle(403, 329, 264, 20));
			jLabelNombreTabla3.setText("");
			jLabelNombreTabla2 = new JLabel();
			jLabelNombreTabla2.setText("JLabel");
			jLabelNombreTabla1 = new JLabel();
			jLabelNombreTabla1.setBounds(new Rectangle(222, 151, 292, 20));
			jLabelNombreTabla1.setText("");
			jLabelfotosDeItems = new JLabel();
			jLabelfotosDeItems.setBounds(new Rectangle(8, 330, 389, 18));
			jLabelfotosDeItems.setText("Descripcion y Fotos de Items seleccionados en el cuadro de arriba. ");
			jLabelItemsDetectados = new JLabel();
			jLabelItemsDetectados.setBounds(new Rectangle(6, 151, 203, 21));
			jLabelItemsDetectados.setText("Items detectados con anomalías.");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(312, 4, 183, 19));
			jLabel2.setText("Fecha prometida de correccion");
			jLabelCliente = new JLabel();
			jLabelCliente.setBounds(new Rectangle(211, 2, 31, 34));
			jLabelCliente.setIcon(new ImageIcon(getClass().getResource("/iconos/Profile.png")));
			jLabelCliente.setText("");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(719, 119, 26, 32));
			jLabel1.setIcon(new ImageIcon(getClass().getResource("/iconos/Search.png")));
			jLabel1.setText("");
			jLabel1.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(717, 74, 29, 27));
			jLabel.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel.setIcon(new ImageIcon(getClass().getResource("/iconos/Search.png")));
			jLabel.setText("");
			jLabelItemNoConforme = new JLabel();
			jLabelItemNoConforme.setBounds(new Rectangle(3, 102, 255, 22));
			jLabelItemNoConforme.setText("Seleccione Item No conforme");
			jLabelCategoriaNoConf = new JLabel();
			jLabelCategoriaNoConf.setBounds(new Rectangle(3, 54, 197, 21));
			jLabelCategoriaNoConf.setText("Seleccione Categoria");
			jLabelClientes = new JLabel();
			jLabelClientes.setBounds(new Rectangle(2, 2, 203, 20));
			jLabelClientes.setText("Seleccione Cliente");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelClientes, null);
			jContentPane.add(getChoiceClientes(), null);
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
		}
		return jContentPane;
	}

	/**
	 * This method initializes choiceClientes	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceClientes() {
		if (choiceClientes == null) {
			choiceClientes = new Choice();
			choiceClientes.setBounds(new Rectangle(3, 28, 203, 22));
			
				
			choiceClientes.addMouseListener(new java.awt.event.MouseAdapter() {   
				  
				public void mousePressed(java.awt.event.MouseEvent e) {    
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceClientes, "select TRIM(departamento_nro) from cliente");
						
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Hubo un error : "+e1.getMessage());
						
					}
				}
				
			});
			choiceClientes.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					if (e.getKeyCode()==KeyEvent.VK_ENTER) {
						jButtonTablaRefresh.doClick();
					}
						

				}
			});
			
			
		}
		return choiceClientes;
	}

	/**
	 * This method initializes choiceCategorias	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceCategorias() {
		if (choiceCategorias == null) {
			choiceCategorias = new Choice();
			choiceCategorias.setBounds(new Rectangle(2, 79, 712, 21));
			choiceCategorias.addMouseListener(new java.awt.event.MouseAdapter() {   
				  
				public void mousePressed(java.awt.event.MouseEvent e) {    
					
	
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceCategorias, "select TRIM(descripcion) from categoriaplanilla351");
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
			choiceItemsNoConforme.setBounds(new Rectangle(3, 129, 711, 21));
			choiceItemsNoConforme.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					metodosSql metodos=new metodosSql();
					String categoria=choiceCategorias.getSelectedItem();
					int nroCategoria=Integer.parseInt(metodos.consultarUnaColumna("Select TRIM(idcategoria) from shiteckhibernate.categoriaplanilla351 where descripcion = '" +categoria+"'").get(0));
					try {
						metodos.llenarChoice(choiceItemsNoConforme, "SELECT descripcion FROM shiteckhibernate.itemnoconf where categorianro="+ nroCategoria);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
			jScrollPane.setBounds(new Rectangle(7, 175, 1094, 150));
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
					consulta="SELECT idcomo_mitigar as id,descripcion FROM shiteckhibernate.como_mitigar where id_item_no_conf = "+idItemNoConf;
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableFotosDeItems, consulta);
					
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
			jJMenuBarNoConforme.add(getJMenuAbm());
		}
		return jJMenuBarNoConforme;
	}

	/**
	 * This method initializes jMenuAbm	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAbm() {
		if (jMenuAbm == null) {
			jMenuAbm = new JMenu();
			jMenuAbm.setText("ABM");
			jMenuAbm.add(getJMenuItemCliente());
			jMenuAbm.add(getJMenuItemCategoria());
			jMenuAbm.add(getJMenuItems());
		}
		return jMenuAbm;
	}

	/**
	 * This method initializes jMenuItemCliente	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemCliente() {
		if (jMenuItemCliente == null) {
			jMenuItemCliente = new JMenuItem();
			jMenuItemCliente.setText("Clientes");
		}
		return jMenuItemCliente;
	}

	/**
	 * This method initializes jMenuItemCategoria	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemCategoria() {
		if (jMenuItemCategoria == null) {
			jMenuItemCategoria = new JMenuItem();
			jMenuItemCategoria.setText("Categorias");
		}
		return jMenuItemCategoria;
	}

	/**
	 * This method initializes jMenuItems	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItems() {
		if (jMenuItems == null) {
			jMenuItems = new JMenuItem();
			jMenuItems.setText("Items");
		}
		return jMenuItems;
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
					int row=jTableNoConformes.getSelectedRow();
					if(row==-1){
						JOptionPane.showMessageDialog(null,"Seleccione una fila para asociar la mitigación");
					}else{
					int fila=row;
					long contenido=Long.parseLong(jTableNoConformes.getValueAt(fila,0).toString());
					System.out.println(contenido);
					
					
					String cliente=choiceClientes.getSelectedItem();
					long itemNoConfNro=0;
					itemNoConfNro=contenido;
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
					
					registroNuevoEnTabla.setClienteDeptoNro(Integer.parseInt(choiceClientes.getSelectedItem()));
					
					Hibernate.guardarObjeto(registroNuevoEnTabla);
					
					JOptionPane.showMessageDialog(null,"Guardado ok");
					
					}catch(Exception e1){
						
						JOptionPane.showMessageDialog(null,"Error "+ e1.getMessage());
						
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
					String consultaSql=null;
					jLabelNombreTabla1.setText("TABLA= mitigacion_item_no_conf");
					int nroCliente=0;
					nroCliente=Integer.parseInt(choiceClientes.getSelectedItem());
					consultaSql="select `m`.`idmitigacion_item_no_conf` AS `id`,`i`.`descripcion` AS `descripcion`,`m`.`esta_cumplido` "+
					" AS `esta_cumplido`,`m`.`fecha_prometida_mitigacion`"+
					" AS`fecha_prometida_mitigacion`,`m`.`fecha_cumplida_mitigacion`"+ 
					" AS `fecha_cumplida_mitigacion`" +
					" from (`mitigacion_item_no_conf` `m` join `itemnoconf` `i`)" +
					" where ((`m`.`cliente_depto_nro` = "+nroCliente+") and (`i`.`nroItem` = `m`.`nro_item_no_conf`))";
					
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableNoConformes, consultaSql);

					((DefaultTableModel)jTableFotosDeItems.getModel()).setRowCount(0);

					
					
					ColumnResizer.adjustColumnPreferredWidths(jTableNoConformes);
					jContentPane.updateUI();
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
			jTextFieldFecha.setBounds(new Rectangle(312, 28, 79, 20));
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
			jButtonCalendario.setBounds(new Rectangle(457, 24, 37, 34));
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
			jScrollPane1.setBounds(new Rectangle(8, 353, 1093, 119));
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
					metodosSql metodos=new metodosSql();
					String consulta="SELECT foto FROM shiteckhibernate.como_mitigar where idcomo_mitigar="+idComo_mitigar;
					VerFoto foto=new VerFoto(metodos.dameImagen(consulta, "foto"));
					foto.setVisible(true);
				
					
				}
			});
		}
		return jTableFotosDeItems;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
