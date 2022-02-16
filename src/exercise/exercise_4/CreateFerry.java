package exercise.exercise_4;

import java.util.ArrayList;
import java.util.Scanner;

import entity.vehicles.Ferry;
import views.Views;

/**
 * [Es la encargada de llamar a la clase ObjectCreator y mostrar al usuario las opciones disponibles
 *  para crear ferrys y listar los objetos]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com
 *
 * @version [1.0.0 2022-02-15]
 * 
 * @param Views         [Mensajes predeterminados]
 * @param FerryMethods  [Objeto para crear ferrys]
 * @param Ferry         [Objeto de tipo ferry]
 * @param listFerrys    [Lista de ferrys]
 */
public class CreateFerry {

	private Views views;
	private ObjectCreator methods;	
	private Ferry ferry;
	private ArrayList<Ferry> listFerrys;
	
	private Scanner sc;

	/**
	 * [Se le solicita al usuario que ingrese los datos que tendra cada ferry, en
	 *  caso de existir ferry ya creado, se procede a mostrar la lista de ferry]
	 * 
	 * @throws [Lanza una excepción cuando el usuario ingresa un dato inválido, con
	 *          lo que se le solicita que ingrese un valor valído]
	 */
	public void createFerry() {

		views = new Views();
		methods = new ObjectCreator();
		ferry = new Ferry();
		listFerrys = new ArrayList<Ferry>();
		sc = new Scanner(System.in);
		
		boolean activ;
		int option = 0;

		activ = true;

		/**
		 * [Iniciar a solicar los datos de cada ferry, se mantiene actva esta opción mientras
		 *  la lista no sea mayor a 10 items y la variable `activ` sea true]
		 */
		while ((activ == true) && (listFerrys.size() < 10)) {

			views.messageSelection();
			ferry = methods.created();
			listFerrys.add(ferry);
			
			try {
				views.optionfERRY();
				option = sc.nextInt();
				
			} catch (Exception e) {				
				views.optionInvalid();
				sc.next();
			}

			switch (option) {
			case 1:

				activ = true;
				break;

			case 2:
				
				listFerry();
				activ = true;
				break;

			case 3:

				listFerry();
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

	/**
	 * [Imprime lo datos de cada ferry]
	 */
	private void listFerry() {
		
		views.line();
		System.out.println("\nlista de ferrys".toUpperCase());
		for (Ferry ferry : listFerrys) {

			System.out.println("\n" + ferry);
		}
	}

}
