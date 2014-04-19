package noConformidad;

public class MitigacionItemNoConf {
	
	private long idmitigacion_item_no_conf;
	private String clienteDeptoNro;
	private String fechaPrometidaParaMitigacion;
	private String fechaCumplidaMitigacion;
	private long nroItem;
	private long nroCategoriaItem;
	private long planDeAccion;
	private String estaCumplido;
	
	
	public MitigacionItemNoConf() {
		
	}

	public long getIdmitigacion_item_no_conf() {
		return idmitigacion_item_no_conf;
	}

	public void setIdmitigacion_item_no_conf(long idmitigacion_item_no_conf) {
		this.idmitigacion_item_no_conf = idmitigacion_item_no_conf;
	}
	public String getFechaPrometidaParaMitigacion() {
		return fechaPrometidaParaMitigacion;
	}

	public void setFechaPrometidaParaMitigacion(String fechaPrometidaParaMitigacion) {
		this.fechaPrometidaParaMitigacion = fechaPrometidaParaMitigacion;
	}

	public String getFechaCumplidaMitigacion() {
		return fechaCumplidaMitigacion;
	}

	public void setFechaCumplidaMitigacion(String fechaCumplidaMitigacion) {
		this.fechaCumplidaMitigacion = fechaCumplidaMitigacion;
	}

	

	public long getPlanDeAccion() {
		return planDeAccion;
	}

	public void setPlanDeAccion(long planDeAccion) {
		this.planDeAccion = planDeAccion;
	}

	public String getEstaCumplido() {
		return estaCumplido;
	}

	public void setEstaCumplido(String estaCumplido) {
		this.estaCumplido = estaCumplido;
	}

	public long getNroItem() {
		return nroItem;
	}

	public void setNroItem(long nroItem) {
		this.nroItem = nroItem;
	}

	public long getNroCategoriaItem() {
		return nroCategoriaItem;
	}

	public void setNroCategoriaItem(long nroCategoriaItem) {
		this.nroCategoriaItem = nroCategoriaItem;
	}

	public String getClienteDeptoNro() {
		return clienteDeptoNro;
	}

	public void setClienteDeptoNro(String string) {
		this.clienteDeptoNro = string;
	}
	
	
	
	
	

}
