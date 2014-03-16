package inicio;

import javax.swing.JFrame;
import javax.swing.UIManager;

import pantallasBase.PantallaPpal;


import herramientas.Calendario;



public class Shiteck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try 
	    { 
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
	       
	       
	        
	    } 
	    catch(Exception e){ 
	    }
	    
	    
		PantallaPpal pan=new PantallaPpal();
		
		
		pan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pan.setVisible(true);






		
		
		

	}

}
