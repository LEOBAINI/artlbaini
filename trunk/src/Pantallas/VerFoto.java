package pantallas;

//import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
//import java.awt.Dimension;
import javax.swing.JLabel;



import java.awt.Image;
import java.awt.Rectangle;

public class VerFoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelFoto = null;

	/**
	 * This is the default constructor
	 */
	public VerFoto(ImageIcon fot) {
		super();
		initialize(fot);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize(ImageIcon fot) {
		this.setSize(712, 395);
		this.setContentPane(getJContentPane());
		
        ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
        jLabelFoto.setIcon(icono);
		this.setTitle("Foto");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelFoto = new JLabel();
			jLabelFoto.setBounds(new Rectangle(14, 30, 659, 315));
			jLabelFoto.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelFoto, null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
