package pantallasNoConformidad;

import herramientas.ColumnResizer;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Choice;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

import Base.metodosSql;

import java.awt.Color;
import java.sql.SQLException;

public class SeguimientoNoconformidad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelClienteNro = null;
	private JLabel jLabelCumplido = null;
	private JTextField jTextFieldObjCumplidos = null;
	private JLabel jLabelFecha = null;
	private JTextField jTextFieldFecha = null;
	private JScrollPane jScrollPaneNoConformes = null;
	private JTable jTableNoConformes = null;
	private JLabel jLabelListadoItemsNoConformes = null;
	private JLabel jLabelDetalleItemsNoConformes = null;
	private JScrollPane jScrollPaneDetalle = null;
	private JTable jTableDetalle = null;
	private JScrollPane jScrollPaneStatus = null;
	private JTable jTableStatus = null;
	private JLabel jLabelStatus = null;
	private JButton jButtonCumplido = null;
	private Choice choiceCliente = null;
	private JButton jButtonNoOk = null;
	private JPanel jPanelDetalles = null;
	private JLabel jLabelPorcentajeCumplidoItem = null;
	private JTextField jTextFieldPorcentajeDelItem = null;
	/**
	 * This is the default constructor
	 */
	public SeguimientoNoconformidad() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1110, 549);
		this.setContentPane(getJContentPane());
		this.setTitle("Seguimiento de no conformidades");
	}

	private void actualizarPorcentaje(){
		String nroCliente=choiceCliente.getSelectedItem();
		metodosSql metodos=new metodosSql();
		Double porcentajeCumplidoSubItems=0.0;
		String SentenciaPorcentaje="select count(*)*100/(select count(*)FROM shiteckhibernate.como_mitigar" +
				" where cliente_depto= "+nroCliente+")" +
				" from shiteckhibernate.como_mitigar where cliente_depto= "+nroCliente+" and cumplido='SI';";
		porcentajeCumplidoSubItems=Double.parseDouble(metodos.consultarUnaColumna(SentenciaPorcentaje).get(0).toString());
		jTextFieldObjCumplidos.setText(String.valueOf(porcentajeCumplidoSubItems));
		
	}
	private void actualizarTablaDetalle(){
		String idItemNoConf=null;
		idItemNoConf=jTableNoConformes.getValueAt(jTableNoConformes.getSelectedRow(),0).toString();
		String consulta=null;
		consulta="SELECT idcomo_mitigar as id,descripcion,cumplido as 'ESTA CUMPLIDO' FROM shiteckhibernate.como_mitigar where id_item_no_conf = "+idItemNoConf;
		metodosSql metodos=new metodosSql();
		metodos.llenarJtable(jTableDetalle, consulta);
		
		ColumnResizer.adjustColumnPreferredWidths(jTableDetalle);
	}
	
	private String TotalmenteCumplidoItem(int cliente_depto,int id_item_no_conf){
		/*En esta consulta es total detalleitem*100/detalleItemCumplido */
		String consultaSql="select count(*)*100/" +
				" (select count(*)FROM shiteckhibernate.como_mitigar where cliente_depto="+cliente_depto+" and id_item_no_conf="+id_item_no_conf+") " +
				" from shiteckhibernate.como_mitigar where cliente_depto="+cliente_depto+" and id_item_no_conf="+id_item_no_conf+" and cumplido='SI';";
		metodosSql metodos=new metodosSql();
		Double cienPorCiento=0.0;
		cienPorCiento=Double.parseDouble(metodos.consultarUnaColumna(consultaSql).get(0).toString());
		
		if(cienPorCiento==100.0){
			return "SI";
		}else{
			return "NO";
			
		}
		
		
		
		
	}
	private void actualizarItemNoConforme(int clienteNro,int idItemPadre,String estado){
		metodosSql metodos=new metodosSql();
		String sentenciaSql="update shiteckhibernate.mitigacion_item_no_conf set esta_cumplido='"+estado+"' where cliente_depto_nro="+clienteNro+" "+
				" and idmitigacion_item_no_conf="+idItemPadre+";";
		try {
			metodos.insertarOmodif(sentenciaSql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void actualizarTablaItemsNoConformes(){
		jTableNoConformes.removeAll();
		String consultaSql=null;
		jTextFieldObjCumplidos.removeAll();
		metodosSql metodos=new metodosSql();
		int nroCliente=0;
		nroCliente=Integer.parseInt(choiceCliente.getSelectedItem());
		consultaSql="select `m`.`idmitigacion_item_no_conf` AS `id`,`i`.`descripcion` AS `descripcion`,`m`.`esta_cumplido` "+
		" AS `esta_cumplido`,`m`.`fecha_prometida_mitigacion`"+
		" AS`fecha_prometida_mitigacion`,`m`.`fecha_cumplida_mitigacion`"+ 
		" AS `fecha_cumplida_mitigacion`,`i`.`norma_vigente`" +
		" from (`mitigacion_item_no_conf` `m` join `itemnoconf` `i`)" +
		" where ((`m`.`cliente_depto_nro` = "+nroCliente+") and (`i`.`nroItem` = `m`.`nro_item_no_conf`))";
		actualizarPorcentaje();
		metodos.llenarJtable(jTableNoConformes, consultaSql);
		
		

							ColumnResizer.adjustColumnPreferredWidths(jTableNoConformes);
		jContentPane.updateUI();
	}
	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelPorcentajeCumplidoItem = new JLabel();
			jLabelPorcentajeCumplidoItem.setBounds(new Rectangle(394, 46, 256, 21));
			jLabelPorcentajeCumplidoItem.setText("% cumplimiento del item seleccionado");
			jLabelStatus = new JLabel();
			jLabelStatus.setText("Status de detalle de item no conforme");
			jLabelStatus.setBounds(new Rectangle(5, 158, 314, 23));
			jLabelDetalleItemsNoConformes = new JLabel();
			jLabelDetalleItemsNoConformes.setText("Detalle de items no conformes ");
			jLabelDetalleItemsNoConformes.setBounds(new Rectangle(6, 24, 179, 17));
			jLabelListadoItemsNoConformes = new JLabel();
			jLabelListadoItemsNoConformes.setBounds(new Rectangle(16, 48, 263, 18));
			jLabelListadoItemsNoConformes.setText("Listado de items detectados - NoConformes - ");
			jLabelFecha = new JLabel();
			jLabelFecha.setBounds(new Rectangle(762, 14, 44, 21));
			jLabelFecha.setText("Fecha");
			jLabelCumplido = new JLabel();
			jLabelCumplido.setBounds(new Rectangle(394, 14, 255, 21));
			jLabelCumplido.setText("% total de objetivos cumplidos por el cliente");
			jLabelClienteNro = new JLabel();
			jLabelClienteNro.setBounds(new Rectangle(15, 14, 69, 21));
			jLabelClienteNro.setText("Cliente Nro");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelClienteNro, null);
			jContentPane.add(jLabelCumplido, null);
			jContentPane.add(getJTextFieldObjCumplidos(), null);
			jContentPane.add(jLabelFecha, null);
			jContentPane.add(getJTextFieldFecha(), null);
			jContentPane.add(getJScrollPaneNoConformes(), null);
			jContentPane.add(jLabelListadoItemsNoConformes, null);
			jContentPane.add(getChoiceCliente(), null);
			jContentPane.add(getJPanelDetalles(), null);
			jContentPane.add(jLabelPorcentajeCumplidoItem, null);
			jContentPane.add(getJTextFieldPorcentajeDelItem(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldObjCumplidos	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldObjCumplidos() {
		if (jTextFieldObjCumplidos == null) {
			jTextFieldObjCumplidos = new JTextField();
			jTextFieldObjCumplidos.setBounds(new Rectangle(301, 14, 87, 22));
			jTextFieldObjCumplidos.setEditable(false);
		}
		return jTextFieldObjCumplidos;
	}

	/**
	 * This method initializes jTextFieldFecha	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFecha() {
		if (jTextFieldFecha == null) {
			jTextFieldFecha = new JTextField();
			jTextFieldFecha.setBounds(new Rectangle(826, 15, 147, 21));
		}
		return jTextFieldFecha;
	}

	/**
	 * This method initializes jScrollPaneNoConformes	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneNoConformes() {
		if (jScrollPaneNoConformes == null) {
			jScrollPaneNoConformes = new JScrollPane();
			jScrollPaneNoConformes.setBounds(new Rectangle(15, 76, 1073, 122));
			jScrollPaneNoConformes.setViewportView(getJTableNoConformes());
		}
		return jScrollPaneNoConformes;
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
					actualizarTablaDetalle();
				}

				
			});
		}
		return jTableNoConformes;
	}

	/**
	 * This method initializes jScrollPaneDetalle	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneDetalle() {
		if (jScrollPaneDetalle == null) {
			jScrollPaneDetalle = new JScrollPane();
			jScrollPaneDetalle.setBounds(new Rectangle(5, 43, 1060, 103));
			jScrollPaneDetalle.setViewportView(getJTableDetalle());
		}
		return jScrollPaneDetalle;
	}

	/**
	 * This method initializes jTableDetalle	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableDetalle() {
		if (jTableDetalle == null) {
			jTableDetalle = new JTable();
		}
		return jTableDetalle;
	}

	/**
	 * This method initializes jScrollPaneStatus	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneStatus() {
		if (jScrollPaneStatus == null) {
			jScrollPaneStatus = new JScrollPane();
			jScrollPaneStatus.setBounds(new Rectangle(4, 184, 1059, 107));
			jScrollPaneStatus.setViewportView(getJTableStatus());
		}
		return jScrollPaneStatus;
	}

	/**
	 * This method initializes jTableStatus	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableStatus() {
		if (jTableStatus == null) {
			jTableStatus = new JTable();
		}
		return jTableStatus;
	}

	/**
	 * This method initializes jButtonCumplido	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCumplido() {
		if (jButtonCumplido == null) {
			jButtonCumplido = new JButton();
			jButtonCumplido.setText("");
			jButtonCumplido.setBounds(new Rectangle(965, 7, 46, 37));
			jButtonCumplido.setIcon(new ImageIcon(getClass().getResource("/iconos/Ok.png")));
			jButtonCumplido.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				int clienteNro=Integer.parseInt(choiceCliente.getSelectedItem());
				int idItemPadre=Integer.parseInt(jTableNoConformes.getValueAt(jTableNoConformes.getSelectedRow(), 0).toString());
					
					
				int idComo_mitigar=Integer.valueOf((String)jTableDetalle.getValueAt(jTableDetalle.getSelectedRow(),0));
				String updateCumplido="update shiteckhibernate.como_mitigar set cumplido='SI' where idcomo_mitigar= "+idComo_mitigar+";";
				metodosSql metodos=new metodosSql();
				try {
					metodos.insertarOmodif(updateCumplido);
					actualizarPorcentaje();
					actualizarTablaDetalle();
					if(TotalmenteCumplidoItem(clienteNro, idItemPadre).equals("SI")){
					actualizarItemNoConforme(clienteNro,idItemPadre,"SI");	
					actualizarTablaItemsNoConformes();
					}
					JOptionPane.showMessageDialog(null,"Se actualizó correctamente ");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,"No se pudo actualizar, reintente");
					e1.printStackTrace();
				}
				}
			});
		}
		return jButtonCumplido;
	}

	/**
	 * This method initializes choiceCliente	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceCliente() {
		if (choiceCliente == null) {
			choiceCliente = new Choice();
			choiceCliente.setBounds(new Rectangle(89, 14, 209, 21));
			choiceCliente.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceCliente, "select TRIM(departamento_nro) from cliente");
						
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Hubo un error : "+e1.getMessage());
						
					}
				}
			});
			
			
			choiceCliente.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					actualizarTablaItemsNoConformes();
				}
			});
		}
		return choiceCliente;
	}

	/**
	 * This method initializes jButtonNoOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonNoOk() {
		if (jButtonNoOk == null) {
			jButtonNoOk = new JButton();
			jButtonNoOk.setIcon(new ImageIcon(getClass().getResource("/iconos/NoOK.png")));
			jButtonNoOk.setBounds(new Rectangle(1019, 7, 46, 37));
			jButtonNoOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jTableDetalle.getRowCount()>1){
					int idComo_mitigar=Integer.valueOf((String)jTableDetalle.getValueAt(jTableDetalle.getSelectedRow(),0));
					String updateNoCumplido="update shiteckhibernate.como_mitigar set cumplido='NO' where idcomo_mitigar= "+idComo_mitigar+";";
					metodosSql metodos=new metodosSql();
					try {
						metodos.insertarOmodif(updateNoCumplido);
						actualizarPorcentaje();
						actualizarTablaDetalle();
						JOptionPane.showMessageDialog(null,"Se actualizó correctamente");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"No se pudo actualizar, reintente");
						e1.printStackTrace();
					}
					}else{
						int clienteNro=Integer.parseInt(choiceCliente.getSelectedItem());
						int idItemPadre=Integer.parseInt(jTableNoConformes.getValueAt(jTableNoConformes.getSelectedRow(),0).toString());
						
						actualizarItemNoConforme(clienteNro, idItemPadre,"NO");
						actualizarTablaItemsNoConformes();
						actualizarPorcentaje();
					}
				}
			});
		}
		return jButtonNoOk;
	}

	/**
	 * This method initializes jPanelDetalles	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelDetalles() {
		if (jPanelDetalles == null) {
			jPanelDetalles = new JPanel();
			jPanelDetalles.setLayout(null);
			jPanelDetalles.setBounds(new Rectangle(15, 203, 1072, 300));
			jPanelDetalles.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
			jPanelDetalles.add(getJScrollPaneDetalle(), null);
			jPanelDetalles.add(getJScrollPaneStatus(), null);
			jPanelDetalles.add(jLabelStatus, null);
			jPanelDetalles.add(getJButtonNoOk(), null);
			jPanelDetalles.add(getJButtonCumplido(), null);
			jPanelDetalles.add(jLabelDetalleItemsNoConformes, null);
		}
		return jPanelDetalles;
	}

	/**
	 * This method initializes jTextFieldPorcentajeDelItem	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPorcentajeDelItem() {
		if (jTextFieldPorcentajeDelItem == null) {
			jTextFieldPorcentajeDelItem = new JTextField();
			jTextFieldPorcentajeDelItem.setBounds(new Rectangle(300, 47, 89, 20));
		}
		return jTextFieldPorcentajeDelItem;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
