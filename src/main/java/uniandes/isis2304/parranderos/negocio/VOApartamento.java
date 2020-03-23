package uniandes.isis2304.parranderos.negocio;

public interface VOApartamento 
{
	/**
	 * @return el número que identifica al apartamento
	 */
	public long getNumero();
	
	/**
	 * @return el contrato de arrendamiento
	 */
	
	public String getContrato();
	
	/**
	 * @return el precio del apartamento
	 */
	public String getPrecioNum();
	
	/**
	 * @return 1 si el apartamento es amoblado, 0 en caso contrario
	 */
	public int getEsAmoblado();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del apartamento
	 */
	public String toString();
	

}
