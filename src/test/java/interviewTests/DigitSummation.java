package interviewTests;

public class DigitSummation {

	public static void main(String[] args) {

		long value3 = 910161705566L;

		long value4 = 78861725665L;

		long value1 = 910161705566L;

		long value2 = 488373928993L;

		long sum = 0L;

		long reminder = 0;

		while (value1>0) {

			reminder = value1%10;

			sum = sum + reminder;

			value1 = value1 / 10 ;

		}		

		System.out.println(sum);

		sum = 0;

		while (value2>0) {

			reminder = value2%10;

			sum = sum + reminder;

			value2 = value2 / 10 ;

		}		

		System.out.println(sum);

	}

}
