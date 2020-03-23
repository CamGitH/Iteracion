package uniandes.isis2304.parranderos.negocio;

public interface VOHabitacion 
{
	/**
	 * @return el número que identifica la habitación
	 */
	public long getNum();
	
	/**
	 * @return 1 si la habitación es individual, 0 en caso contrario 
	 */
	public long getEsIndividual();
	
	/**
	 * @return el tiempo durante el cual el cliente utilizará la habitación 
	 */
	
	public String getDuracion();
	
	/**
	 * @return 1 si la habitación tiene menaje, 0 en caso contrario 
	 */
	
	public int getMenaje();

	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();
}
