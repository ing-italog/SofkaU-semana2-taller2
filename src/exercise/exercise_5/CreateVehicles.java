package exercise.exercise_5;

import java.util.ArrayList;
import java.util.Scanner;

import entity.vehicles.Vehicle;
import views.Views;

/**
 * [Esta clase es la encargada de crear diez tipos de vehiculos para
 *  posteriormente listar los vihiculos cada uno con sus datos]
 * 
 * @param views     [instancia la clase que contiene los mensajes
 *                  predetermiandos]
 * @param Bicicle   [objeto de tipo bicicleta]
 * @param Car       [objeto de tipo Carro]
 * @param Truck     [objeto de tipo camión]
 * @param Boat      [objeto de tipo bote]
 * @param Motocycle [objeto de tipo moto]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-15]
 */
public class CreateVehicles {

	private Views views;
	private ObjectCreator creadotrVehicles;
	private ArrayList<Vehicle> listVehicles;
	private Scanner sc;

	/**
	 * [Se le solicita aun usuario que ingresa la opción que tipo de vehiculo deseas
	 *  crear, sigo a esto se invocada el método encargado de crear los vehiculos y
	 *  nuevamente se le muestra al usuario el menú de opciones]
	 * 
	 * @throws[Arroja una excepción cuando el usuario ingresa un valor diferente a
	 *         un entero]
	 * 
	 */
	public void created() {

		listVehicles = new ArrayList<Vehicle>();
		creadotrVehicles = new ObjectCreator();
		sc = new Scanner(System.in);
		views = new Views();

		boolean activ = true;

		while ((activ == true) && (listVehicles.size() < 10)) {
			
			int option = 0;
			
			views.advert();
			views.line();
			views.optionVehicle();

			try {
				option = sc.nextInt();
			} catch (Exception e) {				
				views.optionInvalid();
				sc.nextInt();
			}

			switch (option) {
			/**
			 * [Crea un vehiculo tipo bicicleta]
			 */
			case 1:	 
				listVehicles.add(creadotrVehicles.createBicicle());
				break;
				
			/**
			 * [Crea un vehiculo tipo carro]
			 */
			case 2:
				listVehicles.add(creadotrVehicles.createCar());
				break;
				
			/**
			 * [Crea un vehiculo tipo camión]
			 */
			case 3:
				listVehicles.add(creadotrVehicles.createTruck());
				break;
				
			/**
			 * [Crea un vehiculo tipo bote]
			 */
			case 4:
				listVehicles.add(creadotrVehicles.createBoat());
				break;
				
			/**
			 * [Crea un vehiculo tipo motocicleta]
			 */
			case 5:
				listVehicles.add(creadotrVehicles.createMotorcicle());
				break;
				
			/**
			 * [Lista los vehiculos con sus tributos]
			 */
			case 6:
				if (listVehicles.size() != 0) {
					for (Object vehicle : listVehicles) {
						System.out.println(vehicle);
					}
					
					
				} else {
					views.line();
					System.out.println("\nla lista esta vacía".toUpperCase());
				}
				activ = true;
				break;

			/**
			 * [Lista los vehiculos con sus tributos y sale de esta sección]
			 */
			case 7:
				if (listVehicles.size() != 0) {
					for (Object vehicle : listVehicles) {
						System.out.println(vehicle);
					}
					
				} else {
					views.line();
					System.out.println("\nla lista esta vacía".toUpperCase());
				}

				activ = false;
				break;

			case 9:
				views.outSystem();
				System.exit(0);
				break;

			default:
				views.optionInvalid();
				break;
			}

		}
	}
}
