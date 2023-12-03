package practitce;
	 abstract class Animalsss {
		  public abstract void animalSound();
		  public void sleep() {
		    System.out.println("Zzz");
		  }
		}
		class Pig extends Animalss {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee weei");
		  }
		}
		class AbstractionDemo {
		  public static void main(String[] args) {
		    Pig myPig = new Pig(); 
		    myPig.animalSound();
		  }
		}
