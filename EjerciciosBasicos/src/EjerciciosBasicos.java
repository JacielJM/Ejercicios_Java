
public class EjerciciosBasicos {

	public static void main(String[] args) {
		// Práctica 1
		int num1 = 12, num2 = 24, num3 = 25, num4 = 92, num5 = 91;
		boolean resultado1, resultado2;
		
		System.out.println("Práctica 1:");
		resultado1 = (num1 < num2 || num2 < num3) && (!(num1 != num2) && num5 != num3);
		System.out.println("La comparación da: "+resultado1);
		
		// Práctica 2
		System.out.println("Práctica 2:");
		resultado2 = (num5 > num2 && num4 < num3) || (!(num1 == num2) || num3 != num3);
		System.out.println("La comparación da: "+resultado2);

	}

}
