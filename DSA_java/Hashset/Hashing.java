import java.util.HashSet;

import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);  // lish.add(el)

		//Size
		System.out.println(" Size : " + set.size());


		// Print all elements 
		System.out.println(set);

		// Search - contains

		if (set.contains(1)) {
					System.out.println(" set contains 1");
				}	

		if (!set.contains(6)) {
				System.out.println("does not contains!");
			}	


		// Delete 
		set.remove(1);
		if (!set.contains(1)) {
			System.out.println(" does not contain 1 - we delete");
		}

		// Iterator

		Iterator it = set.iterator();
		System.out.println(it.next());

		while (it.hasNext()) {
			System.out.println(it.next());
		}


	}
}