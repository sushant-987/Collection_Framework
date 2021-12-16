import java.util.ArrayList;
import java.util.HashSet;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(3);
        hs.add(1);
		al.trimToSize();
		al.add("a");

		al.add(0, "s");

		System.out.println(hs);
		System.out.println(al);
	    
		
		
		
	}

}
