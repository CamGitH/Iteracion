package uniandes.isis2304.parranderos.negocio;

public interface VOHabitacionVUni 
{
	/**
	 * @return el núemro de la habitación
	 */
	public long getNum();
	
	/**
	 * @return 1 si la habitación es individual, 0 en caso contrario
	 */
	
	public long getEsIndividual();
	
	/**
	 * @return el tiempo durante el cual la habitación será utilizada por un cliente.
	 */
	
	public String getDuracion();
	
	/**
	 * @return 1 si la habitación tiene menaje, 0 en caso contrario
	 */
	
	int getMenaje();
	
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la habitación de una vivienda universitaria
	 */
	public String toString();

}
