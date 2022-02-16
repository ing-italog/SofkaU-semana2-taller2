package exercise.exercise_1;

import entity.planet.Planet;

/**
 * [Esta clase es la encargada de crear un sistema solar, con un número de
 *  planetas no mayor a 5, esta aplicación se mantiene activa hasta que el
 *  usuario deseé salir o volver al menú anterior]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-14]
 */
public class CalculationForceGravitatory {
	
	private float force;
	private float g; 
	
	protected void calculationForce(Planet planet1, Planet planet2) {
		
		g = (float) 6.67;

		force = (float) ((g * Math.pow(10, -11)) 
				 * ( (planet1.getMass() * planet2.getMass() )
				/ (planet1.getDistanceToSun() - planet2.getDistanceToSun() ) )
                );
		System.out.println("\nSeleccionaste= " + planet1.getName()  + " y "+ planet2.getName());
		System.out.println("\nLa fuerza es: ".toUpperCase() + force);
		
	}

}
