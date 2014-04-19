package ObjetosPersistentes;



import javax.swing.JOptionPane;

public class Empresa   {
	
	
	String cuit_cuip;//, varchar(50), NO, PRI, , 
	String nombre;//, varchar(100), YES, , , 
	String domicilio;//, varchar(100), YES, , , 
	String localidad;//, varchar(100), YES, , , 
	String actividad_economica;//, varchar(100), YES, , , 
	int cp_cpa;//, int(11), YES, , , 
	String provincia;//, varchar(100), YES, , , 
	String contrato;//, varchar(100), YES, , , 
	String eMail;//, varchar(100), YES, , , 
	byte[] logo;//, longblob, YES, , , 
	String telefono;//, varchar(45), YES, , , 
	public Empresa() {
	
		super();
		
	}
	public String noHayVacios(){
		
		if(this.nombre.isEmpty())
			return "nombre";
		if(this.domicilio.isEmpty())
			return "domicilio";
		if(this.localidad.isEmpty())
			return "localidad";
		if(this.actividad_economica.isEmpty())
			return "actividad_economica";
		try{
		if(this.cp_cpa*1!=this.cp_cpa || this.cp_cpa==0)
			return "codigo postal";
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Valor incorrecto en codigo postal");
			return "codigo postal";
		}
		if(this.provincia.isEmpty())
			return "provincia";
		if(this.contrato.isEmpty())
			return "contrato";
		if(this.eMail.isEmpty())
			return "eMail";
		if (this.logo==null)
			return "logo";
		if (this.telefono.isEmpty())
			return "telefono";		
		
		return "Ok";
	}
	public String getCuit_cuip() {
		return cuit_cuip;
	}
	public void setCuit_cuip(String cuit_cuip) {
		this.cuit_cuip = cuit_cuip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getActividad_economica() {
		return actividad_economica;
	}
	public void setActividad_economica(String actividad_economica) {
		this.actividad_economica = actividad_economica;
	}
	public int getCp_cpa() {
		return cp_cpa;
	}
	public void setCp_cpa(int cp_cpa) {
		
		this.cp_cpa =cp_cpa;
		
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String mail) {
		eMail = mail;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	


}
