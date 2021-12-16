import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class List1 {
	
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		//using for-each loop
		for(String str : stringList){
		   System.out.println(str);
		}
		//using iterator
	//	Iterator<String> it = stringList.iterator();
		Iterator<String> it = stringList.iterator();
		while(it.hasNext()){
		   String obj = it.next();
		   System.out.println(obj);
		}
		}

}
