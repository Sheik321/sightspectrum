package practitce;
public class CountNumberOdd {
	    public static void main(String[] args) {
	        int number = 123456789; 
	        int count = countOddDigits(number);
	        System.out.println("The number of odd digits in " + number + " is: " + count);
	    }
	    public static int countOddDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            if (digit % 2 != 0) {
	                count++;
	            }
	            num /= 10;
	        }
	        return count;
	    }
	}
