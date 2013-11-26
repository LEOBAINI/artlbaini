package Abm;

import Base.metodosSql;

public class AdministradorABM {
	public AdministradorABM(){
		
	}
	
	public int darDeAlta(Persistente objeto,String base,String tabla) {
		metodosSql metodos=new metodosSql();
		
		
		return metodos.insertarObjetoAlaBase(objeto, base, tabla);
		
	}
	public int darDeBaja(Persistente objeto,String base,String tabla){
		metodosSql metodos=new metodosSql();
		
		return metodos.borrarObjetoDeLaBase(objeto, base, tabla);
		
		
	}
	public int modificar(Persistente objeto,String base,String tabla){
		metodosSql metodos=new metodosSql();
		return metodos.updateObjetoDelaBase(objeto, base, tabla);
		
	}
	
	
}
