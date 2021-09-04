package prueba.uno;
import java.util.Scanner;

public class MainReservaBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese informacion de pasajero");
		System.out.println("Ingrese nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = entrada.nextLine();
		System.out.println("Ingrese edad: ");
		int edad = entrada.nextInt();
		System.out.println("Que tipo de pasajero es: "
				+ "ingrese 1 si es Vip"
				+ "Ingrese 2 si es economico");
		int opcion =entrada.nextInt();
		
		String membresia="";
		String descuento="";
		
		if(opcion==1) {
			System.out.println("Ingrese Codigo de Membresia: ");
			membresia = entrada.nextLine();
		} else {
			System.out.println("Ingrese Codigo Descuento: ");
			descuento = entrada.nextLine();
		}
		
		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre("Edison");
		pasajero1.setApellido("Cayambe");
		pasajero1.setCodigoMembresia("123weqwe");
		pasajero1.setEdad(25);
		
		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		
		Pasajero [][] asientos = new Pasajero[4][5];
		asientos [0][0] = pasajero1;
		asientos [0][1] = pasajeroEconomico1;
		
		int opcionSalir = 1;
		do {
		System.out.println("Ingrese la fila del pasajero o si quiere salir ingrese 1");
		int fila = entrada.nextInt();
		System.out.println("Ingrese la columna del pasajero:");
		int columna = entrada.nextInt();
		System.out.println("Pasajero: " + asientos[fila][columna]);
		}while(opcionSalir != 1);
		
	}

}
