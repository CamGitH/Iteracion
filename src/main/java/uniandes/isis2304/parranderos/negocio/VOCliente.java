package uniandes.isis2304.parranderos.negocio;

public interface VOCliente 
{
	/**
	 * @return la dirección del cliente
	 */
	public String getDireccion();
	
	/**
	 * @return el tipo de identificaicón del cliente
	 */
	public String getTipoId();
	
	/**
	 * @return la identificación del cliente
	 */
	public String getId();
	
	/**
	 * @return la relación que tiene el cliente con UniAndes
	 */
	public String getRelacionUA();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del cliente
	 */
	public String toString();

}
