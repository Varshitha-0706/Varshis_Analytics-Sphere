package Collections.java;
import java.util.Vector;
import java.util.ArrayList;
public class List {
	public static void main(String[] args) {
		//                    VECTOR
		//Default capacity=10=initial capacity
		// allows null,duplicate values
		//maintain insertion order not sorted order
		//***synchronized
		// used in:MULTI-THREADING environment
		Vector<String> v1=new Vector<>();//Creation
		System.out.println(v1);
		System.out.println(v1.isEmpty());
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		//Addition
		v1.add("varshi");
		v1.add("moulika");
		v1.add("devika");
		v1.add(0,"renusri");
		System.out.println("v1="+v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		//v1 to v2(copying)
		Vector v2=new Vector(20);
		for(int i=0;i<v1.size();i++) {
			v2.add(v1.get(i));
		}
		System.out.println("v2="+v2);
		
		//Retrieval
		System.out.println(v1.get(0));
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		Vector v3=new Vector();
		v3.addAll(0,v1);     //or v3.add(v1);
		System.out.println("v3="+v3);
		
		//Deletion
		v3.remove(0);
		System.out.println("v3="+v3);
		v3.remove("devika");
		System.out.println("v3="+v3);
		v3.removeAllElements();
		System.out.println("v3="+v3);
	    v2.removeAll(v1);
	    System.out.println("v2="+v2);
		//or
		v2.clear();
		System.out.println("v2="+v2);
		
		//Verification
		System.out.println(v1.contains("varshi"));//object passed
		System.out.println(v2.containsAll(v1));//collection passed
		
		//updation
		System.out.println("v1="+v1);
		v1.set(0, "deepu"); //(index,object) returns obj
		System.out.println("v1="+v1);
		v1.setElementAt("renu",3);
		System.out.println("v1="+v1);  //(object,index) void
		
		System.out.println("index of varshi="+v1.indexOf("varshi"));
		v1.add("varshi");
		v1.add(null);
		System.out.println("v1="+v1);
		System.out.println("Last index of varshi="+v1.lastIndexOf("varshi"));
		System.out.println(v2.isEmpty());
		System.out.println(v1.isEmpty());
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		//                 ARRAYLIST
		//Default capacity=0
		//Initial capacity:10(if 1 element added)
		// allow duplicates,null values
		// not synchronized
		//usage:STORE &RETRIEVE(without manipulation)
		System.out.println("\n------ARRAYLIST------");
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(null);
		al.add(20);
		System.out.println(al);
		al.remove(0);
		System.out.println("size:"+al.size());
		System.out.println(al);
		System.out.println(al.get(0));
		al.set(1, 40);
		System.out.println(al);
		al.add(0,50);
		System.out.println(al);
		//since it moves as element is added at 1st index many shiftings required.
		//not be suitable in multithread environment and manipulation..

	}

}