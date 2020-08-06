package com.palindrom.pgm;

import java.util.Scanner;

public class Palindrome{
public static boolean palindromeDescendant(int num){
    boolean isSym = false;
    
    while(num>9){
        if(isPalindrome(num)) {
            isSym = true;
            return isSym;
        }
        num = getDescendant(num);
    }
    
    return isSym;
}

public static boolean isPalindrome(int num){
    int reverseNum = 0;
    int n = num;
    while(n>0){
        reverseNum = reverseNum * 10;
        reverseNum = reverseNum + n % 10;
        n = n/10;
    }
    return(reverseNum == num);
}

public static int getDescendant(int n){
   String str = Integer.toString(n);
   StringBuilder sb = new StringBuilder();
   
   for(int i =0; i< str.length() - 1; i+=2){
       int a = Integer.parseInt(Character.toString(str.charAt(i)));
       int b = Integer.parseInt(Character.toString(str.charAt(i+1)));
       int num = a + b;
       sb.append(Integer.toString(num));
   }
   
   return Integer.parseInt(sb.toString());
}
    public static void main(String []args){
    	 try (Scanner s = new Scanner(System.in)) {
    		 System.out.println("Enter the number:");
			int num = s.nextInt();
			System.out.println(palindromeDescendant(num));
		}
    }
}