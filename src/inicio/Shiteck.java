package inicio;

import java.awt.Image;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import noConformidad.ComoMitigar;

import Base.ConexionMySql;
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
	
		
		
	  
	   
	       
	        
	   
	   
	  
		PantallaPpal pan=new PantallaPpal();
		
		
		pan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		pan.setVisible(true);
	
		ConexionMySql con=new ConexionMySql();
		if(con.conectar()==1){
			pan.aumentarProgresBar();
			pan.setTitle("Shiteck");
			JOptionPane.showMessageDialog(null,"PRUEBA DE CONEXIÓN OK, CONECTADO A "+con.getHost()+" BASE DE DATOS "+con.getBase());
			
			
			
		
		}else{
			
			pan.setTitle("Shiteck                                  					    			PRUEBA DE CONEXIÓN FALLIDA, REINTENTE");
			JOptionPane.showMessageDialog(null,"Asegurese que responda el ping a "+con.getHost()+"; telnet al puerto 3306 ; el proceso mysqld.exe esté corriendo; que la base se llame, shiteckhibernate.\n" +
					"; que el usuario y pass sea correcto, luego reintente" );
			
			pan.dispose();
			
		
		}
		
		//metodos.generarAuditoriasDeLaBase(1234567892132,"00:00","00:00","lb","AU4","D:\\Desktop\\2014-04-18Ford MotorsDPnro1234567892132AU4.pdf");
		

	}

}
