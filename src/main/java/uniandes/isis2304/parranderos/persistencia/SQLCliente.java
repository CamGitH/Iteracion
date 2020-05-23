package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bar;
import uniandes.isis2304.parranderos.negocio.Cliente;
import uniandes.isis2304.parranderos.negocio.Operador;

import java.util.List;

public class SQLCliente 
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
	public SQLCliente (PersistenciaIter pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un BAR a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia

	 * @return El número de tuplas insertadas
	 */
	public long adicionarCliente (PersistenceManager pm, String direccion, String tipoId, String id, String relacionUA ) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCliente () + "(direccion, tipoid,id,relacionuniandes) values (?, ?, ?, ?)");
        q.setParameters(direccion,tipoId,id,relacionUA);
        return (long) q.executeUnique();
	}


	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN BAR de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarHotelPorId (PersistenceManager pm, long id)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCliente () + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de UN BAR de la 
	 * base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @return El objeto BAR que tiene el identificador dado
	 */
	public Cliente darHotelPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCliente () + " WHERE id = ?");
		q.setResultClass(Cliente.class);
		q.setParameters(id);
		return (Cliente) q.executeUnique();
	}

	public List<Cliente> darClientes (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCliente ());
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}
	public List<Cliente> darClientesFrec (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * from(SELECT idcliente FROM reservas GROUP BY (idcliente) having count(*)>1)Order BY idcliente DESC");
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}

	public List<Cliente> darClientesRef1 (PersistenceManager pm, String fechai, String fechaf)
	{
		Query q = pm.newQuery(SQL, "SELECT * from CLIENTE, reservas WHERE reservas.idcliente=cliente.id AND reservas.fechainicial >= '1-DIC-2018' AND reservas.fechafinal <='31-DIC-2020'\r\n" );
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}
	public List<Cliente> darClientesRef2 (PersistenceManager pm, String fechai, String fechaf)
	{
		Query q = pm.newQuery(SQL, "SELECT * from CLIENTE, oferta, reservas WHERE reservas.idcliente=cliente.id AND reservas.fechainicial >= '1-DIC-2018' AND reservas.fechafinal <='31-DIC-2020' ORDER BY RESERVAS.IDCLIENTE" );
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}
	public List<Cliente> darClientesRef3 (PersistenceManager pm, String fechai, String fechaf)
	{
		Query q = pm.newQuery(SQL, "SELECT OFERTA.TIPOLUGAR, cliente.id, cliente.direccion, cliente.tipoId, cliente.relacionuniandes FROM OFERTA, CLIENTE, RESERVAS WHERE reservas.idcliente=cliente.id");
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}

	public List<Cliente> darClientesr11 (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * from CLIENTE, RESERVAS WHERE reservas.idcliente = cliente.id\r\n");
		q.setResultClass(Cliente.class);
		return (List<Cliente>) q.executeList();
	}
}
