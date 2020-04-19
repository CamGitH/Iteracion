package uniandes.isis2304.parranderos.negocio;

public class Reservas implements VOReservas
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	private String idcliente;
	
	private long ofertaid;

	private long cantidad;
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
     * Constructor por defecto
     */
	public Reservas() 
    {
    	this.idcliente="Default";
    	this.ofertaid=0;
    	this.cantidad=0;
	}
	
	/**
	 * Constructor con valores
	 * @param idCl
	 * @param ofId
	 */
	public Reservas(String idCl, long ofId, long cant)
	{
		idcliente=idCl;
		ofertaid=ofId;
		cantidad= cant;
	}

	@Override
	public String getIdCliente() {
		return idcliente;
	}

	@Override
	public long getOfertaId() {
		return ofertaid;
	}

	@Override
	public long getCantidad() { return cantidad; }

	public String toString() 
	{
		return "Reservas [idcliente=" + idcliente + ", ofertaid=" + ofertaid + "]";
	}
	
	

}
