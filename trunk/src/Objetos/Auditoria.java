package Objetos;

import java.io.File;
import java.util.HashMap;

import Abm.Persistente;

public class Auditoria extends Persistente{
	
	String id;
	File archivoPdf;
	private HashMap<Object, Object> todosLosAtributos;
	
	
	
	public Auditoria(String id, File archivoPdf) {
		super();
		this.id = id;
		this.archivoPdf = archivoPdf;
		
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("id", getId());
		atributos.put("archivoPdf",getArchivoPdf());	
		
		setTodosLosAtributos(atributos);
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
		this.todosLosAtributos.remove("id");
		this.todosLosAtributos.put("id", id);
	}



	public File getArchivoPdf() {
		return archivoPdf;
	}



	public void setArchivoPdf(File archivoPdf) {
		this.archivoPdf = archivoPdf;
		this.todosLosAtributos.remove("archivoPdf");
		this.todosLosAtributos.put("archivoPdf", archivoPdf);
	}



	@Override
	
	public Object getPK() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String identificadorUnico() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public HashMap<Object, Object> todosLosAtributos() {
		// TODO Auto-generated method stub
		return todosLosAtributos;
	}



	public void setTodosLosAtributos(HashMap<Object, Object> todosLosAtributos) {
		this.todosLosAtributos = todosLosAtributos;
	}



	public HashMap<Object, Object> getTodosLosAtributos() {
		return todosLosAtributos;
	}

	
}
