package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bar;

public class SQLHabitacionVUni 
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
	public SQLHabitacionVUni  (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un BAR a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 */
	public long adicionarHabitacionVUni  (PersistenceManager pm, long num, long individual, String duracion, int menaje) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaHabitacionvuni () + "(id, nombre, ciudad, presupuesto, cantsedes) values (?, ?, ?, ?, ?)");
        q.setParameters(num,individual,duracion,menaje);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN BAR de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarHabitacionVUniPorNumero (PersistenceManager pm, long num)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaHabitacionvuni () + " WHERE id = ?");
        q.setParameters(num);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN BAR de la 
	 * base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return El objeto BAR que tiene el identificador dado
	 */
	public Bar darHabitacionVUniPorNumero (PersistenceManager pm, long num) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaHabitacionvuni () + " WHERE id = ?");
		q.setResultClass(Bar.class);
		q.setParameters(num);
		return (Bar) q.executeUnique();
	}
	

}
