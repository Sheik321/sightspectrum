package practitce;
	abstract class gfg {
	    abstract void printInfo();
	}
	class employee extends gfg {
	    void printInfo()
	    {
	        String name = "Dharshana";
	        int age = 21;
	        float salary = 2345.78F;
	 
	        System.out.println(name);
	        System.out.println(age);
	        System.out.println(salary);
	    }
	}
	class Base {
	    public static void main(String args[])
	    {
	        gfg s = new employee();
	        s.printInfo();
	    }
	}

