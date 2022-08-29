import org.generation.nomina.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		//Es importante mantener el orden de los parametros al momento de construir a nuestro empleado
		//Si dejamos el *, tendremos acceso a todos los elementos. En este caso, la unica clase que nos importa es la clase Employee

		Employee Jaciel = new Employee("Jaciel", "Menera", 25, "JJM970203XXX", 400.25);
		Employee Mariana = new Employee("Mariana", "Valladolid", 28, "xxxxxxxxx", 500.6);
		
		System.out.println(Jaciel.toString());
		System.out.println(Mariana.toString());
		
		System.out.println("\nSalario de Jaciel");
		Jaciel.calculateSalary();
		
		System.out.println("\nSalario de Mariana");
		Mariana.calculateSalary();
		
		System.out.println("\nSalario de Mariana enferma");
		Mariana.calculateSalary(18);
		
		System.out.println("\nSalario de Jaciel festivo");
		Jaciel.calculateSalary(21, 2);
		
	}

}
