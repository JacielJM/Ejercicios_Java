package org.generation.nomina;

public class DesarrolladorBackEnd extends Supervisor {

	private int aniosExperiencia;
	private String database;

	public DesarrolladorBackEnd(String firstName, String lastName, int age, String rfc, double salary,
			String departamento, double bono, int aniosExperiencia, String database) {
		super(firstName, lastName, age, rfc, salary, departamento, bono);
		this.aniosExperiencia = aniosExperiencia;
		this.database = database;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "DesarrolladorBackEnd [aniosExperiencia=" + aniosExperiencia + ", database=" + database
				+ ", departamento=" + departamento + ", bono=" + bono + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", RFC=" + RFC + ", salary=" + salary + "]";
	}
}
