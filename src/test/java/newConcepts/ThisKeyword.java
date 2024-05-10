package newConcepts;

public class ThisKeyword {

	static int x;
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(x);
		System.out.println(x);
	}

	ThisKeyword(int x) {
		this.x = 25;
	}
}

