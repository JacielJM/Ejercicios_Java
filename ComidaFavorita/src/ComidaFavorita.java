import java.util.Scanner;
import java.util.ArrayList;
public class ComidaFavorita {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String comidas;
		ArrayList<String> listaComidas = new ArrayList<String>();
		
		do {
			System.out.println("Elige una opcion");
			System.out.println("1 para añadir otra comida");
			System.out.println("2 para modificar las comidas ingresadas");
			System.out.println("3 para borrar alguna comida ingresada");
			System.out.println("4 para salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la nueva comida");
				comidas=sc.nextLine();
				listaComidas.add(comidas);
				System.out.println("Tu lista es "+listaComidas);
				break;
			case 2:
				System.out.println("Ingrese el numero de comida a modificar");
				int i = sc.nextInt()-1;
				System.out.println("Ingrese la nueva comida de la posicion "+i);
				comidas = sc.nextLine();
				listaComidas.set(i, comidas);
				break;
			case 3:
				System.out.println("Ingrese el numero de comida a borrar");
				i = sc.nextInt()-1;
				if(i!=0 ) {
				//System.out.println("Se ha borrado "+listaComidas.get(i));
				listaComidas.remove(i);
				} else {
				listaComidas.clear();
				}
				System.out.println(listaComidas);
				break;
			case 4:
				System.out.println("Gracias por participar");
				break;
			default:
				System.out.println(opcion +" no es una opción válida");
			}
		} while (opcion != 4);
		
		sc.close();
	}

}
