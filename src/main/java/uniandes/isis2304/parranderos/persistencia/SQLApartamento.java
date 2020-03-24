package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Apartamento;

public class SQLApartamento 
{

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaIter.SQL;
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaIter pp;
	
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/

	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLApartamento (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un Apartamento a la base de datos de Parranderos
	 * @param pm - El manejador de pe
	 * @return El número de tuplas insertadas
	 */
	public long adicionarApartamento (PersistenceManager pm, long numero, String contrato,String precioNum, int esAmoblado) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaApartamento () + "(numero,contrato, precionumero,esamoblado) values (?, ?, ?, ?)");
        q.setParameters(numero, contrato, precioNum, esAmoblado);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN Apartamento de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarApartamentoPorId (PersistenceManager pm, long id)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaApartamento () + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN Apartamento de la 
	 * base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return El objeto Apartamento que tiene el identificador dado
	 */
	public Apartamento darApartamentoPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaApartamento () + " WHERE id = ?");
		q.setResultClass(Apartamento.class);
		q.setParameters(id);
		return (Apartamento) q.executeUnique();
	}
	

}
