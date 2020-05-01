package uniandes.isis2304.parranderos.negocio;

public interface VOOferta 
{
	/**
	 * @return número que identifica la oferta
	 */
	public long getNumOferta();
	
	/**
	 * @return id del operador que realiza la oferta
	 */
	public long getIdOperador(); 
	
	/**
	 * @return id del lugar sobre el que se realiza la oferta
	 */
	public long getIdLugar(); 
	
	/**
	 * @return tipo del lugar sobre el que se realiza la oferta
	 */
	public String getTipoLugar();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();
	
	/**
	 * @return 1 si la oferta está habilitada, 0 si está deshabilta
	 */
	
	public long getHabilitada();

}

