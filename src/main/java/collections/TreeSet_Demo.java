package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		Set tree = new TreeSet();
	//	tree.add("hello");
		//tree.add(null);
		tree.add("hello");
		tree.add("bye");
		tree.add("good");
		tree.add("you");
		
		//tree.add(false);
		System.out.println(tree);
	}

}
