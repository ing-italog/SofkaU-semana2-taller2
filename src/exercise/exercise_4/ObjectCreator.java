package exercise.exercise_4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entity.vehicles.Ferry;
import views.Views;

/**
 * [Esta clase de crear un objeto de tipo ferry, solicitando al usuario los datos 
 *  necesarios para crear este tipo de vehiculo, esta aplicación se mantiene activa mientras
 *  la variable `activ` sea null]
 * 
 * @version [1.0.0 2022-02-15]
 * 
 * @author [Italo Alberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 */
public class ObjectCreator {

	private boolean activ;
	protected Ferry ferry;
	private Scanner sc;
	private Views views;
	private Date date;
	
	private String dateLikeText;
	private SimpleDateFormat sdf;

	/**
	 * [Método para crear ferriz, este método solicita al usuario los datos que debe
	 *  tener el ferry, el método no finaliza hasta haber ingresado los datos
	 *  completos del ferry]
	 * 
	 * @throws [Aroja una excepción cuando el usuario ingresa un dato inválido, si el usuario ingresa
	 *          un dato incorrecto, debe volver a ingresar todos los datos]
	 */
	protected Ferry created() {

		views = new Views();
		ferry = new Ferry();
		sc = new Scanner(System.in);
		date = new Date();

		do {
			
			views.line();
			System.out.println("\nEn caso de poner datos inválidos debes volver a llenar los datos de este ferry".toUpperCase());
			System.out.println("\nIngrese los datos del ferry".toUpperCase());

			try {
				
				System.out.print("\nId= ");
				ferry.setId(sc.nextInt());
				
				System.out.print("\nNombre= ");
				ferry.setName(sc.next());

				System.out.println("\nCapacidad de pasajeros= ");
				ferry.setNumberPassanger(sc.nextInt());

				System.out.println("\nCapacide de tripulantes= ");
				ferry.setNumberCrew(sc.nextInt());

				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf= new SimpleDateFormat("dd-MM-yyyy");
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);				
				ferry.setDateMatricule(date);

				System.out.println("\nCapacidad de combustible (lt)= ");
				ferry.setCapacityFuel(sc.nextInt());
				
				ferry.setTypeTransport("Maritimo");
				
				System.out.println("\nVelocidad máxima (km/h)= ");
				ferry.setTopSpeed(sc.nextInt());				
				
				activ = false;

			} catch (Exception e) {

				views.optionInvalid();
				sc.next();
				activ = true;
				

			}
			
		} while (activ == true);

		return ferry;
	}

}
