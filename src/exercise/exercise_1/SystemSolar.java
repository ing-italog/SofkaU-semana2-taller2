package exercise.exercise_1;

import java.util.Scanner;

import entity.planet.Planet;
import views.Views;

/**
 * [Esta clase es la encargada de crear un sistema solar, con un número de
 *  planetas no mayor a 5, esta aplicación se mantiene activa hasta que el
 *  usuario deseé salir o volver al menú anterior]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 * 
 * @param Views                        [Mensajes predeterminados] 
 * @param CalculationForceGravitatory  [clase encargada de hacer los calculos]
 *
 * @version [1.0.0 2022-02-14]
 */
public class SystemSolar {

	private Views views;
	private CalculationForceGravitatory calculationForce;

	/**
	 * [Planetas por defecto]
	 */
	private Planet planet1 = new Planet(1, "Tierra", 59736, 12742, 10072000, (149 * 1000000));
	private Planet planet2 = new Planet(2, "Marte", 39335, 6794, 4798500, (float) (206.7 * 1000000));
	private Planet planet3 = new Planet(3, "Jupiter", 59736, 12742, 510072000, (500 * 1000000));
	private Planet planet4 = new Planet(4, "Saturno", 59736, 12742, 410072000, (7000 * 1000000));
	private Planet planet5 = new Planet(5, "Urano", 59736, 12742, 20072000, (8000 * 1000000));
	private Planet planet6 = new Planet(6, "Neptuno", 59736, 12742, 30072000, (11000 * 1000000));

	private Scanner sc = new Scanner(System.in);
	private boolean activ;
	private int selection;
	
	private Planet[] planets = { planet1, planet2, planet3, planet4, planet5, planet6 };

	/**
	 * [Método encargado de listar los planetas y le da la opción al usuario para
	 *  de elegir 2 planetas y calcular la masa gravitatoria entre ellos]
	 */
	public void createdSystemSolar() {
		
		Planet selecctionPlanet1;
		Planet selecctionPlanet2;

		calculationForce = new CalculationForceGravitatory();
		views = new Views();
		

		/**
		 * [Primero se verifica sí existe algún planeta previamente creado, si no existe
		 * ningún planeta se da la opción de crear los planetas, en caso de no existir
		 * ninguno se procede a mostrar las opciones disponibles]
		 * 
		 * @throws [Lanza una exception cuando el usuario ingresa un dato diferente de
		 *          un entero]
		 */
		do {
			
			selecctionPlanet1 = null;
			selecctionPlanet2 = null;

			views.advert();
			System.out.println("\nLos datos aquí mostrados no son fieles a la realidad");

			

			views.line();
			System.out.println("\nlista de planetas=".toUpperCase());
			for (Planet planet : planets) {

				System.out.println(
						"ID= " + planet.getId() + ".  " + "NOMBRE= " + planet.getName() + ",  " + "DIAMETRO (km)= "
								+ planet.getDiameter() + ",  " + "MASA (kg)= " + planet.getMass() + ",  " + "DENSIDAD= "
								+ planet.getDensity() + ",  " + "DISTANCIA AL SOL (km)= " + planet.getDistanceToSun());
			}

			try {

				System.out.print("\nPor favor elige el primer planeta= ");
				selection = sc.nextInt();

				while ((selection < 1) || (selection > 6)) {
					views.optionInvalid();
					selection = sc.nextInt();
				}

				selecctionPlanet1 = planets[selection - 1];

				System.out.print("\nPor favor elige el segundo planeta= ");
				selection = sc.nextInt();

				while ((selection < 1) || (selection > 6)) {
					views.optionInvalid();
					selection = sc.nextInt();
				}

				selecctionPlanet2 = planets[selection - 1];

				views.line();
				calculationForce.calculationForce(selecctionPlanet1, selecctionPlanet2);
				activ = false;

			} catch (Exception e) {

				views.optionInvalid();
				sc.next();
				activ = true;

			}
			
		} while (activ);

	}

}
