import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		ComidaFavorita lista = new ComidaFavorita();
		int seleccion;
		do {
			System.out.println("Elija una de las siguientes opciones:");
			System.out.println("	1 para añadir un platillo a la lista");
			System.out.println("	2 para modificar un platillo en la lista");
			System.out.println("	3 para eliminar un platillo de la lista");
			System.out.println("Para salir escriba cualquier otro número");
			
			seleccion = ns.nextInt();
			
			switch (seleccion) {
			case 1:
				lista.agregarComida();
				break;
			case 2:
				lista.modificarPlatillo();
				break;
			case 3:
				//lista.eliminarPlatillo();
				break;
			case 4:
				//lista.ver();
				break;
			default:
				lista.salir();
			}
		} while (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4);
		ns.close();
	}
}
