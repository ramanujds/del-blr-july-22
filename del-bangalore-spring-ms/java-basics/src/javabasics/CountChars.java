package javabasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		
		Map<Character, Integer> counts = new LinkedHashMap<>();
		System.out.println("Enter a String : ");
		
		String str = new Scanner(System.in).nextLine();
		
		char []chars = str.toCharArray();
		
		for(char ch:chars) {
			if(counts.containsKey(ch)) {
				int n = counts.get(ch);
				counts.put(ch, n+1);
			}
			else {
				counts.put(ch, 1);
			}
		}
		
		counts.forEach((k,v)->System.out.println(k+" : "+v));

	}

}
