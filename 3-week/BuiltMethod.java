package practitce;
import java.util.Arrays;
public class BuiltMethod {
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        System.out.println("Length of the string: " + str.length());
	        System.out.println("Substring: " + str.substring(0, 5));
	        int[] arr = {3, 1, 5, 2, 4};
	        Arrays.sort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        System.out.println("Square root of 25: " + Math.sqrt(25));
	        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
	        java.io.File file = new java.io.File("example.txt");
	        if (file.exists()) {
	            System.out.println("File exists!");
	        } else {
	            System.out.println("File does not exist.");
	        }
	        java.time.LocalDate currentDate = java.time.LocalDate.now();
	        System.out.println("Current date: " + currentDate);
	    }
	}
