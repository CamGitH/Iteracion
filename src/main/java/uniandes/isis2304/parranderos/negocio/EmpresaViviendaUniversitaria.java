package uniandes.isis2304.parranderos.negocio;

public class EmpresaViviendaUniversitaria implements VOEmpresaViviendaUniversitaria
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	private String id;
	
	private String nombre;
	
	private long registrocamaracomercio;
	
	private long tienesalaestudio;
	
	private long tienesalaesparcimiento; 
	
	private long tienegimnasio;
	
	private long tienerestaurante; 
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	
	/**
     * Constructor por defecto
     */
	public EmpresaViviendaUniversitaria() 
    {
    	this.id="Default";
    	this.nombre="Default";
    	this.registrocamaracomercio=0;
    	this.tienesalaestudio =0;
    	this.tienesalaesparcimiento=0;
    	this.tienegimnasio=0;
    	this.tienerestaurante=0;
	}
	
	/**
	 * Constructor con valores
	 * @param id
	 * @param nom
	 * @param regc
	 * @param tieneestudio
	 * @param tieneespar
	 * @param tienegim
	 * @param tienerest
	 */
	public EmpresaViviendaUniversitaria(String id, String nom, long regc, long tieneestudio, long tieneespar, long tienegim, long tienerest)
	{
		this.id=id;
    	this.nombre=nom;
    	this.registrocamaracomercio=regc;
    	this.tienesalaestudio =tieneestudio;
    	this.tienesalaesparcimiento=tieneespar;
    	this.tienegimnasio=tienegim;
    	this.tienerestaurante=tienerest;
		
	}

	@Override
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public long getRegistroCamara() {
		return registrocamaracomercio;
	}
	
	public void setRegistrocamaracomercio(long registrocamaracomercio) {
		this.registrocamaracomercio = registrocamaracomercio;
	}

	@Override
	public long getTieneSalaE() {
		return tienesalaestudio;
	}
	
	public void setTienesalaestudio(long tienesalaestudio) {
		this.tienesalaestudio = tienesalaestudio;
	}

	@Override
	public long getTieneEsparcimiento()
	{
		return tienesalaesparcimiento;
	}
	
	public void setTienesalaesparcimiento(long tienesalaesparcimiento) {
		this.tienesalaesparcimiento = tienesalaesparcimiento;
	}

	@Override
	public long getTieneGimnasio() {
		return tienegimnasio;
	}
	
	public void setTienegimnasio(long tienegimnasio) {
		this.tienegimnasio = tienegimnasio;
	}

	@Override
	public long getTieneRestaurante() {
		return tienerestaurante;
	}

	public void setTienerestaurante(long tienerestaurante) {
		this.tienerestaurante = tienerestaurante;
	}

	public String toString() 
	{
		return "Oferta [id=" + id + ", nombre=" + nombre + ", registrocamaracomercio=" + registrocamaracomercio + ", tienesalaestudio=" + tienesalaestudio +",tienesalaesparcimiento "+tienesalaesparcimiento+", tienegimnasio"+ tienegimnasio+",tienerestaurante"+tienerestaurante + "]";
	}

}
