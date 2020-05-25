package stringprogram;

import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "TestNG is a testing framework for the Java Java Java programming language created by Cédric Beust and inspired by JUnit and NUnit. "
				+ "with more powerful My My My and easy-to-use functionalities functionalities";

		String[] str1 = str.split(" ");

		HashMap<String, Integer> hMap = new HashMap<>();

		for (int i = str1.length - 1; i >= 0; i--) {
			if (hMap.containsKey(str1[i])) {
				int count = hMap.get(str1[i]);
				hMap.put(str1[i], count + 1);
			} else {
				hMap.put(str1[i], 1);
			}
		}
		System.out.println("Printing the Count of Words" + hMap);

		// Sort the Map based on Value in increasing Order
		Map<String, Integer> sortedInIncreasingOrder = hMap.entrySet().stream().sorted(comparingByValue())
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("Sorting the map on values in increasing order " + sortedInIncreasingOrder);

		// Sort the Map based on Value in Decreasing Order
		Map<String, Integer> sortedInDecreasingOrder = hMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("Sorting the map on values in Decreasing order " + sortedInDecreasingOrder);
	}
}
