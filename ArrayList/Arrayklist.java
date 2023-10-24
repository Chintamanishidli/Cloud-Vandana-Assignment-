package assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Arrayklist {

	public static void main(String[] args) {
		int[] arr={1,4,4,6,7,6,1};
		HashSet he= new HashSet();
		for (int i = 0; i < arr.length; i++) {
			he.add(arr[i]);
		}

		System.out.println(he);

	
	}
}

