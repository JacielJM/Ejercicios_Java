package unasPruebillas;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class personaPruebillas {

	private Persona persona1 = new Persona("Griselo", "Philip");
	private Persona persona2 = new Persona("Mussa", "Araña");
	
	@Test
	void pruebasIndividuales() {
		assertEquals("Griselo", persona1.getNombre());
		assertEquals("Araña", persona2.getApellido());
	}
	
	@Test
	void pruebasGrupales() {
		assertAll("persona1",
				() -> assertEquals("Griselo", persona1.getNombre()),
				() -> assertEquals("Philip", persona1.getApellido()),
				() -> assertTrue(persona1.getNombre().contains("Gris"))
			);
	}
	
	@Test
	void pruebasFuncionLambda() {
		assertAll("Persona",
				() -> {
					assertEquals("Griselo", persona1.getNombre());
					assertEquals("Philip", persona1.getApellido());
				},
				() -> {
					assertEquals("Mussa", persona2.getNombre());
					assertEquals("Araña", persona2.getApellido());
				}
				);
	}

}
