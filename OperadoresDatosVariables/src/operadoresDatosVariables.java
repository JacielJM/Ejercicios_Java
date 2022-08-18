
public class operadoresDatosVariables {

	public static void main(String[] args) {
		// TODO lo que necesitemos que se ejecute, lo ponemos dentro del main
		/*
		 * Tipos de datos
		 * 
		 * - Grupo de datos primitivos
		 * 		- byte: 1 byte (-128 al 127)
		 * 		- short: 2 bytes (-32,768 al 32,767)
		 * 		- int: 4 bytes (-2,147,483,648 al 2,147,483,647)
		 * 		- long:  8byte (-9,223,372,036,854,775,808 al 9,223,372,036,854,775,807
		 * 		- float: Almacena números fraccionarios de 4 bytes (6 o 7 decimales)
		 * 		- double: Almacena números fraccionarios 8 bytes (15 decimales)
		 * 		- boolean: 1 bit y almacena datos true o false
		 * 		- char: 2 bytes almacena caracteres o letras en formato ASCII
		 * 
		 * - Grupo de datos no primitivos
		 */
		
		// Numeros
		byte edadHumano = 25;
		short edadTortuga = 150;
		int edadTierra = 4543000;
		long edadUniverso = 876543456099456728l;
		float PI = 3.1416f;
		double PI_GRANDE = 3.14159265359d;
		
		boolean hambre = false;
		boolean programador = true;
		
		char inicialNombre = 'J';
		String nombre = "Jaciel";
		
		/*Variables en Java
		 * 
		 * Las variables son contenedeores que nos permiten almacenar valores de datos o informacion (vaso de agua, vaso de leche, vaso de refresco, etc.).
		 * 
		 * 
		 * - String: Almacena texto en forma de cadena, y se usan las comillas dobles
		 * - int: Almacena datos enteros
		 * - float: Almacena datos de tipo coma flotante
		 * - char : Almacena caracteres individuales como A, 1 y se usan las comillas simples.
		 * - booleanos: Almacenan valores con dos estados: true o false
		*/
		
		String nombre2 = "Jaciel";
		int numeroDomicilio = 1;
		float estatura = 1.75f;
		char grupo = 'C';
		boolean descanso = false;
		float areaTriangulo = 50.0f;
		
		
		// Declaración vs Inicialización
		
		String declaracion; // declaración
		
		declaracion = "Hola soy Jaciel"; // inicialización

		final int anios; //final declara una variable como constante
		
		anios = 25; 
		// anios = 30; esta linea devuelve un error
		
		// println imprime con saltos de linea
		// print imprime todo de corrido
		
		System.out.println(declaracion);
		System.out.println("Nos vamos a descansito? " + descanso);
		System.out.println(anios);
		System.out.println((5+60));
		System.out.println();
		
		//Declarar multiples variables
		
		int x = 50;
		int y = 15;
		int z = 25;
				
		int a = 24, b = 55, c = 50;
				
		System.out.println(x + y + z);
		System.out.println(a + b + c);
		
		/*
		 * Conversion de tipos de datos en JAVA (casting o casteo)
		 * 
		 * Es cuando se asigna un valor de un tipo de datos primitivo a otro
		 * 
		 * 
		 * - Ampliacion: de un tipo pequenio a un tipo mas grande
		 * 
		 * byte>short>char>int>long>float>double
		 * 

		 * - Reduccion (Narrowing): de un tipo mas grande a un tipo mas pequenio
		 * double>float>long>int>char>short>byte
		 * 
		 */
		int pesitos = 60;
		
		double pesosConCentavos = pesitos;
		double usdCents = 35.89d;
		
		System.out.println(pesitos + " tipo entero");
		System.out.println(pesosConCentavos + " tipo decimal");
		
		System.out.println(pesitos + usdCents + " funciona pero es mala practica");
		System.out.println(pesosConCentavos + usdCents + " buena práctica");
		
		// Cuando reducimos un valor, es importante agregar (tipoDato) y la variable a castear.
		double peso = 98.6d;
		int pesoInt = (int) peso; // redondea hacia abajo
		
		System.out.println(peso);
		System.out.println(pesoInt);
		
		/*Operadores en JAVA
		 * 
		 * operadores aritmeticos (+, -, *, /, %, ++, --)
		 * operadores de asignacion (=, +=, -=)
		 * operadores de comparacion (==, !=, >, <, >=, <=)
		 * operadores logicos (&&, ||, !)
		 * operadores bit a bit
		 * 
		 */
		int numero1 = 5;
		int numero2 = 13;
		
		//Operadores aritmeticos
		System.out.println("Operadores aritméticos");
		int suma = numero1 + numero2;
		int resta = numero2 - numero1;
		int multiplicacion = numero1 * numero2;
		float division = numero1 / numero2;
		float modulo = numero1 % numero2;
		int incremento = ++numero1;
		int decremento = --numero2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
		System.out.println(modulo);
		System.out.println(incremento);
		System.out.println(decremento);
		System.out.println(numero2);
		System.out.println(++numero2);
		
		// Operadores de asignación
		System.out.println("Operadores de asignación");
		int dinero = 4;
		dinero += 3;
		
		//Ejemplo con reasignacion usando ++
		int ahorro = 10;
		int domingo = ++ahorro; //11
		//ahorro = ahorro + 1
		System.out.println("Mi primer ahorro es: " + ahorro);
				
		//Ejemplo usando operador suma (+)
		int ahorro2 = 10;
		int domingo2 = 1 + ahorro2; //11		
				
		System.out.println("Mi segundo ahorro es: "+ ahorro2);
		
		//Operadores de comparación
		
		/*
		 * En JS, usamos un operador llamado "estrictamente igual (===). Este nos permitia evaluar el tipo de dato y el valor, los cuales deben coincidir.
		 */

		int numero3 = 5;
		int numero4 = 6;
		
		boolean igual = numero3 == numero4; //false
		boolean noIgual = numero3 != numero4; //true
		boolean mayorQue = numero3 > numero4; //false
		boolean menorQue = numero3 < numero4; //true
		boolean mayorIgualQue = numero3 >= numero4; //false
		boolean menorIgualQue = numero3 <= numero4; //true


		System.out.println(igual);
		System.out.println(noIgual);
		System.out.println(mayorQue);
		System.out.println(menorQue);
		System.out.println(mayorIgualQue);
		System.out.println(menorIgualQue);

		//AND &&
		
		int numero5= 7;
		int numero6 = 7;
		int numero7 = 8;
		//Angel
		boolean chanclas = numero5>=numero6 && numero6<=numero7;
				
		System.out.println();
				
//		//Karlos
//		boolean numero 5 ==numero 6 && numero 6 < numero7
//				
//		//Andrea
//		numero5 && numero6 < numero7
		//OR ||
		
				//Fernando
				boolean distincion = numero5==numero6 || numero6>numero7;
				System.out.println(distincion);//true y true

				
				//Guillermo
				boolean comparacionOr = numero5 == numero7 || numero6 < numero7; //false y true

				
				//Martin
				boolean chilaquilesVerdes = numero5 < numero6 || numero5 < numero7;
				System.out.println(chilaquilesVerdes);//false y true
				//NOT !
				
				//Lucy
				boolean OperadorNot = !(true && true); //false
				System.out.println(OperadorNot);

				//Daniel
				boolean Operador = !(true && true); //false
				System.out.println(Operador);

				//Mariana
				boolean ejemplo = !(numero5>=numero6 && numero6<=numero7);
				System.out.println(ejemplo);//false


	} // main
} // class
