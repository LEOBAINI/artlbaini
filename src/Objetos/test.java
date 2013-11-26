package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class test extends Persistente{
	
	String idTest;
	String nombre;
	private HashMap<Object, Object> todosLosAtributos;
	
	
	
	public test(String idTest, String nombre) {
		super();
		this.idTest = idTest;
		this.nombre = nombre;
		
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("idTest", getId());
		atributos.put("nombre",getArchivoPdf());	
		
		setTodosLosAtributos(atributos);
	}
	
	
	
	public String getId() {
		return idTest;
	}



	public void setId(String idTest) {
		this.idTest = idTest;
		this.todosLosAtributos.remove("idTest");
		this.todosLosAtributos.put("idTest", idTest);
	}



	public String getArchivoPdf() {
		return nombre;
	}



	public void setArchivoPdf(String nombre) {
		this.nombre = nombre;
		this.todosLosAtributos.remove("nombre");
		this.todosLosAtributos.put("nombre", nombre);
	}



	@Override
	
	public Object getPK() {
		// TODO Auto-generated method stub
		return idTest;
	}
	@Override
	public String identificadorUnico() {
		// TODO Auto-generated method stub
		return idTest;
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