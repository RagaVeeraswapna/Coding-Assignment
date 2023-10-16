// Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

package com.cloudvandana.com;
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		
		int res= 0;
		int prevValue = 0;
		
		for(int i=s.length()-1; i>=0; i--) {
			char currentSymbol = s.charAt(i);
			int currentValue = romanValues.get(currentSymbol);
			if(currentValue<prevValue) {
				res -= currentValue;
			}
			else {
				res += currentValue;
			}
			prevValue = currentValue;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the roman number  : ");
		String romanNumber = sc.nextLine().toUpperCase();
		sc.close();
		int equivalentInteger = romanToInt(romanNumber);
		System.out.println("Equivalent Integer of "+romanNumber+" is : "+equivalentInteger);

	}

}

