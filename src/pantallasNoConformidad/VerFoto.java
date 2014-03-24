package pantallasNoConformidad;

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
	private JLabel jLabelFotoBien = null;
	private JLabel jLabelProblema = null;
	private JLabel jLabelSolución = null;

	/**
	 * This is the default constructor
	 */
	public VerFoto(ImageIcon fotoMal,ImageIcon fotoBien) {
		super();
		initialize(fotoMal,fotoBien);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize(ImageIcon fotoMal,ImageIcon fotoBien) {
		this.setSize(712, 395);
		this.setContentPane(getJContentPane());
		if(fotoMal!=null){
        ImageIcon icono = new ImageIcon(fotoMal.getImage().getScaledInstance(jLabelFoto.getWidth(),jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
        jLabelFoto.setIcon(icono);
		}
        
		if(fotoBien!=null){
        ImageIcon iconoBien = new ImageIcon(fotoBien.getImage().getScaledInstance(jLabelFotoBien.getWidth(),jLabelFotoBien.getHeight(), Image.SCALE_DEFAULT));
        jLabelFotoBien.setIcon(iconoBien);
		}
		
		this.setTitle("Foto");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelSolución = new JLabel();
			jLabelSolución.setBounds(new Rectangle(358, 5, 330, 19));
			jLabelSolución.setText("Fotografía de cómo debe ser soluciónado.");
			jLabelProblema = new JLabel();
			jLabelProblema.setBounds(new Rectangle(14, 6, 337, 19));
			jLabelProblema.setText("Fotografía de la anomalía.");
			jLabelFotoBien = new JLabel();
			jLabelFotoBien.setBounds(new Rectangle(359, 30, 332, 315));
			jLabelFotoBien.setText("");
			jLabelFoto = new JLabel();
			jLabelFoto.setBounds(new Rectangle(14, 30, 338, 315));
			jLabelFoto.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelFoto, null);
			jContentPane.add(jLabelFotoBien, null);
			jContentPane.add(jLabelProblema, null);
			jContentPane.add(jLabelSolución, null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
