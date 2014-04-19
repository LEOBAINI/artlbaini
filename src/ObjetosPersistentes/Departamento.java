package ObjetosPersistentes;

public class Departamento {
	
	
	String idCliente;//, bigint(20), NO, PRI, ,  //  @jve:decl-index=0:
	String nombre;//, varchar(45), YES, , ,  //  @jve:decl-index=0:
	String departamento_nro;//, bigint(20), YES, , ,  //  @jve:decl-index=0:
	String email;////, varchar(60), YES, , ,  //  @jve:decl-index=0:
	String domicilio;//, varchar(100), YES, , , 
	float superficie;//, double, YES, , , 
	String provincia;//, varchar(100), YES, , , 
	int cp_cpa;//, int(11), YES, , , 
	String empresa_cuit;//, bigint(20), YES, MUL, , 
	String telefono;//, varchar(100), YES, , , 
	String tipo_zona;//, varchar(50), YES, , , 
	String CertificadoMunicTipoZona;//, longblob, YES, , , 
	String localidad;
	
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente2) {
		this.idCliente = idCliente2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento_nro() {
		return departamento_nro;
	}
	public void setDepartamento_nro(String departamento_nro2) {
		this.departamento_nro = departamento_nro2;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCp_cpa() {
		return cp_cpa;
	}
	public void setCp_cpa(int cp_cpa) {
		this.cp_cpa = cp_cpa;
	}
	public String getEmpresa_cuit() {
		return empresa_cuit;
	}
	public void setEmpresa_cuit(String empresa_cuit2) {
		this.empresa_cuit = empresa_cuit2;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo_zona() {
		return tipo_zona;
	}
	public void setTipo_zona(String tipo_zona) {
		this.tipo_zona = tipo_zona;
	}
	public String getCertificadoMunicTipoZona() {
		return CertificadoMunicTipoZona;
	}
	public void setCertificadoMunicTipoZona(String certificadoMunicTipoZona) {
		CertificadoMunicTipoZona = certificadoMunicTipoZona;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	


}
