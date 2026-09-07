package Collections.java;
import java.util.Stack;
public class Stacks {

	public static void main(String[] args) {
		Stack s=new Stack();
//     STACK:A class which implements list interface and extends Vector class and also represents 
//		LIFO principle.
//      Stacks internally extends Vector class
//      STACK=VECTOR+PUSH,POP,PEEK,SEARCH
//		searching:1 2 3 (from top) ...
//      indexes:0 1 2 (from down)..
//      stack(100)-->not be given an empty stack(parameterless).. 
/*      Default=initial capacity=10
 *      dup,null
 *       synchronized
 *      Usage:When want LIFO principle
 *      Ex:undo,redo...
 * */
		System.out.println("Capacity="+s.capacity());
		s.add(10);
		s.add(30);
		System.out.println(s);
		System.out.println(s.get(0));
		s.setElementAt(20,1);//no shifting here just replace
		System.out.println(s);
		s.push(30);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());//returns top element
		System.out.println(s.search(10));
		System.out.println(s.indexOf(10));



	}

}