package uniandes.isis2304.parranderos.negocio;

public interface VOVivienda 
{
	/**
	 * @return dirección de la vivienda
	 */
	public String getDir();
	/**
	 * @return costo de arriendo de la vivienda
	 */
	public long getCosto();
	
	/**
	 * @return seguro de la vivienda
	 */
	public String getSeguro();
	
	/**
	 * @return núemro de habitaciones de la vivienda
	 */
	public long getNumHabitaciones();
	
	/**
	 * @return 1 si la vivienda cuenta con menaje, 0 en caso contrario.
	 */
	public long getMenaje();
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la vivienda
	 */
	public String toString();

}
