
public class Funciones {

	// Funcion para hacer un System.out
	static void imprimirDatos() {
		System.out.println("Primer funcion de Funcioncitas");
	}

	// Funcion con argumentos
	static void imprimirDatosArg(String mensaje) {
		System.out.println(mensaje);
	}

	// Funcion return boolean
	static boolean regresarBooleano() {
		return true;
	}

	// Funcion return int
	static int regresarEntero() {
		return 2022;
	}

	// Funcion return String
	static String regresarString() {
		return "Hola Mundo";
	}

	// Funcion return double
	static double regresarDoble() {
		return 3.1415;
	}

	// Funcion return double y args double
	static double areaTriangulo(double base, double altura) {
		return base * altura / 2; // la jerarquia se ajusta, pues se lee de izq a der
	}

	// Funcion return double + mensaje
	static String areaTrianguloMensaje(double base, double altura) {
		String mensaje = "El área es: " + base * altura / 2;
		return mensaje; // la jerarquia se ajusta, pues se lee de izq a der
	}
	
//	Return string + mensaje
	static String imprimirLongitud(String mensaje) {
		return "La longitud es de: " + mensaje.length();
	}


	public static void main(String[] args) {
//		imprimirDatos();
//		imprimirDatosArg("Hola");
//		imprimirDatosArg("¿Como estas?");
//		System.out.println(regresarBooleano());
//		System.out.println(regresarEntero());
//		System.out.println(regresarString());
//		System.out.println(regresarDoble());
//		System.out.println(areaTriangulo(3, 7));
//		System.out.println(areaTrianguloMensaje(3, 7));
		System.out.println(imprimirLongitud("Tangananica"));
	}

}
