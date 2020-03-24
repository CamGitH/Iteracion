package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bar;
import uniandes.isis2304.parranderos.negocio.Oferta;
import uniandes.isis2304.parranderos.negocio.Reservas;

import java.util.List;

public class SQLReservas 
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
	public SQLReservas (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un BAR a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @return El número de tuplas insertadas
	 */
	public long adicionarReservas (PersistenceManager pm, String idCliente, long ofertaId) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaReservas () + "(idcliente, ofertaid) values (?, ?)");
        q.setParameters(idCliente, ofertaId);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN BAR de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarReservasPorIdDeOferta (PersistenceManager pm, long id)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaReservas () + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN BAR de la 
	 * base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return El objeto BAR que tiene el identificador dado
	 */
	public Reservas darReservasPorIdDeOferta (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaReservas () + " WHERE id = ?");
		q.setResultClass(Reservas.class);
		q.setParameters(id);
		return (Reservas) q.executeUnique();
	}

	public long creaarReserva (PersistenceManager pm, String idCliente, long idOferta)
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaReservas () + "(idcliente, ofertaid) values (?, ?)");
        q.setParameters(idCliente, idOferta);
        return (long) q.executeUnique();
	}

	public long deleteReserva (PersistenceManager pm, String idcliente, long ofertaid)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaReservas () + " WHERE idcliente = ? AND ofertaid = ?");
        q.setParameters(idcliente, ofertaid);
        return (long) q.executeUnique();
	}
	public List<Reservas> darReservas (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaReservas ());
		q.setResultClass(Reservas.class);
		return (List<Reservas>) q.executeList();
	}
}
