package uniandes.isis2304.parranderos.negocio;

public class Operador implements VOOperador {


    private long id;
    private String tipo;
    private String nombre;

    /* ****************************************************************
     * 			Métodos
     *****************************************************************/
    /**
     * Constructor por defecto
     */
    public Operador()
    {
        this.id = 0;
        this.tipo = "Default";
        this.nombre = "Default";
    }

    /**
     * Constructor con valores
     * @param id - El identificador del tipo de bebida
     * @param nombre - El nombre del tipo de bebida
     */
    public Operador(long id, String tipo, String nombre)
    {
        this.id = id;
        this.tipo=tipo;
        this.nombre = nombre;
    }

    /**
     * @return El id del tipo de bebida
     */
    public long getId()
    {
        return id;
    }

    /**
     * @param id - El nuevo id del tipo de bebida
     */
    public void setId(long id)
    {
        this.id = id;
    }

    public String getTipo()
    {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    /**
     * @return El nombre del tipo de bebida
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre - El nuevo nombre del tipo de bebida
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }


    /**
     * @return Una cadena de caracteres con la información del tipo de bebida
     */
    @Override
    public String toString()
    {
        return "TipoOperador [id=" + id + ", tipo="+tipo+ ", nombre=" + nombre + "]";
    }



}
