package com.ohcompany.leetcodeString;

public class CountandSay {

	static String countAndSay(int n) {
//		if (n == 1) {
//			return "1";
//		}
//		String prev = countAndSay(n - 1);
//		StringBuilder str = new StringBuilder();
//		int i = 0;
//		while (i < prev.length()) {
//			char curr = prev.charAt(i);
//			int j = 0;
//			while (i + j < prev.length() && prev.charAt(i + j) == curr) {
//				j++;
//			}
//			str.append(j);
//			str.append(curr);
//			i += j;
//		}
//		return str.toString();
		
		StringBuilder curr=new StringBuilder("1");
    	StringBuilder prev;
    	int count;
    	char say;
        for (int i = 1; i < n; i++) {
        	prev = curr;
 	        curr = new StringBuilder();       
 	        count = 1;
 	        say = prev.charAt(0);
 	        
 	        for (int j = 1, len = prev.length(); j < len; j++) {
 	        	if (prev.charAt(j) != say) {
 	        		curr.append(count).append(say);
 	        		count=1;
 	        		say=prev.charAt(j);
 	        	} else {
 	        		count++;
 	        	}
 	        }
 	        curr.append(count).append(say);
        }	       	        
        return curr.toString();
        
	}
	public static void main(String[] args) {
		int input = 4;
		System.out.println(countAndSay(input));

	}

}
