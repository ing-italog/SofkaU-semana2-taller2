package entity.planet;

/**
 * [Clase Planet, conteien los atributos necesarios para crear un planeta]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com
 *
 * @version [1.0.0 2022-02-14]
 */
public class Planet {
	
	private int id;
	private String name;
	private float mass;
	private float density;
	private float diameter;
	private float distanceToSun;
	
	
	/**
	 * [Contructor vacío]
	 */
	public Planet() {}
	
	
	/**
	 * [Contructor con todos los campos]
	 * 
	 * @param id             Int
	 * @param name           String
	 * @param mass           Float
	 * @param density        Float 
	 * @param diameter       Float
	 * @param distanceToSun  Float
	 */
	public Planet(int id, String name, float mass, float density, float diameter, float distanceToSun) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.density = density;
		this.diameter = diameter;
		this.distanceToSun = distanceToSun;
	}
	
		
	/**
	 * [Sobre escritua del método toString, se usa para imprimir los atributos de esta clase]
	 */
	@Override
	public String toString() {
		return "\nPlanet "
				+ "\nid= " + id 
				+ "\nNombre= " + name 
				+ "\nMasa= " + mass 
				+ "\nDensidad= " + density
				+ "\nDiametro= " + diameter 
				+ "\nDistancia al sol= " + distanceToSun + "]";
	}


	/**
	 * [Getter & Setter]
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMass() {
		return mass;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}
	public float getDensity() {
		return density;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public float getDistanceToSun() {
		return distanceToSun;
	}
	public void setDistanceToSun(float distanceToSun) {
		this.distanceToSun = distanceToSun;
	}
	
	

}
