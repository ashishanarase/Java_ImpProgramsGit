package newConcepts;

public class VariableAccessScope {
	
	    static int staticVariable = 10;
	    int globalVariable = 20;

	    static void staticMethod1() {
	        System.out.println("Static method accessing static variable: " + staticVariable);
	    }

	    void nonStaticMethod1() {
	        System.out.println("Non-static method accessing static variable: " + staticVariable);
	    }
	    
	    static void staticMethod2() {
	        // Cannot access globalVariable directly
	        // Need to create an instance of MyClass to access globalVariable
	    	VariableAccessScope obj = new VariableAccessScope();
	        System.out.println("Static method accessing global variable: " + obj.globalVariable);
	    }

	    void nonStaticMethod2() {
	        System.out.println("Non-static method accessing global variable: " + globalVariable);
	    }
	    
	    public static void main(String[] args) {
	    	
	    	int localVariable = 30;
	    	VariableAccessScope obj = new VariableAccessScope();
	    	obj.staticMethod1();
	    	obj.staticMethod2();
	    	obj.nonStaticMethod1();
	    	obj.nonStaticMethod2();
	    	
	    	System.out.println("Local Variable of main method: "+ localVariable);
		}
	}


