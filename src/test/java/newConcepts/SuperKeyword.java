package newConcepts;

public class SuperKeyword extends ThisKeyword {
	
	public static void main(String[] args) {
		new SuperKeyword(10,20);
		
	}
	int y;
	SuperKeyword(int x, int y) {
		super(x); // Calls Parent class constructor
		this.y = y;
		// Accessing Parent class field
		System.out.println("Parent class field x: " + super.x);
	}

}