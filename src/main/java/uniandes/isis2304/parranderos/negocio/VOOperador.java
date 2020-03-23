package uniandes.isis2304.parranderos.negocio;

public interface VOOperador 
{
	/**
	 * @return El id del operador
	 */
	public long getId();  
	
	/**
	 * @return El tipo del operador
	 */
	
	public String getTipo();
	
	
	/**
	 * @return El nombre del operador
	 */
	public String getNombre();
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del operador
	 */
	public String toString();

}
