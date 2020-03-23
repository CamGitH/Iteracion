package uniandes.isis2304.parranderos.negocio;

public interface VOHostal 
{
	/**
	 * @return El id del hostal
	 */
	public long getId(); 
	
	/**
	 * @return El registro de la cámara de comercio del hostal
	 */
	public long getRegistroCamara(); 
	
	/**
	 * @return La hora de apertura del hostal
	 */
	public long getApertura();
	
	/**
	 * @return La hora de cierre del hostal
	 */
	public long getCierre();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del hostal
	 */
	public String toString();

}
