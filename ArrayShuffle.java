// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package com.cloudvandana.com;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6,7};
		List<Integer> list = Arrays.asList(arr);
		Collections.shuffle(list);
		list.toArray(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
