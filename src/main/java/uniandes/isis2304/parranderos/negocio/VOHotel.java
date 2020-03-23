package uniandes.isis2304.parranderos.negocio;

public interface VOHotel 
{
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * @return El id del hotel
	 */
	public long getId();
	
	/**
	 * @return El registro en la cámara de comercio del hotel
	 */
	public long getRegistroCamara();
	
	/**
	 * @return El id la categoría del hotel
	 */
	public long getCategoria(); 
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del hotel
	 */
	public String toString();

}
