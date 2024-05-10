package interviewTests;

public class Ciklum2<T extends Runnable, String> {
	//String s = "Hello";  //compile time error on line 4 in question line 12

	public void test (T t) {
		t.run();
	}
}
