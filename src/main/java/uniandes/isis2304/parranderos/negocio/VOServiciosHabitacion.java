package uniandes.isis2304.parranderos.negocio;

public interface VOServiciosHabitacion 
{
	/**
	 * @return id del hotel al que pertenece la habitación
	 */
	public long getId();
	
	/**
	 * @return 1 si la habitación tiene bañera, 0 en el caso contrario
	 */
	public long getTieneBaniera();
	
	/**
	 * @return 1 si la habitación tiene yacuzzi, 0 en el caso contrario
	 */
	public long getTieneYacuzzi();
	
	/**
	 * @return 1 si la habitación tiene sala, 0 en el caso contrario
	 */
	public long getSala();
	
	/**
	 * @return 1 si la habitación tiene cocineta, 0 en el caso contrario
	 */
	public long getCocineta();
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de los servicios de una habitación
	 */
	public String toString();

}
