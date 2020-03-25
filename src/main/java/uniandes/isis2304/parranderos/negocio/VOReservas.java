package uniandes.isis2304.parranderos.negocio;

public interface VOReservas 
{
	/**
	 * @return id del cliente que realiza la reserva
	 */
	public String getIdCliente();
	
	/**
	 * @return id de la oferta sobre la que realiza la reserva
	 */
	public long getOfertaId();

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();

}
