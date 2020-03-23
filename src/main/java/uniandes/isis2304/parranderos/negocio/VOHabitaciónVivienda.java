package uniandes.isis2304.parranderos.negocio;

public interface VOHabitaciónVivienda 
{
	/**
	 * @return identificador de la habitación
	 */
	public int getNum();
	
	/**
	 * @return esquma de convivencia de la habitación
	 */
	public String getEsquema();
	
	
	/**
	 * @return costo de los servicios públicos de la habitación
	 */
	public String getCostoServs();
	
	/**
	 * @return 1 si la habitación es individual, 0 en caso contrario
	 */
	public int getiEsIndividual();
	
	/**
	 * @return 1 si la habitación cuenta con baño privado, 0 en caso contrario
	 */
	public int getBanioPriv();
	
	/**
	 * @return 1 si la habitación tiene acceso a la cocina, 0 en caso contrario
	 */
	public int getAccesoCoci();
	
	/**
	 * @return 1 si la habitación incluye las comidas básicas del día, 0 en caso contrario
	 */
	public int getComidas();
	

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la habitación de una vivienda
	 */
	public String toString();
}
