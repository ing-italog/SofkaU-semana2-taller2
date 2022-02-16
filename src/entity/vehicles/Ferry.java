package entity.vehicles;

/**
 * [Extiende de la clase Vehiculo, permite crear un ferry]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-16]
 */
public class Ferry extends Vehicle {

	private int numberCrew;

	/**
	 * [Método para permitir subir pasajeros abordo del ferry]
	 */
	public void takePassager() {

		if (getMovi() == false) {
			
			System.out.println("\nPasajeros subiendo al FERRY");
			System.out.println("\nPasajeros a bordo");
			System.out.println("\nya estamos listos para sarpar!!".toUpperCase());
			
		}else {
			
			System.out.print("no es posible subir pasajeros ya que el ferry esta en movimiento".toUpperCase());
		}
	}

	/**
	 * [Se implementa el método acelerar proveniente de la clase Vehicle]
	 */
	@Override
	public void speedUp() {

		if (getMovi() == false) {
			
			System.out.print("el barco esta acelerando" + "\n El ferry ya se encuentra en movimiento".toUpperCase());
			setMovi(true);
			
		} else {
			
			System.out.print("no es posible acelerar".toUpperCase() + "El ferry ya se encuentra en movimiento");
		}

	}

	/**
	 * [Se sobre escribe el método toString con un mensaje personalizado]
	 */
	@Override
	public String toString() {
		return "ID= " + getId() 
		+ " // Nombre= " + getName() 
		+ " // Numero de pasajeros= " + getNumberPassanger()
		+ " // Fecha de matricula= " + getDateMatricule()
		+ " // Tipo de tranporte= " + getTypeTransport()
		+ " // Capacidad de tripulantes= " + numberCrew 
		+ " // Capacidad de combustible(lt)= " + getCapacityFuel();
	}

	/**
	 * [Getter & Setters○]
	 */
	public int getNumberCrew() {
		return numberCrew;
	}

	public void setNumberCrew(int numberCrew) {
		this.numberCrew = numberCrew;
	}
}
