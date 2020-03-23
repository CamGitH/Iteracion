package uniandes.isis2304.parranderos.negocio;

public interface VOMiembroComunidad 
{
	/**
	 * @return el vínculo que tiene el miembro de la comunidad con UniAndes.
	 */
	public String getVinculo();
	
	/**
	 * @return el nombre del miembro de la comunidad.
	 */
	public String getNombre();
	
	/**
	 * @return el número de identificación del miembro de la comunidad.
	 */
	public long getNumID();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de un miembro de la comunidad
	 */
	public String toString();

}
