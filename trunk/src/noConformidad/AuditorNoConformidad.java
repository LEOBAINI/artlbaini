package noConformidad;

import empresas.Cliente;



public class AuditorNoConformidad {
	
	String fechaDeHoy;
	
	
	public AuditorNoConformidad() {
		
	}

	public String getFechaDeHoy() {
		return fechaDeHoy;
	}

	public void setFechaDeHoy(String fechaDeHoy) {
		this.fechaDeHoy = fechaDeHoy;
	}

	public boolean estaCumplido(Cliente cli, ActaNoConformidad acta,ItemNoConf item,String fecha ){
		return false;
	
	}
	
	/**
	 * Sirve para que haya un contador de cuántas veces se informó sobre cierto item no cumplido
	 **/
	public void notificarItemNoCumplido(ItemNoConf item, String fecha){
		
	}

}
