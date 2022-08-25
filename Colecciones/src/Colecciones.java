import java.util.ArrayList;
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
		
		int[] numerosdel1al100 = new int[100];
		
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
		}
		
		
		/*
		 * Set (conjuntos)
		 * 
		 * Define una coleccion que no puede tener elementos duplicados. Dentro de esta interfaz existen distintas implementaciones, una de ellas es HashSet. Sirve para almacenar datos en una tabla hash. Es la implementacion que mejor rendimiento de todas da, pero no garantiza el orden al momento de hacer iteraciones. Debemos definir el tamanio inicial de la tabla porque el tamanio marcara el rendimiento de esta implementacion.
 */
		

	} // cierre de main

} // cierre de clase
