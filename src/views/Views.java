package views;


/**
* [Esta es una clase que va a contener los mensajes o ventanas que podemos reutilizar
* 
*   ej.:
*   
*   Windows message = new Windows();
*   message.welcome();
* ]
*
* @version [1.0.0 2022-02-14]
*
* @author [Italo Alberto Guevara Villamil - alberto.villamil.1997@gmail.com]
*
*/
public class Views {
	
	/**
	 * [Este es el primer mensaje de bienvenidas que se muestra cuando el usuario inicia 
	 *  la aplicación]
	 */
	public void welcome() {
		
		System.out.print("\n\nMenú principal.".toUpperCase()
				+ "\n\nPor favor elije una opción"
				+ "\n\n1. Ver ejercicio # 1  -- Calcular la fuerza gravitacional entre dos planetas de la vía lactea"
				+ "\n2. Ver ejercicio # 2  -- Se abrira un documento .txt"
				+ "\n3. Ver ejercicio # 3  -- Crear una lista de números aleatorios"
				+ "\n4. Ver ejercicio # 4  -- Crear ferrys"
				+ "\n5. Ver ejercicio # 5  -- Crear vehiculos"
				+ "\n6. Ver ejercicio # 6  -- Crear un Vector - al finalizar abrir el fichero guardado"
				+ "\n9. SALIR"
				+ "\n\n Marca aquí");
	}
	
	
	/**
	 * [Opciones para listar el arreglo de números aleatorios]
	 */
	public void listRandomOption() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPor favor elige una opción"
				+ "\n1. Listar de menor a Mayor"
				+ "\n2. Listar de Mayor a mayor"
				+ "\n3. Volver al menú principal"
				+ "\n4. Salir".toUpperCase());
		
	}
	
	/**
	 * [Opciones para usar en la clase CreateFerry]
	 */
	public void optionfERRY() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPor favor elige una opción"
				+ "\n1. Crear otro ferry"
				+ "\n2. Listar los Ferrys y Crear otro ferry"
				+ "\n3. Volver al menú anterior"
				+ "\n9. Salir".toUpperCase());
	}
	
	
	/**
	 * [opciones para usar un vehiculo]
	 */
	public void optionVehicle() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPor favor elige una opción"
				+ "\n1. Crear bicicleta"
				+ "\n2. Crear Car"
				+ "\n3. Crear Camión"
				+ "\n4. Crear Bote"
				+ "\n5. Crear Motocicleta"
				+ "\n6. Lista los vehiculos"
				+ "\n7. Volver al menú principal"
				+ "\n9. Salir".toUpperCase());
	}
	

	
	/**
	 * [Mensaje predeterminado para elegir una opción]
	 */
	public void messageSelection() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPor favor elige una opción"
				+ "");
	}
	
	/**
	 * [Mensaje de advertencia para el usuario]
	 */
	public void advert() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nen caso de poner datos invalidos el programa te hara volver a inicio del menú".toUpperCase());
	}
	
	/**
	 * [Este método arroja un mensaje cuando el usuario ingresa un requerimiento invalido]
	 */
	public void optionInvalid() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nerror!, opción invalida.".toUpperCase()
				+ "\nPor favor ingrese nuevamente una opción");
	}
	
	/**
	 * [Mensaje que se muestra al finalizar el programa]
	 */
	public void outSystem() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPrograma Finalizado...");
	}
	
	/**
	 * [Muestra unicameente un separador de texto entre filas (una linea recta)]
	 */
	public void line() {
		System.out.print("\n------------------------------------------------------");
	}

}
