
public abstract class Doctor {
	String nombre;
	
	public abstract void atenderPaciente();
}

class Pediatra extends Doctor {

	@Override
	public void atenderPaciente() {
		System.out.println("soy un pediatra");	
	}
	
}

class Nutriologa extends Doctor {

	@Override
	public void atenderPaciente() {
		System.out.println("soy Mariana Valladolid");
	}
	
}