package entity.vehicles;

/**
 * [Extiende de la clase Vehiculo, permite crear una lancha]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-16]
 */
public class Boat extends Vehicle{

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
	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "Carro // Id= " + getId() 
		     + " // capacidad pasajeros= " + getNumberPassanger()
			 + " // Año de matricula= " + getDateMatricule().getYear()
			 + " // tipo de transporte= " + getTypeTransport()
			 + " // nombre= " + getName() 
			 + " // velocidad máxima(millas nauticas)= " + getTopSpeed()
			 + " // capacidad de combustible(lt)= " + getCapacityFuel();
	}


}
