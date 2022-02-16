import controller.Controller;

/**
 * [Este es la clase principal , aquí arranca la aplicación, se le solicta al
 *  usuario que eliga una opción, seguido a esto se llama al controlar, el cual
 *  es el encargado de llamar a la clase controller]
 * 
 * @version [1.0.0 2022-02-14]
 *
 * @author [Italo Alberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 */
public class Main{
	
	private static Controller controller = new Controller();	

	public static void main(String[] args) {
		
		controller.run();
		
	}

}
