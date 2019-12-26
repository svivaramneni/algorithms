package com.slr.bitwise;

public class BitwiseOperators {

	public static void main(String[] args) {

		System.out.println(countOneBits(20));
	}

	public static short countOneBits(int x) {
		short numBits = 0;
		while (x != 0) {
			System.out.println("x value : "+  x);
			System.out.println("x binary value : "+  Integer.toBinaryString(x));
			numBits += (x & 1);
			System.out.println("Number of bits : "+  numBits);
			x >>>= 1;
		}
		return numBits;
	}

}
