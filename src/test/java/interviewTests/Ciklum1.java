package interviewTests;

public class Ciklum1 {
	public static void main(String[] args) {


		String[] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Sev"};

		for (int i = 0; i < nums.length; i++) {
			if (nums[i++].length() % 3 == 0) {
				continue;
			}

			System.out.println(nums[i]);
			break;
		}
	}
}
