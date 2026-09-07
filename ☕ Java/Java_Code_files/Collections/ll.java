package Collections.java;
import java.util.*;
public class ll {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
/*      Initially size=0,fiestNode=lastNode=null
 *       dafault=initial capacity=0
 *       insertion order
 *       not synchronised
 *       Usage:add,get and for manipulation 
 *       since manipulation is easy by changing prev,next only unlike arraylist(shifting)..
 */
		ArrayList<Integer> a=new ArrayList<>();
		a.add(3);
		a.add(4);
		l.add(1);
		l.add(2);
		System.out.println(l);
		l.remove();// removes first element by default..
		System.out.println(l);
		l.addAll(a);
		System.out.println(l);
		for(int i=0;i<a.size();i++) {
			l.add(a.get(i));
		}
		System.out.println(l);
        l.clear();
		System.out.println("size"+l.size()); 
		//keeps prev=next=null
	}

}
