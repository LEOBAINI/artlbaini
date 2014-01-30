package noConformidad;

import java.util.ArrayList;

public class CategoriaNoConf {
	
	int nroCategoria;
	String descripcion;
	ArrayList<ItemNoConf>itemsNoConf;
	
	
	public CategoriaNoConf() {
		
	}
	


	public int getNroCategoria() {
		return nroCategoria;
	}



	public ArrayList<ItemNoConf> getItemsNoConf() {
		return itemsNoConf;
	}



	public void setItemsNoConf(ArrayList<ItemNoConf> itemsNoConf) {
		this.itemsNoConf = itemsNoConf;
	}



	public void setNroCategoria(int nroCategoria) {
		this.nroCategoria = nroCategoria;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int cargarItems(){
		
		return nroCategoria;
		
	}

}
