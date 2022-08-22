import java.util.Scanner;

public class practicaFlujo {

	public static void main(String[] args) {
		// Determina si el usuario es mayor de usuario
		int edad;
		Scanner sc;

		System.out.println("Por favor ingrese su edad:");
		sc = new Scanner(System.in);
		edad = sc.nextInt();

		if (edad > 0) {
			if (edad >= 18) {
				System.out.println("Bienvenido al mundo del SAT");
			} else {
				System.out.println("Disfruta mientras puedas");
			}
		} else {
			System.out.println("Ingrese una edad válida");
		}

//		Misma verificacion, con else if

		if (edad <= 0) {
			System.out.println("Ingrese un numero valido");
		} else if (edad < 18) {
			System.out.println("Chiquitin");
		} else {
			System.out.println("Ahi viene el SAT. Pasa al afore.");
		}

		// Verificar a que estacion le pertenece un año en particular
		int opcion;
		System.out.println("Elija su estación favorita:");
		Scanner op = new Scanner(System.in);
		opcion = op.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Es primavera!");
			break;
		case 2:
			System.out.println("Es verano!");
			break;
		case 3:
			System.out.println("Es otoño!");
			break;
		case 4:
			System.out.println("Es invierno!");
			break;
		default:
			System.out.println("Ingrese un número ENTERO entre 1 y 4");
		}
		int rand = (int) (Math.random() * 10);
		System.out.println("Random: " + rand);
		
		
		/*
		 * Ejercicio #1
		 * Calcular el descuento de usuario segun su nivel Fan Club Cinepolis
		 * 
		 * Variables: Nivel Fan, Descuento
		 * Niveles: 1 - 5%, 2 - 10%, 3 - 20%, 4 - 50%
		 * Output: "Usted es Superfan de nivel $nivel y su descuento es de $descuento"
		 */
		System.out.println("Ingrese su nivel de Superfan:");
		int nivel = op.nextInt();

		
		switch(nivel) {
		case 1:
			System.out.println("Usted es Superfan de nivel " + nivel + " y su descuento es de 5%");
			break;
		case 2:
			System.out.println("Usted es Superfan de nivel " + nivel + " y su descuento es de 10%");
			break;
		case 3:
			System.out.println("Usted es Superfan de nivel " + nivel + " y su descuento es de 20%");
			break;
		case 4:
			System.out.println("Usted es Superfan de nivel " + nivel + " y su descuento es de 50%");
			break;
		default:
			System.out.println("No existe ese nivel");	
		}
		// comentarios
		/* Ejercicio 02
		 * 
		 * Calcular la mensualidad de el usuario segun su nivel y cupon de descuento
		 * int cupon = 10;
		 * Variables: Nivel, Mensualidad, Cupon
		 * Niveles: Basico, Intermedio, Completo, Pro
		 * Output: "Suscripcion $suscripcion de: $mensaulidad aplicando cupon de promocion"
		 * 
		 * Monto: Basico = $100, Intermedio = 120, Completo = 170, Pro = 250;
		 * 
		 * Mensualidad: monto - (monto * cupon);
		 * resultado = monto - (monto * %);
		 * 
		 * 100 * .10 = 10% = 
		 */
		Scanner ns = new Scanner(System.in);
		System.out.println("Ingrese su nivel de Mensualidad para obtener su descuento");

        final double cupon = 0.10;
        double mensualidad;
        int nivelUsuario, monto;
        nivelUsuario = ns.nextInt();

        switch(nivelUsuario) {
            case 1:
                monto = 100;
                mensualidad = monto - (monto * cupon);
                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
                break;
            case 2:
                monto = 120;
                mensualidad = monto - (monto * cupon);
                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
                break;
            case 3:
                monto = 170;
                mensualidad = monto - (monto * cupon);
                System.out.println("Suscripcion " + nivelUsuario + "de: " + mensualidad + " " + " aplicando cupon de promocion");
                break;
            case 4:
                monto = 250;
                mensualidad = monto - (monto * cupon);
                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + " aplicando cupon de promocion");
                break;
            default:
                System.out.println("Ingresa un valor valido");
        	}

	} // cierre main

} // cierre class
