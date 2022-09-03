
public abstract class Figura {
	/*
	 * clase padre = superclase
	 * clase hijo = subclase
	 * 
	 * 
	 * Clases Abstractas
	 * 
	 *  Las clases abstractas son similares a una clase normal (tiene parametros, tiene constructores, metodos, etc.), pero la principal diferencia es que en una clase abstracta se define un metodo abtracto, para que cada uno de sus hijos o subclases puedan implementar el metodo como mejor les convenga
	 * 
	 * 
	 * Metodos abstractos
	 * 
	 * Metodos o funciones que no tienen un cuerpo. No realizan ninguna accion, solo nos dice que debemos hacer pero no nos dice como. 
	 * 
	 * 
	 * Notas:
	 * 
	 * - Una clase abstracta es un clase normal con al menos un metodo abstracto
	 * - Una clase abstracta puede ser heredada por n cantidad de subclases, pero no puede ser instanciada.
	 * - Cuando heredamos de la clase abstracta, es OBLIGATORIO implementar tambien todos los metodos abstractos que tenga la clase padre.
	 * 
	 */
	private int numLados;
	
	public Figura() {
		this.numLados = 0;
	}
	
	public abstract float area();

}
