package interviewBased;

import java.util.HashMap;
import java.util.Map;

public class DesiredIndexFromMap {

	public static void main(String[] args) {

		String given = "Word with number of second highest characters";

		String parts [] = given.split(" ");

		Map <String, Integer> map = new HashMap<>();

		for (String sample : parts) {

			map.put(sample, map.getOrDefault(sample, 0)+sample.length());
		}

		int highestCount = 0;

		int secondHighestCount = 0;

		for (int count : map.values()) {

			if (highestCount < count) {
				secondHighestCount = highestCount;
				highestCount = count;
			}

			else if (count > secondHighestCount && count < highestCount) {
				secondHighestCount = count;
			}

		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() == secondHighestCount) {
				System.out.println("Word with number of second highest characters = " + entry.getKey());
			}
		}
	}

}
