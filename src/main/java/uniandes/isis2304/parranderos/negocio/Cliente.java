package uniandes.isis2304.parranderos.negocio;

public class Cliente implements VOCliente
{
	
	private String direccion;
	
	private String tipoid;
	private String id;
	private String relacionuniandes;
	
	/**
	 * Constructor por defecto
	 */
	public Cliente() 
    {
    	this.direccion = "Default";
		this.tipoid = "Default";
		this.id = "Default";
		this.relacionuniandes = "Default";
	}
	
	/**
	 * Constructor con valores
	 * @param dir
	 * @param tipo
	 * @param id
	 * @param relacion
	 */
	public Cliente(String dir, String tipo, String id, String relacion) 
    {
    	this.direccion = dir;
		this.tipoid = tipo;
		this.id = id;
		this.relacionuniandes = relacion;
	}

	
	
	
	@Override
	public String getTipoId() {
		return tipoid;
	}
	public void setTipoid(String tipoid) {
		this.tipoid = tipoid;
	}
	
	@Override
	public String getRelacionUA() {
		return relacionuniandes;
	}
	public void setRelacionuniandes(String relacionuniandes) {
		this.relacionuniandes = relacionuniandes;
	}
	
	@Override
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String getId() {
		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String toString() 
	{
		return "Cliente [direccion=" + direccion + ", tipoid=" + tipoid + ", id=" + id + ", relacionuniandes=" + relacionuniandes + "]";
	}
	
	

}
