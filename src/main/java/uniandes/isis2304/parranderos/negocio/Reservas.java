package uniandes.isis2304.parranderos.negocio;

public class Reservas implements VOReservas
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	private String idcliente;
	
	private long ofertaid;
	
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
	}
	
	/**
	 * Constructor con valores
	 * @param idCl
	 * @param ofId
	 */
	public Reservas(String idCl, long ofId)
	{
		idcliente=idCl;
		ofId= ofertaid;
	}

	@Override
	public String getIdCliente() {
		return idcliente;
	}

	@Override
	public long getOfertaId() {
		return ofertaid;
	}
	
	public String toString() 
	{
		return "Reservas [idcliente=" + idcliente + ", ofertaid=" + ofertaid + "]";
	}
	
	

}
