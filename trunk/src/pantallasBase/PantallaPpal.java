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

import pantallasNoConformidad.PlanillaNoConformidad;
import pantallasNoConformidad.SeguimientoNoconformidad;

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
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/LogoShetek.png")));
		this.setJMenuBar(getJJMenuBarMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Shiteck ");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelLogo = new JLabel();
			jLabelLogo.setBounds(new Rectangle(311, 107, 693, 219));
			jLabelLogo.setIcon(new ImageIcon(getClass().getResource("/iconos/LogoShetek.png")));
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

}  //  @jve:decl-index=0:visual-constraint="10,10"
