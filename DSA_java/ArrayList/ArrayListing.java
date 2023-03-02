import java.util.ArrayList;
import java.util.Collections;


public class ArrayListing {
	// RUN
	public static void main(String[] args) {
		System.out.println(" ArrayListing ...");

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list_1 = new ArrayList<>();


		//add elemnets 
		list.add(0);
		list.add(2);
		list.add(3);

		//print
		System.out.println(list);

		//get elements 
		int element = list.get(0);
		System.out.println(element);

		// add el in between
		list.add(1,1);
		System.out.println(list);

		// set element 
		list.set(0,5);
		System.out.println(list);

		// delete element 
		list.remove(3);
		System.out.println(list);

		// Size
		int size = list.size();
		System.out.println(" Size: " + size);

		// loop 
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();

		// sorting
		Collections.sort(list);
		System.out.println(list);

	}
}