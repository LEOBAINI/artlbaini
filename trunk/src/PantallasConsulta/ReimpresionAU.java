package PantallasConsulta;

import herramientas.FileChooser;

import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.swing.JTable;

import Base.metodosSql;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ReimpresionAU extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableReimpresion = null;
	private JButton jButtonReimprimir = null;

	/**
	 * This is the default constructor
	 */
	public ReimpresionAU() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(971, 319);
		this.setContentPane(getJContentPane());
		this.setTitle("Reimpresiones de Auditorías");
		metodosSql metodos=new metodosSql();
		metodos.llenarJtable(jTableReimpresion,"select * from shiteckhibernate.auditoria;");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJButtonReimprimir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(31, 30, 850, 233));
			jScrollPane.setViewportView(getJTableReimpresion());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableReimpresion	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableReimpresion() {
		if (jTableReimpresion == null) {
			jTableReimpresion = new JTable();
		}
		return jTableReimpresion;
	}

	/**
	 * This method initializes jButtonReimprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonReimprimir() {
		if (jButtonReimprimir == null) {
			jButtonReimprimir = new JButton();
			jButtonReimprimir.setBounds(new Rectangle(886, 30, 59, 39));
			jButtonReimprimir.setIcon(new ImageIcon(getClass().getResource("/iconos/Print.png")));
			jButtonReimprimir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String rutaCarpeta=null;
					FileChooser examinar=new FileChooser();
					
					rutaCarpeta=examinar.lanzarSeleccionDeCarpeta();
					if(!rutaCarpeta.equals("No seleccion")){
					
					metodosSql metodos=new metodosSql();
					
					String clienteDeptoNro = null;
					String horaIn = null;
					String horaOut = null;
					String auditoriaNumero = null;
					String rutaDeSalidaMasNombrePDF = null;
					String Nombreresponsable = null;
					int i=jTableReimpresion.getSelectedRow();
					if(i!=-1){
					clienteDeptoNro=(String) jTableReimpresion.getValueAt(i,jTableReimpresion.getColumn("CLIENTEDEPTONRO").getModelIndex());
					horaIn=(String) jTableReimpresion.getValueAt(i,jTableReimpresion.getColumn("HORAIN").getModelIndex());
					horaOut=(String) jTableReimpresion.getValueAt(i,jTableReimpresion.getColumn("HORAOUT").getModelIndex());
					auditoriaNumero=(String) jTableReimpresion.getValueAt(i,jTableReimpresion.getColumn("AUDITORIANRO").getModelIndex());
					rutaDeSalidaMasNombrePDF=rutaCarpeta+"\\CLI"+clienteDeptoNro+"AU"+(String) jTableReimpresion.getValueAt(i,jTableReimpresion.getColumn("FECHACREACION").getModelIndex())+".pdf";
					Nombreresponsable="unknown";
					
					metodos.generarAuditoriasDeLaBase(clienteDeptoNro, horaIn, horaOut, Nombreresponsable, auditoriaNumero, rutaDeSalidaMasNombrePDF);
					try {
					    File file = new File(rutaDeSalidaMasNombrePDF);
					    Desktop.getDesktop().open(file);
					} catch(Exception ex) {
					    ex.printStackTrace();
					}

					
					
					}else{
						JOptionPane.showMessageDialog(null,"Seleccione una fila para reimprimir...");	
					}
					
					
					}else{
					JOptionPane.showMessageDialog(null,"Sin seleccion");
					
				}
					
			}
					
					
					
			});
		}
		return jButtonReimprimir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
