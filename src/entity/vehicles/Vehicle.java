package entity.vehicles;

import java.util.Date;

/**
 * [Esta clase funciona como molde de tipo vehiculo para extender a otras
 * clases]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 *
 * @version [1.0.0 2022-02-14]
 */
public abstract class Vehicle {

	private int id;
	private String name;
	private int numberPassanger;
	private Date dateMatricule;
	private int numberWheels;
	private String typeTransport;
	private double CapacityFuel;
	private boolean movi;
	private double topSpeed;

	/**
	 * [Método abstrato para acelerar el vehiculo]
	 */
	abstract public void speedUp();

	/**
	 * [Método para mostrar un mensaje que el vehiculo se encuentra en marcha]
	 */
	public void run() {
		if (!movi) {
			System.out.println("El vehiculo " + id + " se esta moviendo.");
			System.out.println("Esta en marcha...");
			movi = true;
		} else {
			System.out.println("el vehiculo ya esta en movimiento".toUpperCase());
		}
	}

	/**
	 * [Método para mostrar un mensaje que el vehiculo se encuentra detenido]
	 */
	public void stop() {
		if (movi) {
			System.out.println("El vehiculo " + id + " esta frenando");
			System.out.println("Totalmente estacioando..");
			movi = false;
		}else {
			System.out.println("el vehiculo ya esta estacionado".toUpperCase());
		}

	}

	/**
	 * [Contructor vacío]
	 */
	public Vehicle() {}

	/**
	 * [Contructor con todos los campos]
	 * 
	 * @param id              int
	 * @param name            String
	 * @param numberPassanger int
	 * @param dateMatricule   Date 
	 * @param numberWheels    int
	 * @param typeTranposrt   String
	 * @param capacityFuel    int
	 * @param movi            boolean
	 * @param topSpeed        int
	 */
	public Vehicle(int id, String name, int numberPassanger, Date dateMatricule, int numberWheels, String typeTransport,
			double capacityFuel, boolean movi, double topSpeed) {

		this.id = id;
		this.name = name;
		this.numberPassanger = numberPassanger;
		this.dateMatricule = dateMatricule;
		this.numberWheels = numberWheels;
		this.typeTransport = typeTransport;
		this.CapacityFuel = capacityFuel;
		this.movi = movi;
		this.topSpeed = topSpeed;
	}

	/**
	 * [Getter & Setters]
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberPassanger() {
		return numberPassanger;
	}

	public void setNumberPassanger(int numberPassanger) {
		this.numberPassanger = numberPassanger;
	}

	public Date getDateMatricule() {
		return dateMatricule;
	}

	public void setDateMatricule(Date dateMatricule) {
		this.dateMatricule = dateMatricule;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public String getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(String typeTransport) {
		this.typeTransport = typeTransport;
	}

	public double getCapacityFuel() {
		return CapacityFuel;
	}

	public void setCapacityFuel(double capacityFuel) {
		CapacityFuel = capacityFuel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getMovi() {
		return movi;
	}

	public void setMovi(boolean movi) {
		this.movi = movi;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

}
