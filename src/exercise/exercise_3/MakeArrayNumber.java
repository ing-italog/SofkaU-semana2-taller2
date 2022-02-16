package exercise.exercise_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import views.Views;


/**
 * [Esta clase es la encargada de crear una lista de números aleatorios, también
 *  es la encargada de mostrar al usuario las opciones para listar el arreglo de números
 *  aleatorios]
 * 
 * @author [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com
 * 
 * @param Views  [Mensajes predeterminados] 
 *
 * @version [1.0.0 2022-02-14]
 */
public class MakeArrayNumber {

	private Views views;
	private ArrayList<Integer> listNumber;
	private Random random;
	private Scanner sc;
	private boolean activ;
	private int option;
	private int numRandom;

	/*
	 * [Aquí se le solicita al usuario que ingresa un número entre 1 y 100
	 * 
	 */
	public void makeListNumber() {
		
		views = new Views();
		random = new Random();
		sc = new Scanner(System.in);
		listNumber = new ArrayList<Integer>();

		/**
		 * [Aquí se verifica que no exista una lista, en caso de existe una lista,
		 *  se le muestra al usuario las opciones que tiene la lista]
		 *  
		 * @throws [Lanza una exception cuando el usuario ingresa un dato diferente de
	     *          un entero,  esta clase se mantiene activo si el usuario ingresa un 
	     *          dato inválido]
		 */
		if (listNumber.isEmpty()) {

			activ = false;

			int option = 0;

			do {

				views.line();
				System.out.println("\ncrear lista con números aleatorio".toUpperCase());
				System.out.println("\nPor favor ingresa un número entre 1 y 100" + "\n Aquí= ");

				try {
					option = sc.nextInt();
					activ = false;
				} catch (Exception e) {
					activ = true;
					views.optionInvalid();
					sc.next();
				}

				if ((option >= 0) && (option <= 100)) {

					/**
					 * [Crea un número aleatorio entre 0 y la opción que eliga el usuario]
					 * 
					 * @param option int
					 * @return numRandom int
					 */
					for (int i = 0; i < option; i++) {

						numRandom = random.nextInt(option + 1) + 1;
						listNumber.add(numRandom);
					}

				} else {
					activ = true;
					views.optionInvalid();
				}

			} while (activ);

			optionList();
			
		}else {
			optionList();
		}

	}

	/**
	 * [Este es el método encargado de solicitar al usuario como desea ver la lista
	 *  de los números aleatorios y mostrar los datos acorde a la solicitud del usuario]
	 * 
	 *  @throws [Lanza una exception cuando el usuario ingresa un dato diferente de
	 *           un entero, esta clase se mantiene activo si el usuario ingresa un dato inválido]
	 * 
	 */
	private void optionList() {

		views.line();
		System.out.print("\nEsta es tu lista de número");
		System.out.print(listNumber);
		System.out.print("\n\nQue deseas hacer?");
		views.listRandomOption();

		do {
			activ = false;

			try {
				option = sc.nextInt();
				activ = false;
			} catch (Exception e) {
				activ = true;
				views.optionInvalid();
				sc.next();
			}

			switch (option) {

			case 1:

				System.out.println("\nListado de menor a Mayor");
				Collections.sort(listNumber);
				for (Integer number : listNumber) {
					System.out.print(number + " | ");
				}
				activ = false;
				break;

			case 2:

				System.out.println("\nListado de Mayor a menor");
				Collections.sort(listNumber, Collections.reverseOrder());
				for (Integer number : listNumber) {
					System.out.print(number + " | ");
				}
				activ = false;
				break;

			case 3:
				
				activ = false;
				break;

			case 4:
				views.outSystem();
				System.exit(0);
				break;

			default:

				views.optionInvalid();
				activ = true;
				break;
			}

		} while (activ);

	}

}
