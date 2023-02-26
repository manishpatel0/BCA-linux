import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMaping {

	//RUN 
	public static void main(String[] args) {
		// country(key), population(value)
		HashMap<String, Integer> map = new HashMap<>();

		// Insertion 
		map.put("India" , 120);
		map.put("US", 30);
		map.put("China", 150);

		//print
		System.out.println(map);

		map.put("China", 180);
		System.out.println(map);

		//Search
		if (map.containsKey("China")) {
			System.out.println(" Key is present in the map ");
		} else {
			System.out.println(" Key is not present in the map!");
		}

		// value 
		System.out.println(map.get("China"));
		System.out.println(map.get("Indonasia"));


		// Iteration in HashMap 

		// Map.Entry<Integer, Integer> e : Map.entrySet();

		int arr[] = {12, 15, 18};
		for (int val : arr) {
			System.out.println(val);
		}

		//print 
		for (Map.Entry<String,Integer> e : map.entrySet() ) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}


		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}


		//remove 
		map.remove("China");

		
	}
}