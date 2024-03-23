package newConcepts;

public class EnumVariable {
	
	public enum day {
		SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String[] args) {
		day today = day.TUESDAY;
		System.out.println(today);
	}

}
