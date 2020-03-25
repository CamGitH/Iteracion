package uniandes.isis2304.parranderos.negocio;

public class GananciaOperador implements VOGananciaOperador
{
    /* ****************************************************************
     * 			Atributos
     *****************************************************************/

    private String idreserva;

    private long precio;

    /* ****************************************************************
     * 			Métodos
     *****************************************************************/
    /**
     * Constructor por defecto
     */
    public GananciaOperador()
    {
        this.idreserva="Default";
        this.precio=0;
    }

    /**
     * Constructor con valores
     * @param idCl
     * @param ofId
     */
    public GananciaOperador(String idCl, long ofId)
    {
        idreserva=idCl;
        precio=ofId;
    }


    @Override
    public String getidreserva() {
        return idreserva;
    }

    @Override
    public long getIdPrecio() {
        return precio;
    }

    public String toString()
    {
        return "Reservas [idreserva=" + idreserva + ", precio=" + precio + "]";
    }

}
