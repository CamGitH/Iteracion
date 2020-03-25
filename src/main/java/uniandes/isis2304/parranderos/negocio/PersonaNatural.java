package uniandes.isis2304.parranderos.negocio;

public class PersonaNatural implements VOPersonaNatural
{
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	private String contrato;
	
	private long numeroidentificacion;
	
	private String nombre; 
	
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	
	/**
     * Constructor por defecto
     */
	public PersonaNatural() 
    {
    	this.contrato="Default";
    	this.numeroidentificacion =0;
    	this.nombre="Default";
	}
	
	
	public PersonaNatural(String cont, long numId, String nom)
	{
		this.contrato=cont;
    	this.numeroidentificacion =numId;
    	this.nombre=nom;
		
	}


	@Override
	public String getContrato() {
		return contrato;
	}


	@Override
	public long getNumId() {
		return numeroidentificacion;
	}


	@Override
	public String getNombre() {
		return nombre;
	}


	public void setContrato(String contrato) {
		this.contrato = contrato;
	}


	public void setNumeroidentificacion(long numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	

}
