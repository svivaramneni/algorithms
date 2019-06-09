package com.slr.strings;

public class StringPassByReference {
	public static void main(String[] args) {
		String x = new String("ab");
		change(x);
		System.out.println(x); //prints ab
	}

	public static void change(String x) {
		x = "cd";
	}

}
