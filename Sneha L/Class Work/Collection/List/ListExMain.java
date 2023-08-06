import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExMain {
    public static void main(String[] args) {

        //ARRAY LIST
        ArrayList<String> l=new ArrayList<>();
        l.add("Sam");
        l.add("Sneha");
        l.add(null);
        //l.add(10)--->C.E: Incompatible types:Int cannot converted String
        System.out.println(l);

        //LINKEDLIST 
        LinkedList ll=new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        ll.addFirst("Sneha");
        ll.addLast("Nishal");
        System.out.println(ll);
        ll.remove(1);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.getFirst());

        //Vector 
        Vector v=new Vector();
        System.out.println(v.capacity());
        for(int i=1;i<=10;i++)
        {
            v.add(i);
        }
        System.out.println(v.capacity());
        v.addElement("SNEHA");
        System.out.println(v.capacity());
        System.out.println(v);

        //stack
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search("A"));
        System.out.println(s.search("X"));

    }
}
