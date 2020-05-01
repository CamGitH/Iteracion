package uniandes.isis2304.parranderos.negocio;


import com.google.gson.JsonObject;
import org.apache.log4j.Logger;
import uniandes.isis2304.parranderos.persistencia.PersistenciaIter;

import java.util.LinkedList;
import java.util.List;


public class Iter {

    private static Logger log = Logger.getLogger(Iter.class.getName());


    /* ****************************************************************
     * 			Atributos
     *****************************************************************/
    /**
     * El manejador de persistencia
     */
    private PersistenciaIter pp;

    /* ****************************************************************
     * 			Métodos
     *****************************************************************/
    /**
     * El constructor por defecto
     */
    public Iter ()
    {
        pp = PersistenciaIter.getInstance ();
    }

    /**
     * El constructor qye recibe los nombres de las tablas en tableConfig
     * @param tableConfig - Objeto Json con los nombres de las tablas y de la unidad de persistencia
     */
    public Iter (JsonObject tableConfig)
    {
        pp = PersistenciaIter.getInstance (tableConfig);
    }

    /**
     * Cierra la conexión con la base de datos (Unidad de persistencia)
     */
    public void cerrarUnidadPersistencia ()
    {
        pp.cerrarUnidadPersistencia ();
    }


    public List<VOOperador> darVOOperadores()
    {
        log.info ("Generando los VO de operador");
        List<VOOperador> voOp = new LinkedList<VOOperador> ();
        for (Operador to : pp.darOperadores ())
        {
            voOp.add (to);
        }
        log.info ("Generando los VO de operadores: " + voOp.size() + " existentes");
        return voOp;
    }

    public List<VOReservas> buscarReservaPorCliente( String idCliente){
        log.info ("Generando los VO de Reservas");
        List<VOReservas> voRe = new LinkedList<VOReservas> ();
        for (Reservas to : pp.darReservasPorClientes (idCliente))
        {
            voRe.add (to);
        }
        log.info ("Generando los VO de clientes: " + voRe.size() + " existentes");
        return voRe;
    }

    public List<VOCliente> darVOClientes()
    {
        log.info ("Generando los VO de cliente");
        List<VOCliente> voCli = new LinkedList<VOCliente> ();
        for (Cliente to : pp.darClientes ())
        {
            voCli.add (to);
        }
        log.info ("Generando los VO de clientes: " + voCli.size() + " existentes");
        return voCli;
    }

    public List<VOOferta> darVOOfertas()
    {
        log.info ("Generando los VO de oferta");
        List<VOOferta> voOf = new LinkedList<VOOferta> ();
        for (Oferta to : pp.darOfertas ())
        {
            voOf.add (to);
        }
        log.info ("Generando los VO de ofertas: " + voOf.size() + " existentes");
        return voOf;
    }

    public List<VOOferta> darVOOfertasPop()
    {
        log.info ("Generando los VO de oferta");
        List<VOOferta> voOf = new LinkedList<VOOferta> ();
        for (Oferta to : pp.darOfertasPop ())
        {
            voOf.add (to);
        }
        log.info ("Generando los VO de ofertas: " + voOf.size() + " existentes");
        return voOf;
    }

    public List<VOReservas> darVOReservas()
    {
        log.info ("Generando los VO de reserva");
        List<VOReservas> voRe = new LinkedList<VOReservas> ();
        System.out.print("voRe");
        System.out.print(voRe);
        for (Reservas to : pp.darReservas ())
        {
            voRe.add (to);
        }
        log.info ("Generando los VO de reservas: " + voRe.size() + " existentes");
        System.out.print(voRe);
        return voRe;
    }


    public List<GananciaOperador> cuantogana (long idoperador)
    {
        log.info ("Generando cuanto gana VO");
        List<GananciaOperador> voOf = new LinkedList<GananciaOperador> ();
        for (GananciaOperador to : pp.darOperadorgana (idoperador))
        {
            voOf.add (to);
        }
        log.info ("Generando cuanto gana VO: " + voOf.size() + " existentes");
        return voOf;
    }


    public Reservas ceateReserva (String IdCliente, long IdOferta, long cantidad)
	{
		log.info ("Creando reserva " + IdCliente + " & " +IdOferta + " & " +cantidad);
        Reservas reserva = pp.ceateReserva (IdCliente, IdOferta, cantidad);
        log.info ("Creando reserva : " + reserva);
        return reserva;
	}
    
    public Oferta ceateOferta (long numOf, long idOp, long idL, String tipoL, long hab)
   	{
   		log.info ("Creando oferta " + numOf + " & " + idOp + " & " +idL+"&"+tipoL+"&"+hab);
           Oferta oferta = pp.createOferta (numOf, idOp, idL,tipoL,hab);
           log.info ("Creando oferta : " + oferta);
           return oferta;
   	}


	public long deleteReserva (String idcliente, long idOferta)
	{
        log.info ("Eliminando Reserva: " + idcliente+" & "+idOferta);
         long resp = pp.deleteReserva (idcliente, idOferta);
        log.info ("Eliminando Reserva: " + resp + " tuplas eliminadas");
        return resp;
	}
	
	public long habilitarOferta(long numOferta)
	{
		log.info ("Habilitando Oferta: " + numOferta);
        long resp = pp.habilitarOferta(numOferta);
        log.info ("Habilitando Oferta: " + resp + " tuplas habilitadas");
        return resp;
		
	}
	
	public long deshabilitarOferta(long numOferta)
	{
		log.info ("Deshabilitando Oferta: " + numOferta);
        long resp = pp.deshabilitarOferta(numOferta);
        log.info ("Deshabilitando Oferta: " + resp + " tuplas habilitadas");
        return resp;
		
	}

    public long deleteOferta (long numOferta)
    {
        log.info ("Eliminando Oferta: " + numOferta);
        long resp = pp.deleteOferta (numOferta);
        log.info ("Eliminando Oferta: " + resp + " tuplas eliminadas");
        return resp;
    }

}
