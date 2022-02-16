package exercise.exercise_6;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import views.Views;

/**
 * [Encargado de crear un objeto de tipo vector y guardar los datos ingresado en un documetno .txt en la raiz en la 
 *  dirección raiz de esta clase, esta clase se mantiene activa hasta que el usuario ingrese un valor entero ya 
 *  existente en el vector]
 * 
 * @param Views  [Mensajes predeterminados] 
 * 
 * @author       [Italo ALberto Guevara Villamil - alberto.villamil.1997@gmail.com]
 * 
 * @version      [1.0.0 2022-02-15]
 */
abstract public class CreateVector {
	
	private Views views;
	private Vector<Integer> newVector;	
	private Scanner sc;
	private File file;
	private FileWriter fw;
	private BufferedWriter out;
	private boolean activ;	

	private Random numRandom = new Random();	
	
	/**
	 * [Aquí se crea procede a poblar el vector hasta que el usuario repita un número, cuando se cumple esta condición,
	 *  el programa guarda el arreglo en un documento .txt en la misma dirección de esta clase, el documento tendra 
	 *  el nombre de 'src/exercise/exercise_6/new_file' + numeroRandom]
	 * 
	 * @throws [Arroja una excepción cuando el usuario ingresa un dato inválido,  muestra un mensaje de error y
	 *          seguido permite volver ingresar un dato nuevamente]
	 */
	public void createdVector(){
		
		sc = new Scanner(System.in);
		newVector = new Vector<Integer>();
		views = new Views();
		activ = false;		
		
		int number;	
		int numRamdon =  numRandom.nextInt((2000 + 1) + 1);
			
		do{
	
			views.line();
			System.out.println("\n\ncrear vector".toUpperCase());
			System.out.println("\nSi el número ingresado ya existe el programa te mostrara al lista y regresa al ménu principal".toUpperCase());	
			System.out.println("\ningresa un número= ");
			
			try {
				
				number = sc.nextInt();
				
				if(newVector.contains(number)) {
					
					views.line();
					System.out.print("\nEstos son los datos que contiene el vector\n\n");
					
					/**
					 * [Muestra el contenido del vector]
					 */
					for(Integer num: newVector) {
					
						System.out.println(num);
					}
					activ = false;	
					
				}else {
					
					newVector.add(number);
					activ = true;		
				}				
		
			} catch (Exception e) {
				
				views.optionInvalid();
				sc.next();
				activ = true;
			}
			
		}while(activ == true);
		

		/**
		 * [Aquí se guarda el vector de un documento `.txt`]	
		 * 
		 * @throws [cuando no es posible guardar o crear el documento]
		 */
		try {
			file = new File("src/exercise/exercise_6/new_file" + numRamdon  + ".txt");
			fw = new FileWriter(file);
			out = new BufferedWriter(fw);
			
			for(Integer num: newVector) {	
				out.write(num + ", ");
			}
			
			out.flush();
            out.close();
            
			Desktop fileExecute;
			fileExecute = Desktop.getDesktop();
			fileExecute.open(file);
			
		} catch (Exception e) {
			
			System.out.print("No fue posible crear el fichero");
		}		
		
	}

}
