
public abstract class Animal {
	public abstract void avanzar();
	public abstract void hacerSonido();
}
 class Perro extends Animal {

	@Override
	public void avanzar() {
		System.out.println("Soy un perro y camino en 4 patas");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau guau!");
	}
 }
 
 class Cuervo extends Animal {

	@Override
	public void avanzar() {
		System.out.println("Soy un pez y muevo las aletas para nadar");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Glu, glu, glu");
	}
 }
 
 class Gato extends Animal {

	@Override
	public void avanzar() {
		System.out.println("Soy un gato y avanzo sigilosamente en 4 patas");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Miauuu miauuu");
	}	
}
 
 class Gallo extends Animal {

	@Override
	public void avanzar() {
		System.out.println("Soy un gallo y camino en 2 patas, puedo volar distancias cortas");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Kikirikiii!");
	}
	 
 }
 
 class Elefante extends Animal {

	@Override
	public void avanzar() {
		System.out.println("Soy un elefante y el suelo retiembla bajo mis 4 patas");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Brrr! Brrr!");
	}
 }