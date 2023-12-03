package practitce;
interface Myinterface {
	int Mymethod(int x);
}
public class LambdaExample {
	public static void main (String []args) {
		 Myinterface myInterface = (x) -> {  
return x * x;
};
int result = myInterface.Mymethod(6);
System.out.println("The square of 5 is"+result);
}
}