package com.greatlearning.balancing.brackets;

import java.util.Stack;

public class BalancingBrackets {

	public static boolean hasBalancedBrackets(String str) {
			
			Stack<Character> bucketStack = new Stack<>();
			
			char [] inputChar = str.toCharArray();
			
			for(int i=0; i<str.length(); i++) {
				
				char ch = inputChar[i];
				
				if(ch == '(' || ch == '[' || ch == '{') {
					
					bucketStack.push(ch);
					continue;
				}
				
				if (bucketStack.isEmpty())
					return false;
				
				char c;
				
				switch(ch) {
				
				case ')' : c = bucketStack.pop();
				           if (c == '[' || c == '{')
				        	   return false;
				           break;
				           
				case ']' : c = bucketStack.pop();
		                   if (c == '{' || c == '(')
		        	           return false;
		                   break;
		                   
				case '}' : c = bucketStack.pop();
		                   if (c == '[' || c == '(')
		        	           return false;
		                   break;
				
				}
					
		}
			return (bucketStack.isEmpty());	
	}

	public static void main(String[] args) {

		String inputString1 = "([[{}]])";

		if (hasBalancedBrackets(inputString1)) {

			System.out.println("The given String has Balanced Brackets");

		} else {

			System.out.println("The given String do not contain Balanced Brackets");

		}

		String inputString2 = "([[{}]]))";

		if (hasBalancedBrackets(inputString2)) {

			System.out.println("The given String has Balanced Brackets");

		} else {

			System.out.println("The given String do not contain Balanced Brackets");

		}
	}

}
