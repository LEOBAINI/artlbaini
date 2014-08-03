package pantallasBase;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
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

import PantallasConsulta.ConsultaGral;
import PantallasConsulta.CrearConsulta;
import PantallasConsulta.ReimpresionAU;

import pantallasABM.AltaEmpleado;
import pantallasABM.AltaEmpresa;
import pantallasABM.AltaDepartamento;
import pantallasABM.ModifDepartamento;
import pantallasABM.ModifEmpleado;
import pantallasABM.ModifEmpresa;
import pantallasNoConformidad.PlanillaNoConformidad;
import pantallasNoConformidad.SeguimientoNoconformidad;
import javax.swing.JProgressBar;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.BorderFactory;

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
	private JMenuItem jMenuItemDepartaementos = null;
	private JMenuItem jMenuItemCargarConsulta = null;
	private JMenuItem jMenuItemCreadas = null;
	private JMenuItem jMenuItemModifEmpleados = null;
	private JProgressBar jProgressBarProgreso = null;
	private JMenu jMenuReimpresion = null;
	private JMenuItem jMenuItemReimprimirAu = null;
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
	public void aumentarProgresBar(){
		jProgressBarProgreso.setVisible(true);
		jProgressBarProgreso.setStringPainted(true);
		for(int i=0;jProgressBarProgreso.getValue()<100;i++){
			jProgressBarProgreso.setValue((int) (i/100000));
			
		}
		jProgressBarProgreso.setVisible(false);
			
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
			jContentPane.add(getJProgressBarProgreso(), null);
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
			jJMenuBarMenu.add(getJMenuReimpresion());
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
			jMenuInformes.setEnabled(false);
			jMenuInformes.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JOptionPane.showMessageDialog(null,"En construcción");
				}
			});
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
			jMenuConsultas.add(getJMenuItemCargarConsulta());
			jMenuConsultas.add(getJMenuItemCreadas());
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
			jMenuModificaciones.add(getJMenuItemDepartaementos());
			jMenuModificaciones.add(getJMenuItemModifEmpleados());
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

	/**
	 * This method initializes jMenuItemDepartaementos	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemDepartaementos() {
		if (jMenuItemDepartaementos == null) {
			jMenuItemDepartaementos = new JMenuItem();
			jMenuItemDepartaementos.setText("Departamentos");
			jMenuItemDepartaementos.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				ModifDepartamento moddepa=new ModifDepartamento();
				moddepa.setVisible(true);
				}
			});
		}
		return jMenuItemDepartaementos;
	}

	/**
	 * This method initializes jMenuItemCargarConsulta	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemCargarConsulta() {
		if (jMenuItemCargarConsulta == null) {
			jMenuItemCargarConsulta = new JMenuItem();
			jMenuItemCargarConsulta.setText("Crear nueva consulta");
			jMenuItemCargarConsulta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					CrearConsulta crear=new CrearConsulta();
					crear.setVisible(true);
				}
			});
		}
		return jMenuItemCargarConsulta;
	}

	/**
	 * This method initializes jMenuItemCreadas	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemCreadas() {
		if (jMenuItemCreadas == null) {
			jMenuItemCreadas = new JMenuItem();
			jMenuItemCreadas.setText("Ver las consultas creadas por el usuario");
			jMenuItemCreadas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ConsultaGral cons=new ConsultaGral();
					cons.setVisible(true);
				}
			});
		}
		return jMenuItemCreadas;
	}

	/**
	 * This method initializes jMenuItemModifEmpleados	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemModifEmpleados() {
		if (jMenuItemModifEmpleados == null) {
			jMenuItemModifEmpleados = new JMenuItem();
			jMenuItemModifEmpleados.setText("Empleados");
			jMenuItemModifEmpleados.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				ModifEmpleado modEmp=new ModifEmpleado();
				modEmp.setVisible(true);
				}
			});
		}
		return jMenuItemModifEmpleados;
	}

	/**
	 * This method initializes jProgressBarProgreso	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBarProgreso() {
		if (jProgressBarProgreso == null) {
			jProgressBarProgreso = new JProgressBar();
			jProgressBarProgreso.setBounds(new Rectangle(502, 264, 324, 20));
			jProgressBarProgreso.setBackground(Color.white);
			jProgressBarProgreso.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.lightGray));
			jProgressBarProgreso.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		return jProgressBarProgreso;
	}

	/**
	 * This method initializes jMenuReimpresion	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuReimpresion() {
		if (jMenuReimpresion == null) {
			jMenuReimpresion = new JMenu();
			jMenuReimpresion.setText("Reimpresiones");
			jMenuReimpresion.setEnabled(false);
			jMenuReimpresion.add(getJMenuItemReimprimirAu());
		}
		return jMenuReimpresion;
	}

	/**
	 * This method initializes jMenuItemReimprimirAu	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemReimprimirAu() {
		if (jMenuItemReimprimirAu == null) {
			jMenuItemReimprimirAu = new JMenuItem();
			jMenuItemReimprimirAu.setText("Reimprimir Auditorías");
			jMenuItemReimprimirAu.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ReimpresionAU re=new ReimpresionAU();
					JFrame.setDefaultLookAndFeelDecorated(true);
					re.setVisible(true);
				}
			});
		}
		return jMenuItemReimprimirAu;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
