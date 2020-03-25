package uniandes.isis2304.parranderos.negocio;

public interface VOEmpresaViviendaUniversitaria 
{
	/**
	 * @return el id de la empresa de vivienda universitaria
	 */
	public String getId();
	/**
	 * @return el nombre de la empresa de vivienda universitaria
	 */
	public String getNombre();
	/**
	 * @return el registro en la cámara de comercio de la empresa de vivienda universitaria
	 */
	public long getRegistroCamara();
	
	/**
	 * @return 1 si la empresa de vivienda universitaria tiene salas de estudio, 0 en caso contrario.
	 */
	public long getTieneSalaE();
	
	/**
	 * @return 1 si la empresa de vivienda universitaria tiene salas de esparcimiento, 0 en caso contrario.
	 */
	public long getTieneEsparcimiento();
	
	/**
	 * @return 1 si la empresa de vivienda universitaria tiene gimnasio, 0 en caso contrario.
	 */
	public long getTieneGimnasio();
	
	/**
	 * @return 1 si la empresa de vivienda universitaria tiene restaurante, 0 en caso contrario.
	 */
	public long getTieneRestaurante();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la empresa de vivienda universitaria
	 */
	public String toString();

}
