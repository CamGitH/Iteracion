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
	public long adicionarOferta (PersistenceManager pm, long numOferta, long idOperador, long idLugar, String tipoLugar,long habilitada) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaOferta () + "(numoferta, idoperador, idlugar, tipolugar,habilitada) values (?, ?, ?, ?,?)");
        q.setParameters(numOferta, idOperador, idLugar, tipoLugar,habilitada);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN Oferta de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarOfertaPorNumero (PersistenceManager pm, long num)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaOferta () + " WHERE NUMOFERTA = ?");
        q.setParameters(num);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN Oferta de la 
	 * base de datos de Parranderos, por su identificador
	 * @return El objeto Oferta que tiene el identificador dado
	 */
	public long darOfertaPorNumero (PersistenceManager pm, long num)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOferta () + " WHERE NUMOFERTA = ?");
		q.setParameters(num);
		return (long) q.executeUnique();
	}

	public List<Oferta> darOfertas (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOferta ());
		q.setResultClass(Oferta.class);
		return (List<Oferta>) q.executeList();
	}

	public List<Oferta> darOfertasPop (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT *\n" +
				"FROM OFERTA,\n" +
				"(\n" +
				"SELECT OFERTAID \n" +
				"FROM RESERVAS \n" +
				"GROUP BY OFERTAID\n" +
				"HAVING COUNT (OFERTAID) >1 \n" +
				")  ofertas\n" +
				"\n" +
				"WHERE ofertas.ofertaid=OFERTA.numoferta\n" +
				"\n" +
				";");
		q.setResultClass(Oferta.class);
		return (List<Oferta>) q.executeList();
	}
	
	public long habilitarOferta(PersistenceManager pm, long num)
	{
		Query q= pm.newQuery(SQL, "UPDATE *\n"+ " "+ "OFERTA"+" "+"SET"+" "+"HABILITADA=1"+" "+"WHERE NUMOFERTA=?");
		q.setParameters(num);
		return (long) q.executeUnique();
		
	}

}
