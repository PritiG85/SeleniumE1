package CollectionFramework;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>(7);
		
		list.add(1);
		list.add(6);
		list.add(3);
		//List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
//		 list.add("Mango");  
//		 list.add("Apple");  
//		 list.add("Banana");  
//		 list.add("Grapes"); 
//		 list.add(4, "Apple");
//		int ab = list.hashCode();
//		System.out.println(ab);
		 //Iterating the List element using for-each loop  
		 for(int fruit:list)  
		  System.out.println(fruit);
		 
		 
//		 if(list.equals(list))//it comparing the object referance 
//		 {
//		 System.err.println("hello world");
//		 };
//		 list.hashCode()
//		

	}

}
