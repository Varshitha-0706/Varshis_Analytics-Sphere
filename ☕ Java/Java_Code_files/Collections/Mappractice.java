package Collections.java;
import java.util.*;
import java.util.Map.Entry;
public class Mappractice {

	public static void main(String[] args) {
/*  Classes:Hashtable,Hashmap,LinkedHashmap(extends Hashmap)
  Retrieving based on REFERENCES (no index,no iteration)
  KEY:VALUE pairs(key be unique)
		Map m=new Hashtable();
         or
 */
      Map<Integer,String> m=new HashMap<>();
 // <key type,value type>
    // Addition
      m.put(701, "balu");
      m.put(764, "varshi");
      m.put(414, "Devika");
      System.out.println(m);
     // Retrieval of keys
      Set<Integer> keys=m.keySet();
      System.out.println("keys:");
      for(Integer k:keys) {
    	  System.out.println(k);
      }
      // Retrieval of values
      Collection<String> values=m.values();
      System.out.println("values:");
      for(String v:values) {
    	  System.out.println(v);
      }
     System.out.println(m.get(764));
     // values by keys
      for(Integer key:keys) {
    	  System.out.println(key+">>>"+m.get(key));
      }
  //    RETRIVING ENTRIES(key+value)
     Set<Entry<Integer,String>> entries= m.entrySet();
     System.out.println("Entries:");
     for(Entry<Integer,String> e:entries) {
    	 Integer key=e.getKey();
    	 String value=e.getValue();
    	 System.out.println(key+":"+value);
     }
//      Deletion
      m.remove(414);
      System.out.println(m);
      // if u know value
      m.remove(701,"balu");
      System.out.println(m);
 //      Verification
      System.out.println(m.containsKey(764));
      System.out.println(m.containsValue("varshi"));
      m.put(101,"hari");
      System.out.println(m);
      m.put(101, "ram");//name updates at that key
      System.out.println(m);
      m.putIfAbsent(101, "hari");// not updates if present value
      System.out.println(m);
      // Replace
      m.replace(101, "hari");
      System.out.println(m);
      System.out.println("size:"+m.size());
      m.clear();
      System.out.println(m);
    
      
	}

}
