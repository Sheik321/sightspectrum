package practitce;
public class Arrayindex {
	    public static void main(Stringsss[] args) {
	        int[][] myArray = new int[2][10];
	        for (int i = 0; i < myArray.length; i++) {
	            for (int j = 0; j < myArray[i].length; j++) {
	                myArray[i][j] = i + j;
	            }
	        }
	        for (int i = 0; i < myArray.length; i++) {
	            for (int j = 0; j < myArray[i].length; j++) {
	                System.out.println(myArray[i][j]);
	            }
	        }
	    }
}
	        
