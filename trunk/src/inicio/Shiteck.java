package inicio;

import java.awt.Image;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Base.metodosSql;

import pantallasBase.PantallaPpal;
import reporte.Auditoria;
import reporte.GeneradorDeReporte;


import herramientas.Calendario;
import herramientas.pdfopener;



@SuppressWarnings("unused")
public class Shiteck {
	
	

	/**
	 * @param args
	 * @
	 */
	public static void main(String[] args)  {
	
		
		
	  
	     /*   try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	       */
	       
	        
	   
	   
	    
		PantallaPpal pan=new PantallaPpal();
		
		
		pan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		pan.setVisible(true);
	
		

	}

}
