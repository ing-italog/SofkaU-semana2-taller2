package controller;

import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;

import exercise.exercise_1.SystemSolar;
import exercise.exercise_3.MakeArrayNumber;
import exercise.exercise_4.CreateFerry;
import exercise.exercise_5.CreateVehicles;
import exercise.exercise_6.CreateVector;
import views.Views;

/**
 * [Controlar, este es el encargado de llamar a cada uno de los ejercicios]
 * 
 * @param Views                [Mensajes predeterminados]
 * @param SystemSolar          [Clase encargada de crear el sistema solar]
 * @param fileExecuteExercise2 [Este objeto permite ejecutar el documento
 *                             alojado en la subcarpeta exercise_2]
 * @param MakeArrayNumber      [Objeto para hacer lista con npumeros aleatorios]
 * @param CreateFerry          [Permite crear ferrys y listar los ferrys]
 * @param CreateVehicles       [Objeto para crear distingos vehiculos]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com○]
 * 
 * @version [1.0.0 2022-02-15]
 */
public class Controller extends CreateVector {

	private Views views;
	private SystemSolar exercise1;
	private Desktop fileExecuteExercise2;
	private MakeArrayNumber exercise3;
	private CreateFerry exercise4;
	private CreateVehicles exercise5;

	private Scanner sc;
	private File file;
	private boolean activ;
	private int option;

	/**
	 * [1. Aquí se ejecuta inicaliza la aplicación y se mantiene en funcinamiento
	 * mientras la variable activ sea `true`]
	 * 
	 * @param option Int
	 * 
	 * @throws [Lanza una exception cuando el usuario ingresa un dato diferente de
	 *                un entero]
	 */
	public void run() {

		views = new Views();
		sc = new Scanner(System.in);

		do {

			activ = true;

			views.line();
			views.welcome();

			try {
				option = sc.nextInt();
			} catch (Exception e) {
				views.optionInvalid();
				sc.next();
			}

			switch (option) {

			/**
			 * [Muestra las opciones para calcular la fuerza gravitaria entre dos planetas]
			 */
			case 1:
				exercise1 = new SystemSolar();
				exercise1.createdSystemSolar();
				break;
			/**
			 * [Abre el fichero .TXT en la carpeta excerise_2]
			 *
			 * @param fichero Fichero a abrir
			 */
			case 2:
				try {

					file = new File("src/exercise/exercise_2/response_exercise_2.txt");
					fileExecuteExercise2 = Desktop.getDesktop();
					fileExecuteExercise2.open(file);

				} catch (Exception ex) {
					views.line();
					System.out.println("No fue posible abrir el documento".toUpperCase());
				}
				break;

			/**
			 * [Llama la clase encargada de crear el arreglo de números aleatorios]
			 */
			case 3:
				exercise3 = new MakeArrayNumber();
				views.line();
				exercise3.makeListNumber();
				break;

			/**
			 * [LLama la clase creadora de ferrys]
			 */
			case 4:
				exercise4 = new CreateFerry();
				views.line();
				exercise4.createFerry();
				break;

			/**
			 * [LLama la clase creadora de vehiculos]
			 */
			case 5:

				exercise5 = new CreateVehicles();
				views.line();
				exercise5.created();
				break;

			/**
			 * [Se instancia el método de la clase abstracta CreateVector sin necesidad de
			 * hererar sus atributos]
			 */
			case 6:

				createdVector();
				break;

			/**
			 * [Finaliza la ejecución de la aplicación]
			 */
			case 9:

				views.outSystem();
				break;

			default:

				views.optionInvalid();
				break;
			}
			
		} while (activ == true);

	}

}
