package practitce;
public class Cricket {  
	    String name;   
	    void showMessage()   
	    {   
	        System.out.println("Parent method is called");   
	    }   
	}   
	class Child extends Cricket{   
	    int age;     
	    void showMessage()   
	    {   
	        System.out.println("Child method is called");   
	    }   
	}   
