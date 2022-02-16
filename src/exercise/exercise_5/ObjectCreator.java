package exercise.exercise_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entity.vehicles.Bicicle;
import entity.vehicles.Boat;
import entity.vehicles.Car;
import entity.vehicles.Ferry;
import entity.vehicles.Motocycle;
import entity.vehicles.Truck;
import views.Views;

/**
 * [Controlar, este es el encargado de llamar a cada uno de los ejercicios]
 * 
 * @param bicicle      [Objecto de tipo bicicleta]
 * @param car          [Objecto de tipo carro]
 * @param truck        [Objecto de tipo camión]
 * @param boat         [Objecto de tipo lancha]
 * @param motorcicle   [Objecto de tipo motocicleta]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com○]
 * 
 * @version [1.0.0 2022-02-16]
 * 
 */
public class ObjectCreator {

	private Bicicle bicicle;
	private Car car;
	private Truck truck;
	private Boat boat;
	private Motocycle motorcicle;

	private boolean activ;
	protected Ferry ferry;
	private Date date;
	private String dateLikeText;
	private SimpleDateFormat sdf;
	private Scanner sc = new Scanner(System.in);

	private Views views = new Views();

	/**
	 * [Crear bicicleta]
	 * 
	 * @return Bicicle
	 */
	public Bicicle createBicicle() {
		
		activ = false;
		bicicle = new Bicicle();

		do {

			try {
				bicicle.setTypeTransport("terrestre");
				
				System.out.println("\nbicicleta".toUpperCase());
				
				System.out.println("Id= ");
				bicicle.setId(sc.nextInt());
				
				System.out.println("Nombre= ");
				bicicle.setName(sc.next());
				
				System.out.println("Capacidad de pasajeros= ");
				bicicle.setNumberPassanger(sc.nextInt());
				
				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);
				bicicle.setDateMatricule(date);
				
				activ = false;

			} catch (Exception e) {
				views.optionInvalid();
				sc.next();
				activ = true;
			}
			
		} while (activ == true);

		return bicicle;
	}

	/**
	 * [Crear carro]
	 * 
	 * @return Car
	 */
	public Car createCar() {
		
		activ = false;
		car = new Car();

		do {		

			try {

				car.setTypeTransport("terrestre");
				
				System.out.println("\nCarro".toUpperCase());
				
				System.out.println("Id= ");
				car.setId(sc.nextInt());
				
				System.out.println("Nombre= ");
				car.setName(sc.next());
				
				System.out.println("Capacidad de pasajeros= ");
				car.setNumberPassanger(sc.nextInt());
				
				System.out.println("Número de ruedas= ");
				car.setNumberWheels(sc.nextInt());
				
				System.out.println("velocidad máxima(km/h)= ");
				car.setTopSpeed(sc.nextDouble());
				
				System.out.println("Capacidad de combustible(lt)= ");
				car.setCapacityFuel(sc.nextDouble());
				
				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);
				car.setDateMatricule(date);
				
				activ = false;

			} catch (Exception e) {
				views.optionInvalid();
				sc.next();
				activ = true;				
			}
			
		} while (activ == true);

		return car;
	}

	/**
	 * [Crear camión]
	 * 
	 * @return Truck
	 */
	public Truck createTruck() {
		
		activ = false;
		truck = new Truck();

		do {
			
			try {
				truck.setTypeTransport("terrestre");
				
				System.out.println("\nCamion".toUpperCase());
				
				System.out.println("Id= ");
				truck.setId(sc.nextInt());
				
				System.out.println("Nombre= ");
				truck.setName(sc.next());
				
				System.out.println("Capacidad de pasajeros= ");
				truck.setNumberPassanger(sc.nextInt());
				
				System.out.println("Número de ruedas= ");
				truck.setNumberWheels(sc.nextInt());
				
				System.out.println("velocidad máxima(km/h)= ");
				truck.setTopSpeed(sc.nextDouble());
				
				System.out.println("Capacidad de combustible(lt)= ");
				truck.setCapacityFuel(sc.nextDouble());
				
				System.out.println("Capacidad de carga(kg)= ");
				truck.setMaximunLoad(sc.nextFloat());
				
				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);
				truck.setDateMatricule(date);
				
				activ = false;

			} catch (Exception e) {
				System.out.print(e);
				views.optionInvalid();
				sc.next();
				activ = true;
			}
			
		} while (activ == true);

		return truck;
	}

	
	/**
	 * [Crear lancha]
	 * 
	 * @return Boat
	 */
	public Boat createBoat() {
		
		activ = false;
		boat = new Boat();
		
		do {
			
			try {
				boat.setTypeTransport("acuatico");
				
				System.out.println("\nLancha".toUpperCase());
				
				System.out.println("Id= ");				
				boat.setId(sc.nextInt());
				
				System.out.println("Nombre= ");
				boat.setName(sc.next());
				
				System.out.println("Capacidad de pasajeros= ");
				boat.setNumberPassanger(sc.nextInt());
				
				System.out.println("velocidad máxima(millas nauticas)= ");
				boat.setTopSpeed(sc.nextDouble());
				
				System.out.println("Capacidad de combustible(lt)= ");
				boat.setCapacityFuel(sc.nextDouble());
				
				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);
				boat.setDateMatricule(date);
				
				activ = false;

			} catch (Exception e) {
				views.optionInvalid();
				sc.next();
				activ = true;
			}
			
		} while (activ == true);
		
		return boat;
	}

	/**
	 * [Crear motocicleta]
	 * 
	 * @return Motocycle
	 */
	public Motocycle createMotorcicle() {
		
		activ = false;
		motorcicle = new Motocycle();
		
		do {
			
			try {
				motorcicle.setTypeTransport("terrestre");
				
				System.out.println("\nMotocicleta".toUpperCase());
				
				System.out.println("Id= ");
				motorcicle.setId(sc.nextInt());
				
				System.out.println("Nombre= ");
				motorcicle.setName(sc.next());
				
				motorcicle.setNumberPassanger(2);
				
				System.out.println("velocidad máxima(km/h)= ");
				motorcicle.setTopSpeed(sc.nextDouble());
				
				System.out.println("Capacidad de combustible(lt)= ");
				motorcicle.setCapacityFuel(sc.nextDouble());
				
				System.out.println("\nFecha de matricula 'dd-MM-yyyy'= ");
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				
				dateLikeText = sc.next();
				date = sdf.parse(dateLikeText);
				motorcicle.setDateMatricule(date);
				
				activ = false;

				return motorcicle;

			} catch (Exception e) {
				views.optionInvalid();
				sc.next();
				activ = true;
			}
			
		} while (activ == true);
		
		return motorcicle;

	}

}
