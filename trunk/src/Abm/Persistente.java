package Abm;

import java.util.HashMap;

public abstract class Persistente {
	
	
	/**
	 * EJEMPLO
	 * public class Cliente extends Persistente {
	
	int idCliente;
	String descripcion;
	private HashMap<Object, Object> todosLosAtributos;
	
	public Cliente(int idCliente, String descripcion) {
		super();
		this.idCliente = idCliente;
		this.descripcion = descripcion;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("idCliente", getIdCliente());
		atributos.put("descripcion",getDescripcion());	
		
		this.todosLosAtributos=atributos;
		
		
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
		this.todosLosAtributos.remove("idCliente");
		this.todosLosAtributos.put("idCliente", idCliente);
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		this.todosLosAtributos.remove("descripcion");
		this.todosLosAtributos.put("descripcion", descripcion);
	}
	
	public HashMap<Object, Object> todosLosAtributos() {
		
		return this.todosLosAtributos;
	}
	
	public String identificadorUnico() {
		
		return "idCliente";
	}
	
	
	
	
	 * @return
	 */
	public abstract HashMap<Object, Object> todosLosAtributos();
	
	public abstract String identificadorUnico();
	
	public abstract Object getPK();
	
	
	
   

}
