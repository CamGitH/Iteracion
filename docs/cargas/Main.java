package prueba;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;




public class Main {

	static List<Fecha> tabla;

	public static void main(String[] args) {
		tabla = new ArrayList<Fecha>();
		//llenarOfertaAlojamiento("./data/oferaalojamiento.csv");
		//writeDataLineByLine("./data/reserva.csv");
		
		System.out.println(1999.775 / 60);
	}


	public static void writeDataLineByLine(String filePath) 
	{ 

		File file = new File(filePath); 
		try { 

			FileWriter outputfile = new FileWriter(file); 
			outputfile.write("IDRESERVA,FECHAINICIO,FECHAFIN,IDOFERTAALOJAMIENTO,IDUSUARIO\n");
			int randomOfertaAlojamiento = 0;
			int randomUsuario = 0;
			LocalDate startDate = LocalDate.of(2019, 1, 1); //start date
			long start = startDate.toEpochDay();
			LocalDate endDate = LocalDate.of(2022,12,31); //end date
			long end = endDate.toEpochDay();
			int randomFecha = 1;
			long startTime = System.currentTimeMillis();
			for(int i = 1; i <= 500000;)
			{
				long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				LocalDate fechaInicio = LocalDate.ofEpochDay(randomEpochDay);
				randomFecha = (int) (Math.random()*12)+3;
				LocalDate fechaFin = LocalDate.ofEpochDay(randomEpochDay).plusDays(randomFecha);
				randomOfertaAlojamiento = (int) (Math.random()*1000)+1;

				if(!revisar(new Fecha(fechaInicio, fechaFin,randomOfertaAlojamiento)))
				{
					tabla.add(new Fecha(fechaInicio, fechaFin,randomOfertaAlojamiento));
					randomUsuario = (int) (Math.random()*300)+1;
					outputfile.write(i + ","+ fechaInicio + "," + fechaFin + "," + randomOfertaAlojamiento +","+ randomUsuario+"\n");
					i++;
					System.out.println(i);
				}
			}
			long endTime = System.currentTimeMillis();
			System.out.println((endTime - startTime)/1000.0);


			outputfile.close();

		} 
		catch (IOException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		} 	    	    
	} 


	private static void llenarOfertaAlojamiento(String filePath)
	{
		File file = new File(filePath);
		String[] nombreOferta = {"Habitacion Sencilla","Apto Doble","Habitacion Doble", "Apto Premium","Habitacion Premium","Apto Sencillo",};
		String[] privado = {"true","false"};
		String[] duracionMinima = {"30","1"};
		String[] capacidad = {"1","2","4"};

		try { 

			FileWriter outputfile = new FileWriter(file); 
			outputfile.write("IDOFERTAALOJAMIENTO,PRECIONOCHE,NOMBREOFERTA,CAPACIDAD,DESCRIPCION,PRIVADO,IDOPERADORALOJAMIENTO,DURACIONMINIMA,HABILITADO\n");

			String descripcion = "Listo para la estadia!";

			for(int i = 1; i <= 1000; i++)
			{
				outputfile.write(i + ","+ random(500, 1500) + "," + nombreOferta[random(0,5)] + "," + capacidad[random(0,2)] +","+ descripcion + "," + privado[random(0,1)] + "," + random(1,100) + "," + duracionMinima[random(0,1)] + ",true\n");
			}
			outputfile.close();
		}
		catch (Exception e) {

		}

	}
	
	private static int random(int min, int max)
	{
		return (int) (Math.random()*(max-min) + min);
	}


	private static boolean revisar(Fecha fecha)
	{
		boolean existe = false;
		Fecha f = null;
		for(int i = 0; i < tabla.size() && !existe; i++)
		{
			f = tabla.get(i);
			if(fecha.fechaFin.isEqual(f.getFechaFin()) && fecha.fechaInicio.isEqual(f.getFechaInicio()) && fecha.getIdOfertaAlojamiento() == f.getIdOfertaAlojamiento())
				existe = true;
			
		}

		return existe;
	}

}
