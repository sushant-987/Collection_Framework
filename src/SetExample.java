import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		// creating LinkedHashSet using the Set
		Set<String> data = new LinkedHashSet<String>();

		data.add("JavaTpoint");
		data.add("Set");
		data.add("Example");
		data.add("Set");
       
	//	for(String x: LinkedHashSet)
		System.out.println(data);
	}
}