package org.generation.nomina;

public class Supervisor extends Employee {
	
	protected String departamento;
	protected double bono;

	public Supervisor(String firstName, String lastName, int age, String rfc, double salary, String departamento, double bono) {
		super(firstName, lastName, age, rfc, salary);
		this.departamento = departamento;
		this.bono = bono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public String toString() {
		return "Supervisor [departamento=" + departamento + ", bono=" + bono + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC + ", salary=" + salary + "]";
	}

	
	
	

}
