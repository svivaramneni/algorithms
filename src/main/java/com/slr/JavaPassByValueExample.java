package com.slr;

public class JavaPassByValueExample {

	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.color);

		changeApple(apple);
		System.out.println(apple.color);

		changeApple2(apple);
		System.out.println(apple.color);
	}

	public static void changeApple(Apple apple){
		//New reference value and old reference value points to same object.
		apple.color = "green";
	}

	public static void changeApple2(Apple apple){
		//New reference value is changed to point to the new object below.
		apple = new Apple();
		apple.color = "orange";
	}

}

class Apple {
	public String color="red";
}


