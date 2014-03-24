package herramientas;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;



public class pdfopener {

	String rutaFullConNombreDelPDF;

	public pdfopener(String rutaFullConNombreDelPDF){

	this.rutaFullConNombreDelPDF=rutaFullConNombreDelPDF;

	}



	public void abrirDocumento() throws URISyntaxException {   

		// build a controller

		SwingController controller = new SwingController();

		// Build a SwingViewFactory configured with the controller

		SwingViewBuilder factory = new SwingViewBuilder(controller);

		JPanel viewerComponentPanel = factory.buildViewerPanel();

		// add copy keyboard command

		ComponentKeyBinding.install(controller, viewerComponentPanel);	  

		// add interactive mouse link annotation support via callback

		controller.getDocumentViewController().setAnnotationCallback(

				new org.icepdf.ri.common.MyAnnotationCallback(

						controller.getDocumentViewController()));  

		// Use the factory to build a JPanel that is pre-configured

		//with a complete, active Viewer UI.	   

		// Create a JFrame to display the panel in

		JFrame window = new JFrame("Sheteck");	   

		window.setLocationRelativeTo(null);
		
		window.getContentPane().add(viewerComponentPanel);

		window.pack();
		
		  Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

  	    int alto = pantalla.height;

  	    int ancho = pantalla.width;  	  
  	  
  	    window.setLocation(ancho/2-window.getWidth()/2, alto/2-window.getHeight()/2);

		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.setVisible(true);



		// Open a PDF document to view

		controller.openDocument(rutaFullConNombreDelPDF);

	}

	   }