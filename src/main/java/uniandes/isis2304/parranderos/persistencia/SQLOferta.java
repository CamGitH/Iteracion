package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import java.util.List;

import uniandes.isis2304.parranderos.negocio.Oferta;


public class SQLOferta 
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
	public SQLOferta (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un Oferta a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @return El número de tuplas insertadas
	 */
	public long adicionarOferta (PersistenceManager pm, long numOferta, long idOperador, long idLugar, String tipoLugar) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaOferta () + "(numoferta, idoperador, idlugar, tipolugar) values (?, ?, ?, ?)");
        q.setParameters(numOferta, idOperador, idLugar, tipoLugar);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN Oferta de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarOfertaPorNumero (PersistenceManager pm, long num)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaOferta () + " WHERE id = ?");
        q.setParameters(num);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN Oferta de la 
	 * base de datos de Parranderos, por su identificador
	 * @return El objeto Oferta que tiene el identificador dado
	 */
	public Oferta darOfertaPorNumero (PersistenceManager pm, long num) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOferta () + " WHERE id = ?");
		q.setResultClass(Oferta.class);
		q.setParameters(num);
		return (Oferta) q.executeUnique();
	}

	public List<Oferta> darOfertas (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOferta ());
		q.setResultClass(Oferta.class);
		return (List<Oferta>) q.executeList();
	}



	

}
