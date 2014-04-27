package inicio;

import java.awt.Image;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import noConformidad.ComoMitigar;

import Base.metodosSql;
import ObjetosPersistentes.Consulta;

import pantallasBase.PantallaPpal;
import persistencia.Hibernate;
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
	
		
		//metodos.generarAuditoriasDeLaBase(1234567892132,"00:00","00:00","lb","AU4","D:\\Desktop\\2014-04-18Ford MotorsDPnro1234567892132AU4.pdf");
		

	}

}
