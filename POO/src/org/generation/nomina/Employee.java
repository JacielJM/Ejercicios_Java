package org.generation.nomina;

public class Employee {
	// Propiedades
	
	public String firstName;
	public String lastName;
	public int age;
	public String RFC;
	public double salary;
	
	public Employee(String firstName, String lastName, int age, String rfc, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.RFC = rfc;
		this.salary = salary;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	
	//Metodos (acciones a realizar)
	
		//Obtener el nombre
		//Calcular salario por mes
		//Imprimir el recibo de nomina
		
		
		//Metodo para calcular el salario
		//Sintaxis del metodo (modificador de acceso + void + nombre del metodo + parametros)
	
	//Estructura de un metodo o una funcion
	
		//modificador de acceso + tipo de retorno + Nombre + Parametros
	
	//Método para calcular salario
	public void calculateSalary () {
		System.out.println("El salario es: " + this.salary*21);
	}
	
	public void calculateSalary (int days) {
		System.out.println("El salario es: " + this.salary*days);
	}
	
	//Método para calcular salario con dias festivos
	public void calculateSalary (int days, int holidays) {
		holidays *=3;
		System.out.println("Trabajaste un día feriado, te pago el triple");
		System.out.println((this.salary*holidays)+(this.salary*days));
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC
				+ ", salary=" + salary + "]";
	}

	

	
	

}
