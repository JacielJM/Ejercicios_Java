
import java.util.ArrayList;
import java.util.Scanner;
public class ComidaFavorita {
	ArrayList<String> listaComidas;
	
	ComidaFavorita() {
		this.listaComidas = new ArrayList<String>();
	}
	
	void agregarComida() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la nueva comida");
		String comidas=sc.nextLine();
		listaComidas.add(comidas);
		System.out.println("Se ha añadido el platillo " +comidas+ " a tu lista");
		System.out.println(listaComidas+"\n");
	}
	
	void modificarPlatillo() {
		if(listaComidas.isEmpty()) {
			System.out.println("Su lista está vacía");
		} else {
			Scanner sc = new Scanner(System.in);
			Scanner ns = new Scanner(System.in);
			System.out.println("Lista actual");
			int n = 1;
			for(String i:listaComidas) {
				System.out.println(n+" "+i);
				n++;
			}
			System.out.println("Ingrese el numero de comida a modificar");
			int i = sc.nextInt();
			System.out.println("Ingrese la nueva comida de la posicion "+i);
			String comidas = ns.nextLine();
			listaComidas.set(i-1, comidas);
			System.out.println("Se ha añadido el platillo " +comidas+ " en "+i);
			System.out.println(listaComidas+"\n");
		}
	}
		
			/*
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
		*/
	void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}

}
