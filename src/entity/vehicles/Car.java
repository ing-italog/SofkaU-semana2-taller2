package entity.vehicles;

/**
 * [Extiende de la clase Vehiculo, permite crear un carro]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-16]
 */
public class Car extends Vehicle {

	/**
	 * [Se sobre escribe el método acelerar]
	 */
	@Override
	public void speedUp() {
		
		System.out.print("El vehiculo esta acelerando");
		
	}
	
	/**
	 * [Se sobre escribe el método toString]
	 */
	@Override
	public String toString() {
		return "Carro // Id= " + getId() 
		     + " // capacidad pasajeros= " + getNumberPassanger()
			 + " // Fecha de matricula= " + getDateMatricule().getYear() 
			 + " // Número de ruedas= " + getNumberWheels()
			 + " // tipo de transporte= " + getTypeTransport()
			 + " // nombre= " + getName() 
			 + " // velocidad máxima(km/h)= " + getTopSpeed()
			 + " // capacidad de combustible(lt)= " + getCapacityFuel();
	}

}
