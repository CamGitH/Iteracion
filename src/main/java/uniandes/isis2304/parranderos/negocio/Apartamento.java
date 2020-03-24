package uniandes.isis2304.parranderos.negocio;

public class Apartamento implements VOApartamento 
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	private long numero;
	
	private String contrato;
	
	private String precionumero;
	
	private long esamoblado; 
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
     * Constructor por defecto
     */
	public Apartamento() 
    {
    	this.numero=0;
    	this.contrato="Default";
    	this.precionumero="Default";
    	this.esamoblado=0;
	}
	
	public Apartamento(long num, String cont, String precionum, long amobl)
	{
		this.numero=num;
    	this.contrato=cont;
    	this.precionumero=precionum;
    	this.esamoblado=amobl;
		
	}

	@Override
	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	

	@Override
	public String getContrato() {
		return contrato;
	}
	
	
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}


	@Override
	public String getPrecioNum() {
		return precionumero;
	}
	
	public void setPrecionumero(String precionumero) {
		this.precionumero = precionumero;
	}


	@Override
	public long getEsAmoblado() {
		return esamoblado;
	}
	

	public void setEsamoblado(int esamoblado) {
		this.esamoblado = esamoblado;
	}


	public String toString() 
	{
		return "Apartamento [numero=" + numero + ", contrato=" + contrato + ", precionumero=" + precionumero + ", esamoblado=" + esamoblado + "]";
	}

	


}
