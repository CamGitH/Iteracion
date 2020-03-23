package uniandes.isis2304.parranderos.negocio;

public interface VOPersonaNatural 
{
	/**
	 * @return contrato de arrendamiento de la persona
	 */
	public String getContrato();
	
	/**
	 * @return id de la persona
	 */
	public long getNumId();
	
	/**
	 * @return Nombre de la persona
	 */
	public String getNombre();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de una persona natural
	 */
	public String toString();

}
