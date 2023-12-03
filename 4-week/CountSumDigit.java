package practitce;
public class CountSumDigit {
	    public static int countDigits(int number) {
	        int count = 0;
	        while (number != 0) {
	            number = number / 10;
	            count++;
	        }
	        return count;
	    }
	    public static int sumDigits(int number) {
	        int sum = 0;
	        while (number != 0) {
	            sum += number % 10;
	            number = number / 10;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        int num = 4567;
	        int numberOfDigits = countDigits(num);
	        int sumOfDigits = sumDigits(num);
	        System.out.println("Number of digits: " + numberOfDigits);
	        System.out.println("Sum of digits: " + sumOfDigits);
	    }
	}
