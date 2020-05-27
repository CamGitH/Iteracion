package prueba;

import java.time.LocalDate;

public class Fecha {
	
	LocalDate fechaInicio;
	LocalDate fechaFin;
	int idOfertaAlojamiento;
	
	public Fecha(LocalDate fechaInicio, LocalDate fechaFin, int idOfertaAlojamiento) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.idOfertaAlojamiento = idOfertaAlojamiento;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getIdOfertaAlojamiento() {
		return idOfertaAlojamiento;
	}

	public void setIdOfertaAlojamiento(int idOfertaAlojamiento) {
		this.idOfertaAlojamiento = idOfertaAlojamiento;
	}

	@Override
	public String toString() {
		return "Fecha [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", idOfertaAlojamiento="
				+ idOfertaAlojamiento + "]";
	}
	
	

}
