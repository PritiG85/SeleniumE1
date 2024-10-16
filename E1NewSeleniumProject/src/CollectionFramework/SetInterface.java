package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(6);
		set.retainAll(set);
		int ab = set.hashCode();
		 System.out.println(ab);
		for (Integer setValue : set) {

			System.out.println(setValue);

		}

	}

}
