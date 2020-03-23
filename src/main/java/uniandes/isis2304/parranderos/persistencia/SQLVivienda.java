package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bar;

public class SQLVivienda 
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
	public SQLVivienda (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un BAR a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @return El número de tuplas insertadas
	 */
	public long adicionarVivienda (PersistenceManager pm, String dir, long costo,String seguro, long numHabitaciones ,long menaje) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaVivienda () + "(id, nombre, ciudad, presupuesto, cantsedes) values (?, ?, ?, ?, ?)");
        q.setParameters(dir, costo, seguro, numHabitaciones, menaje);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN BAR de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarViviendaPorDireccion (PersistenceManager pm, String dir)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaVivienda () + " WHERE id = ?");
        q.setParameters(dir);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN BAR de la 
	 * base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return El objeto BAR que tiene el identificador dado
	 */
	public Bar darViviendaPorDireccion (PersistenceManager pm, String dir) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaVivienda () + " WHERE id = ?");
		q.setResultClass(Bar.class);
		q.setParameters(dir);
		return (Bar) q.executeUnique();
	}
	

}
