package practitce;
class Programmers{  
	 float salary=40000;  
	}  
public class InheritenceDemo extends Programmers {
	int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceDemo p=new InheritenceDemo();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus); 
	}

}
