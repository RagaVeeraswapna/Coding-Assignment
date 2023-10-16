// Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

package com.cloudvandana.com;

import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
	
	public static boolean isPangram(String s) {
		s = s.toLowerCase();
		HashSet<Character> alphabets = new HashSet<>();
		for(int i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				alphabets.add(c);
			}
		}
		return alphabets.size()== 26;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = sc.nextLine();
		sc.close();
		if(isPangram(str)) {
			System.out.println("The sentence is a pangram");
		}
		else {
			System.out.println("The sentence is not a pangram");
		}

	}

}
