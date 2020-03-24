package uniandes.isis2304.parranderos.negocio;

public class Oferta implements VOOferta
{
	

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	private long numoferta;
	
	private long idoperador;
	private long idlugar;
	private String tipolugar;
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
     * Constructor por defecto
     */
	public Oferta() 
    {
    	this.numoferta=0;
    	this.idoperador=0;
    	this.idlugar=0;
    	this.tipolugar="Default";
	}
	
	/**
	 * Constructor con valores
	 * @param numOf
	 * @param idOp
	 * @param idL
	 * @param tipoL
	 */
	public Oferta(long numOf, long idOp, long idL, String tipoL) 
    {
    	this.numoferta=numOf;
    	this.idoperador=idOp;
    	this.idlugar=idL;
    	this.tipolugar=tipoL;
	}
	


	public void setTipolugar(String tipolugar) {
		this.tipolugar = tipolugar;
	}

	@Override
	public long getNumOferta() {
		return numoferta;
	}
	
	public void setNumoferta(long numoferta) {
		this.numoferta = numoferta;
	}

	@Override
	public long getIdOperador() {
		return idoperador;
	}
	
	public void setIdoperador(long idoperador) {
		this.idoperador = idoperador;
	}

	@Override
	public long getIdLugar() {
		return idlugar;
	}
	
	public void setIdlugar(long idlugar) {
		this.idlugar = idlugar;
	}

	@Override
	public String getTipoLugar() {
		return tipolugar;
	}
	public String getTipolugar() {
		return tipolugar;
	}

	public String toString() 
	{
		return "Oferta [numoferta=" + numoferta + ", idoperador=" + idoperador + ", idlugar=" + idlugar + ", tipolugar=" + tipolugar + "]";
	}

}
