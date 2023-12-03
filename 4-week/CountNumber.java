package practitce;
public class CountNumber {
	public static void main(String[] args) {
	        int number = 12340985;
	        int digitCount = countDigits(number);
	        System.out.println("Number of digits in " + number + ": " + digitCount);
	    }
	    public static int countDigits(int number) {
	        String numStr = Integer.toString(number);
	        return numStr.length();
	    }
	}
