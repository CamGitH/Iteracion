package uniandes.isis2304.parranderos.negocio;

public interface VOServiciosHotel 
{
	/**
	 * @return id del hotel en cuestión
	 */
	public long getId(); 
	
	/**
	 * @return 1 si el hotel cuenta con restaurante, 0 en el caso contrario.
	 */
	public long getTieneRestaurante();
	
	/**
	 * @return 1 si el hotel cuenta con piscina, 0 en el caso contrario.
	 */
	public long getTienePiscina();
	
	/**
	 * @return 1 si el hotel cuenta con restaurante, 0 en el caso contrario.
	 */
	public long getTieneParqueadero();
	
	/**
	 * @return 1 si el hotel cuenta con wifi, 0 en el caso contrario.
	 */
	public long getTienewifi();
	
	/**
	 * @return 1 si el hotel cuenta con tv, 0 en el caso contrario.
	 */
	public long getTieneTv();
	
	/**
	 * @return 1 si el hotel tiene recepción 24 horas, 0 en el caso contrario.
	 */
	
	public long getH24();
	
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();

}
