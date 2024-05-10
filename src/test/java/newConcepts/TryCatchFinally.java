package newConcepts;


public class TryCatchFinally {

	public static void main(String[] args) {

		//	int b = 1/0;
		//	System.out.println(b);

		try {

			int a = 1/0;
			System.out.println(a);
		}

		catch (Exception e){

			//	System.out.println(e);
			//	System.out.println(e.getMessage());
			//	System.out.println(e.getCause());
			e.printStackTrace();
		}

		finally {
			System.out.println("Kuch bhi ho mera execution nahi rukega");
		}

	}
}