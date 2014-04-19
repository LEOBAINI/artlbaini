package pantallasBase;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

import pantallasABM.AltaEmpleado;
import pantallasABM.AltaEmpresa;
import pantallasABM.AltaDepartamento;
import pantallasABM.ModifEmpresa;
import pantallasNoConformidad.PlanillaNoConformidad;
import pantallasNoConformidad.SeguimientoNoconformidad;

@SuppressWarnings("unused")
public class PantallaPpal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBarMenu = null;
	private JMenu jMenuArchivo = null;
	private JMenu jMenuTareas = null;
	private JMenu jMenuInformes = null;
	private JMenu jMenuConsultas = null;
	private JLabel jLabelLogo = null;
	private JMenu jMenuABM = null;
	private JMenuItem jMenuItemAltaNoConformidad = null;
	private JMenuItem jMenuItemRelevamiento = null;
	private JMenuItem jMenuItemSalir = null;
	private JMenu jMenuAltas = null;
	private JMenuItem jMenuItemAltasEmpresas = null;
	private JMenuItem jMenuItemAltasEstablecimientos = null;
	private JMenuItem jMenuItemAltaEmpleado = null;
	private JMenu jMenuModificaciones = null;
	private JMenuItem jMenuItemEmpresa = null;
	/**
	 * This is the default constructor
	 */
	public PantallaPpal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1248, 527);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/logoShiteck.gif")));
		this.setJMenuBar(getJJMenuBarMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Shiteck ");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelLogo = new JLabel();
			jLabelLogo.setBounds(new Rectangle(501, 164, 326, 98));
			jLabelLogo.setIcon(new ImageIcon(getClass().getResource("/iconos/logoShiteck.gif")));
			jLabelLogo.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelLogo, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBarMenu	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBarMenu() {
		if (jJMenuBarMenu == null) {
			jJMenuBarMenu = new JMenuBar();
			jJMenuBarMenu.add(getJMenuArchivo());
			jJMenuBarMenu.add(getJMenuTareas());
			jJMenuBarMenu.add(getJMenuInformes());
			jJMenuBarMenu.add(getJMenuConsultas());
			jJMenuBarMenu.add(getJMenuABM());
		}
		return jJMenuBarMenu;
	}

	/**
	 * This method initializes jMenuArchivo	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuArchivo() {
		if (jMenuArchivo == null) {
			jMenuArchivo = new JMenu();
			jMenuArchivo.setText("Archivo");
			jMenuArchivo.add(getJMenuItemSalir());
		}
		return jMenuArchivo;
	}

	/**
	 * This method initializes jMenuTareas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuTareas() {
		if (jMenuTareas == null) {
			jMenuTareas = new JMenu();
			jMenuTareas.setText("Tareas");
			jMenuTareas.add(getJMenuItemAltaNoConformidad());
			jMenuTareas.add(getJMenuItemRelevamiento());
		}
		return jMenuTareas;
	}

	/**
	 * This method initializes jMenuInformes	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuInformes() {
		if (jMenuInformes == null) {
			jMenuInformes = new JMenu();
			jMenuInformes.setText("Informes");
		}
		return jMenuInformes;
	}

	/**
	 * This method initializes jMenuConsultas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuConsultas() {
		if (jMenuConsultas == null) {
			jMenuConsultas = new JMenu();
			jMenuConsultas.setText("Consultas");
		}
		return jMenuConsultas;
	}

	/**
	 * This method initializes jMenuABM	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuABM() {
		if (jMenuABM == null) {
			jMenuABM = new JMenu();
			jMenuABM.setText("ABM");
			jMenuABM.add(getJMenuAltas());
			jMenuABM.add(getJMenuModificaciones());
		}
		return jMenuABM;
	}

	/**
	 * This method initializes jMenuItemAltaNoConformidad	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemAltaNoConformidad() {
		if (jMenuItemAltaNoConformidad == null) {
			jMenuItemAltaNoConformidad = new JMenuItem();
			jMenuItemAltaNoConformidad.setText("Alta de no conformidad");
			jMenuItemAltaNoConformidad
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							PlanillaNoConformidad pla=new PlanillaNoConformidad();
							pla.setVisible(true);
						}
					});
		}
		return jMenuItemAltaNoConformidad;
	}

	/**
	 * This method initializes jMenuItemRelevamiento	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemRelevamiento() {
		if (jMenuItemRelevamiento == null) {
			jMenuItemRelevamiento = new JMenuItem();
			jMenuItemRelevamiento.setText("Nuevo relevamiento");
			jMenuItemRelevamiento.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					SeguimientoNoconformidad seg=new SeguimientoNoconformidad();
					seg.setVisible(true);
				}
			});
		}
		return jMenuItemRelevamiento;
	}

	/**
	 * This method initializes jMenuItemSalir	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemSalir() {
		if (jMenuItemSalir == null) {
			jMenuItemSalir = new JMenuItem();
			jMenuItemSalir.setText("Salir");
			jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(EXIT_ON_CLOSE);
				}
			});
		}
		return jMenuItemSalir;
	}

	/**
	 * This method initializes jMenuAltas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAltas() {
		if (jMenuAltas == null) {
			jMenuAltas = new JMenu();
			jMenuAltas.setText("Altas");
			jMenuAltas.add(getJMenuItemAltasEmpresas());
			jMenuAltas.add(getJMenuItemAltasEstablecimientos());
			jMenuAltas.add(getJMenuItemAltaEmpleado());
		}
		return jMenuAltas;
	}

	/**
	 * This method initializes jMenuItemAltasEmpresas	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemAltasEmpresas() {
		if (jMenuItemAltasEmpresas == null) {
			jMenuItemAltasEmpresas = new JMenuItem();
			jMenuItemAltasEmpresas.setText("Empresas");
			jMenuItemAltasEmpresas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaEmpresa altaEmp=new AltaEmpresa();
					altaEmp.setVisible(true);
				}
			});
		}
		return jMenuItemAltasEmpresas;
	}

	/**
	 * This method initializes jMenuItemAltasEstablecimientos	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemAltasEstablecimientos() {
		if (jMenuItemAltasEstablecimientos == null) {
			jMenuItemAltasEstablecimientos = new JMenuItem();
			jMenuItemAltasEstablecimientos.setText("Departamentos");
			jMenuItemAltasEstablecimientos
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
						AltaDepartamento altaEst=new AltaDepartamento();
						altaEst.setVisible(true);
						}
					});
		}
		return jMenuItemAltasEstablecimientos;
	}

	/**
	 * This method initializes jMenuItemAltaEmpleado	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemAltaEmpleado() {
		if (jMenuItemAltaEmpleado == null) {
			jMenuItemAltaEmpleado = new JMenuItem();
			jMenuItemAltaEmpleado.setText("Empleados");
			jMenuItemAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaEmpleado alemp=new AltaEmpleado();
					alemp.setVisible(true);
				}
			});
		}
		return jMenuItemAltaEmpleado;
	}

	/**
	 * This method initializes jMenuModificaciones	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuModificaciones() {
		if (jMenuModificaciones == null) {
			jMenuModificaciones = new JMenu();
			jMenuModificaciones.setText("Modificaciones");
			jMenuModificaciones.add(getJMenuItemEmpresa());
		}
		return jMenuModificaciones;
	}

	/**
	 * This method initializes jMenuItemEmpresa	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemEmpresa() {
		if (jMenuItemEmpresa == null) {
			jMenuItemEmpresa = new JMenuItem();
			jMenuItemEmpresa.setText("Empresas");
			jMenuItemEmpresa.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ModifEmpresa modemp=new ModifEmpresa();
					modemp.setVisible(true);
				}
			});
		}
		return jMenuItemEmpresa;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
