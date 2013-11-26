import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import Abm.AdministradorABM;
import Base.metodosSql;
import Objetos.Auditoria;
import Objetos.test;


public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File folder = new File("d:\\Desktop\\Temporal");
		folder.mkdir();

		metodosSql metodos=new metodosSql();
		//metodos.escribirBlob("au", "D:\\Desktop\\DocsSheteck\\Auditorias\\AU 05 Viernes 10 Mayo 2013 OESTE MADERAS Recorrida .pdf");
		metodos.obtenerArchivoBlob("AU", "D:\\Desktop\\Temporal\\Recuperado.pdf");
		
		try { File file = new File("D:\\Desktop\\Temporal\\Recuperado.pdf");
		Desktop.getDesktop().open(file);} 
		catch(Exception e) { 
			e.printStackTrace();
			} 
	}

}
