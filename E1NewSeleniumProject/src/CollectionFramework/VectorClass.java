package CollectionFramework;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		        Vector<Integer> v = new Vector<>(2,3);

		        // Add elements to the vector
		        
		        System.out.println(v);
		        
		        v.addElement(1);
		        v.addElement(2);
		        v.addElement(3);
		        System.out.println(v);

		        // Insert an element at index 1
		        
		        // Print the elements of the vector
		        for (int i : v) {
		            System.out.println(i);
		        }
		    }
		


	}


