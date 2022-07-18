package javabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Program1 {

	public static void main(String[] args) {
		
//		Comparator<Integer> compareNums = new Comparator<Integer>() {
//			public int compare(Integer i1, Integer i2) {
//				return i2-i1;
//			}
//		};
		
//		Comparator<Integer> compareNums = (i1,i2) -> i2-i1;
		
//		Set<Integer> nums = new TreeSet<>((i1,i2) -> i2-i1);
//		nums.add(100);
//		nums.add(200);
//		nums.add(50);
//		nums.add(10);
//		nums.add(60);
//		
//		nums.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Rahul", "Mohit","Harsh","Priyanka","Kamal");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		
	}

}
