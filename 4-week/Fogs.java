package practitce;
public class Fogs {

	    // public variable
	    public int legCount;

	    // public method
	    public void display() {
	        System.out.println("I am an FOGS.");
	        System.out.println("I have " + legCount + " legs.");
	    }
	    public static void main( String[] args ) {
	        // accessing the public class
	        Fogs animal = new Fogs();

	        // accessing the public variable
	        animal.legCount = 4;
	        // accessing the public method
	        animal.display();
	    }
	}

