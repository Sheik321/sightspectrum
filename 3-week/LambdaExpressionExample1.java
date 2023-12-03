package practitce;
	interface Drawable{  
	    public void draw();  
	}  
	public class LambdaExpressionExample1 {  
	    public static void main(String[] args) {  
	        int width=25;  
	        Drawable d2=()->{  
	            System.out.println("Printing "+width);  
	        };  
	        d2.draw();  
	    }  
	}  
