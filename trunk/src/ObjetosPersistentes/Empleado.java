package ObjetosPersistentes;

public class Empleado {
	
	String cuil;//, varchar(100), NO, PRI, , 
	String nombre;//, varchar(100), YES, , , 
	String apellido;//, varchar(100), YES, , , 
	String puesto;//, varchar(45), YES, , , 
	String sexo;//, varchar(45), YES, , , 
	String turno;//, varchar(45), YES, , , 
	String empresa;///Departamento, varchar(100), YES, , , 
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
	


}
