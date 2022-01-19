package com.java.training.findVowels;

public class Main {

	public static void main(String[] args) {
		System.out.println(findVowel("happy new year everybody 2022"));

	}
	
	public static String findVowel(String str) {
		String strFound = "";
		str = str.toLowerCase();
		int strLength = str.length();
		
		for(int i=0; i<=strLength-3;) {
			i+=3;
			char ch = str.charAt(i-1);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				strFound += ch;
			}
		}
		
		return strFound;
	}
}
