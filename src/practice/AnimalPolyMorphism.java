package practice;

public class AnimalPolyMorphism {


		  public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		}

		class Pig extends AnimalPolyMorphism {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }
		}

		class Dog extends AnimalPolyMorphism {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		}

		class Main {
		  public static void main(String[] args) {
		    AnimalPolyMorphism myAnimal = new AnimalPolyMorphism();  // Create a Animal object
		    AnimalPolyMorphism myPig = new Pig();  // Create a Pig object
		    AnimalPolyMorphism myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		  }
		}

