package reporte;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class GeneradorDeReporte {
	
	
	
	
	public void crearReporte(ArrayList<Object>objetos,String plantillaJasperRutaFull, String rutaDeSalidaMasNombrePDF){
		try 
		{ 
			JasperReport reporte=null;
			reporte = (JasperReport) JRLoader.loadObject(new File(plantillaJasperRutaFull)); 
			JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(objetos));
			JRExporter exporter = new JRPdfExporter(); 
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(rutaDeSalidaMasNombrePDF)); 
			exporter.exportReport(); 
		} 
		catch(JRException e) 
		{ 
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error al generar PDF", JOptionPane.ERROR_MESSAGE);
			
		}
	}

}
