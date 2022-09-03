package org.generation.nomina;

public class DesarrolladorFrontEnd extends Supervisor {
	private int aniosExperiencia;
	private String framework;

	public DesarrolladorFrontEnd(String firstName, String lastName, int age, String rfc, double salary,
			String departamento, double bono, int aniosExperiencia, String framework) {
		super(firstName, lastName, age, rfc, salary, departamento, bono);
		this.aniosExperiencia = aniosExperiencia;
		this.framework = framework;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "DesarrolladorFrontEnd [aniosExperiencia=" + aniosExperiencia + ", framework=" + framework
				+ ", departamento=" + departamento + ", bono=" + bono + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", RFC=" + RFC + ", salary=" + salary + "]";
	}
}
