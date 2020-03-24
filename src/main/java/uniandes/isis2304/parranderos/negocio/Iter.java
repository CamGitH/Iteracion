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
        log.info ("Generando los VO de Tipos de operador");
        List<VOOperador> voOp = new LinkedList<VOOperador> ();
        for (Operador to : pp.darOperadores ())
        {
            voOp.add (to);
        }
        log.info ("Generando los VO de ops: " + voOp.size() + " existentes");
        return voOp;
    }

}
