package prueba.bus;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adultos
		Pasajeros alejandro = new Pasajeros();
		alejandro.setNombre("Alejandro");
		alejandro.setApellido("Alvarracin");
		alejandro.setCodigoSeguroSocial(25467);
		alejandro.setEmpresaQueTrabaja("Banco Pichincha");
		
		Pasajeros danilo = new Pasajeros();
		danilo.setNombre("Danilo");
		danilo.setApellido("Alva");
		danilo.setCodigoSeguroSocial(25448);
		danilo.setEmpresaQueTrabaja("Banco del Pacifico");
		
		Pasajeros daniela = new Pasajeros();
		daniela.setNombre("Daniela");
		daniela.setApellido("Suarez");
		daniela.setCodigoSeguroSocial(35748);
		daniela.setEmpresaQueTrabaja("Produbanco");
		
		Pasajeros javier = new Pasajeros();
		javier.setNombre("Javier");
		javier.setApellido("Alvarez");
		javier.setCodigoSeguroSocial(28474);
		javier.setEmpresaQueTrabaja("Universidad Central");
		
		Pasajeros alex = new Pasajeros();
		alex.setNombre("Alex");
		alex.setApellido("Torres");
		alex.setCodigoSeguroSocial(85201);
		alex.setEmpresaQueTrabaja("Google");
		
		Pasajeros juan = new Pasajeros();
		juan.setNombre("Juan");
		juan.setApellido("Muñoz");
		juan.setCodigoSeguroSocial(85475);
		juan.setEmpresaQueTrabaja("Intel");
		
		Pasajeros cristina = new Pasajeros();
		cristina.setNombre("Cristina");
		cristina.setApellido("Espin");
		cristina.setCodigoSeguroSocial(96325);
		cristina.setEmpresaQueTrabaja("Huaweii");
		
		Pasajeros dylan = new Pasajeros();
		dylan.setNombre("Dylan");
		dylan.setApellido("Romero");
		dylan.setCodigoSeguroSocial(47854);
		dylan.setEmpresaQueTrabaja("Zapatos Venus");
		
		Pasajeros samuel = new Pasajeros();
		samuel.setNombre("Samuel");
		samuel.setApellido("Paucar");
		samuel.setCodigoSeguroSocial(74589);
		samuel.setEmpresaQueTrabaja("Microsoft");
		
		Pasajeros mateo = new Pasajeros();
		mateo.setNombre("Mateo");
		mateo.setApellido("Trujillo");
		mateo.setCodigoSeguroSocial(63258);
		mateo.setEmpresaQueTrabaja("Universidad Catolica");
		
		//adolescentes
		Pasajeros kenny = new Pasajeros();
		kenny.setNombre("Kenny");
		kenny.setApellido("Pazmiño");
		kenny.setDeporteQuePractica("Futbol");
		
		Pasajeros camila = new Pasajeros();
		camila.setNombre("Camila");
		camila.setApellido("Alvarez");
		camila.setDeporteQuePractica("Basquet");

		Pasajeros julian = new Pasajeros();
		julian.setNombre("Julian");
		julian.setApellido("Alvarado");
		julian.setDeporteQuePractica("Tennis");

		Pasajeros edison = new Pasajeros();
		edison.setNombre("Edison");
		edison.setApellido("Moran");
		edison.setDeporteQuePractica("Futbol");

		Pasajeros pablo = new Pasajeros();
		pablo.setNombre("Pablo");
		pablo.setApellido("Juares");
		pablo.setDeporteQuePractica("Tennis");

		Pasajeros kevin = new Pasajeros();
		kevin.setNombre("Kevin");
		kevin.setApellido("Gavilanes");
		kevin.setDeporteQuePractica("Basquet");

		Pasajeros cristian = new Pasajeros();
		cristian.setNombre("Cristian");
		cristian.setApellido("Alvarez");
		cristian.setDeporteQuePractica("Futbol");

		Pasajeros luis = new Pasajeros();
		luis.setNombre("Luis");
		luis.setApellido("Restrepo");
		luis.setDeporteQuePractica("Tennis");

		Pasajeros eduardo = new Pasajeros();
		eduardo.setNombre("Eduardo");
		eduardo.setApellido("Pozo");
		eduardo.setDeporteQuePractica("Tennis");
		
		Pasajeros uriel = new Pasajeros();
		uriel.setNombre("Uriel");
		uriel.setApellido("Morales");
		uriel.setDeporteQuePractica("Tennis");
		
		Pasajeros bus [][] = new Pasajeros [4][5];
		bus [0][0]=alejandro;
		bus [0][1]=danilo;
		bus [0][2]=daniela;
		bus [0][3]=javier;
		bus [0][4]=alex;
		bus [3][0]=juan;
		bus [3][1]=cristina;
		bus [3][2]=dylan;
		bus [3][3]=samuel;
		bus [3][4]=mateo;
		
		bus [1][0]=kenny;
		bus [1][1]=camila;
		bus [1][2]=julian;
		bus [1][3]=edison;
		bus [1][4]=pablo;
		bus [2][0]=kevin;
		bus [2][1]=cristian;
		bus [2][2]=luis;
		bus [2][3]=eduardo;
		bus [2][4]=uriel;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la fila del pasajero:");
		int fila = entrada.nextInt();
		System.out.println("Ingrese la columna del pasajero:");
		int columna = entrada.nextInt();
		System.out.println("Pasajero: " + bus[fila][columna]);
	}

}
