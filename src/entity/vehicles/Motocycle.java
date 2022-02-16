package entity.vehicles;

/**
 * [Extiende de la clase Vehiculo, permite crear una motocicleta]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-16]
 */
public class Motocycle extends Vehicle{

	@Override
	public void speedUp() {
		
	}
	
	/**
	 * [Se sobre escribe el método toString]
	 */
	@Override
	public String toString() {
		return "Carro // Id= " + getId() 
		     + " // capacidad pasajeros= " + getNumberPassanger()
			 + " // Año de matricula= " + getDateMatricule().getYear() 
			 + " // Número de ruedas= " + getNumberWheels()
			 + " // tipo de transporte= " + getTypeTransport()
			 + " // nombre= " + getName() 
			 + " // velocidad máxima(km/h)= " + getTopSpeed()
			 + " // capacidad de combustible(lt)= " + getCapacityFuel();
	}

}
