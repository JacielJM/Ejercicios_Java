import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Colecciones {

	public static void main(String[] args) {
		/*
		 * Estructuras de datos
		 * 
		 * 
		 * Son un sistema mediante el cual se organizan los datos en la memoria de nuestra aplicacion que estamos desarrollando. Tenemos muchas formas de organizar esta informacion, como:
		 * 
		 * 
		 * - Arrays (datos primitivos)
		 * 
		 * - Colecciones (clases)
		 *		- Listas (list)
		 *		- Conjuntos (Set/HashSet)
		 *		- Mapas (Map/HashMap)
		 * 
		 * 
		 * 
		 * Los arreglos normales son para un solo tipo de dato, ordenados por indice y tienen un tamanio definido.  
		 * 
		 * Arreglos
		 * 
		 * Son las estructuras de datos mas comunes, y nos sirven para almacenar un solo tipo de dato y generalmente el ordenamiento se da por indices. En JAVA no usamos la palabra reservada new Array, ya que simplemente utilizamos las llaves y declaramos el tipo de dato que contiene. En JAVA tenemos el inconveniente de que los valores que se declaran al principio ya no se pueden modificar (no resizable).
		 * 
		 * 
		 *
		 */
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo"};
		int[] calificaciones = {1, 5, 8};
		
		System.out.println(meses.length);
		System.out.println(calificaciones.length);
		
		//int[] numerosdel1al100 = new int[100];
		
		for (String m:meses) {
			System.out.println(m);
		}
		
		/*
		 * Colecciones
		 * 
		 * 
		 * Listas (list)
		 * 
		 * 
		 * La interfaz List define una sucesion de elementos. A diferencia de la interfaz Set, esta si admite elementos duplicados. Podemos hacer distintas cosas con las listas como:
		 * 
		 * - Manipular elementos en funcion de su posicion dentro de esta lista
		 * - Buscar elementos concretos de la lista y devolver su posicion
		 * - Iterar o hacer ciclos sobre esos elementos
		 * - Realizar operaciones sobre rangos de elementos de la misma lista
		 *
* ArrayList
		 * 
		 * 
		 * 
		 * Implementacion mas utilizada dentro de la coleccion List. Se basa en un array redimensionable, esto es que va aumentando de tamanio dependiendo de la situacion. Es el que mayor rendimiento tiene dentro de las listas (linkedlist).
		 
		 * 
		 * Caracteristicas del ArrayList: 
	 *	- Siempre va indexado
	 *	- Si le agregamos un elemento, solo se agrega al final
	 *	- Podemos almacenar elementos repetidos
	 *	- Tienen un orden conforme los vamos agregando
	 *
		 */
		ArrayList<String> cars = new ArrayList<String>();
		// añadir items
		cars.add("Honda");
		cars.add("Porsche");
		cars.add("Mazda");
		
		System.out.println("add"+cars);
		
		//modificar items
		cars.set(0, "Ford");
		
		System.out.println("set"+cars);
		
		//eliminar items
		cars.remove(0);
		
		System.out.println("remove"+cars);
		
		System.out.println("get "+cars.get(0));
		System.out.println("size "+cars.size());
		
		cars.clear();
		System.out.println("empty cars "+cars);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu comida favorita");
		String comida = sc.nextLine();
		
		ArrayList<String> comidaFavorita = new ArrayList<String>();
		comidaFavorita.add(comida);
		
		System.out.println("Mi comida favorita es "+comidaFavorita);
		sc.close();
		
		//Vamos a crear un menu para preguntarle al usuario su comida favorita
		
				//1. Pedirle su comida favorita (.add)
				//2. Preguntarle si quiere agregar mas comidas favoritas (condicional que dispare un .add)
				//3. Darle la opcion de modificar alguna comida (.set)
				//4. Darle la opcin de borrar cualquier comida que haya ingresado (.clear o .remove)
				
				//CRUD
				
				//Create
				//Read
				//Update
				//Delete
		/*
		Scanner ns = new Scanner(System.in);
		System.out.println("Lista de comidas favoritas");
		String comidas;
		
		int opcion = 0;
		
		ArrayList<String> listaComidas = new ArrayList<String>();
		
		while(opcion != 0) {
			System.out.println("Elige una opcion");
			System.out.println("1 para añadir otra comida");
			System.out.println("2 para modificar las comidas ingresadas");
			System.out.println("3 para borrar alguna comida ingresada");
			System.out.println("0 para salir");
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la nueva comida");
				comidas=sc.nextLine();
				listaComidas.add(comidas);
				System.out.println("Tu lista es "+listaComidas);
				break;
			case 2:
				System.out.println("Ingrese el numero de comida a modificar");
				int i = ns.nextInt()-1;
				System.out.println("Ingrese la nueva comida de la posicion "+i);
				comidas = sc.nextLine();
				listaComidas.set(i, comidas);
				break;
			case 3:
				System.out.println("Ingrese el numero de comida a borrar");
				i = ns.nextInt()-1;
				
				if(i!=0 ) {
				//System.out.println("Se ha borrado "+listaComidas.get(i));
				listaComidas.remove(i);
				} else {
				listaComidas.clear();
				}
				System.out.println(listaComidas);
				break;
			default:
				System.out.println(opcion +" no es una opción válida");
			}
		}*/
		
		
		/*
		 * Set (conjuntos)
		 * 
		 * Define una coleccion que no puede tener elementos duplicados. Dentro de esta interfaz existen distintas implementaciones, una de ellas es HashSet. Sirve para almacenar datos en una tabla hash. Es la implementacion que mejor rendimiento de todas da, pero no garantiza el orden al momento de hacer iteraciones. Debemos definir el tamanio inicial de la tabla porque el tamanio marcara el rendimiento de esta implementacion.
		 * 
		 * * Map (mapas)
	 *
	 *La interfaz Map asocia claves a valores, y no puede contener claves duplicadas, y cada una de esas claves solo puede tener asociado un valor como maximo. Dentro de los map, existe la implementacion llamada HashMap, la cual almacena las claves en una tabla hash. Es la implementacion que mejor rendimiento tiene de todas, y es imporante definir el tamanio inicial de la tabla ya que este tamanio define el rendimiento de la implementacion.

 */
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);	
	    
	 // ArrayList
	 			System.out.println("ARRAYLIST");
	 			ArrayList<String> participantes = new ArrayList<String>(); 
	 			participantes.add("Felipe");
	 			participantes.add("Jaciel");
	 			participantes.add("Edwin");
	 			participantes.add("Gabriel");
	 			participantes.add("Fernando");
	 			participantes.add("Fernando");
	 			System.out.println(participantes);
	 			
	 			
	 			System.out.println("HASHSET");
	 			//HashSet (metodo para comprobar si existe un elemento o no)
	 			HashSet<String> participantes2 = new HashSet<String>();
	 			participantes2.add("Felipe");
	 			participantes2.add("Jaciel");
	 			participantes2.add("Edwin");
	 			participantes2.add("Gabriel");
	 			participantes2.add("Fernando");
	 			System.out.println(participantes2);
	 			
	 		    
	 		    System.out.println("HASHMAP");
	 			//HashMap
	 		    HashMap<String, Integer> calificaciones1 = new HashMap<String, Integer>();
	 		    //metodo put para agregar informacion
	 		    calificaciones1.put("Felipe", 5);
	 		    calificaciones1.put("Jaciel", 10);
	 		    calificaciones1.put("Edwin", 10);
	 		    calificaciones1.put("Gabriel", 9);
	 		    calificaciones1.put("Fernando1", 9);
	 		    calificaciones1.put("Fernando2", 7);
	 		    calificaciones1.put("Fernando3", 0);
	 		    System.out.println(calificaciones1);
	 		    
	 		   for(String i: calificaciones1.keySet()) {
	 		    	System.out.println(i);
	 		    	System.out.println(calificaciones1.get(i).hashCode());
	 		    }
	 		   System.out.println("************************************");
	 		    for(Integer i: calificaciones1.values()) {
	 		    	System.out.println(i);
	 		    }
	 		    
	 		    
	} // cierre de main

} // cierre de clase
