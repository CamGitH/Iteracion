package uniandes.isis2304.parranderos.negocio;

public interface VOVecino 
{
	/**
	 * @return nombre del vecino
	 */
	public String getNombre();
	
	/**
	 * @return dorección del vecino
	 */
	public String getDir();
	
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();

}
