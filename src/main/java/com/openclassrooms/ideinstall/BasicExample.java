package com.openclassrooms.ideinstall;

public class BasicExample {

	public static void main(String[] args) {
		int index;
		for (index = 0; index >= 0; index++) {
			System.out.println("Hello " + index + " bugs !");
			if (index == 10)
				break;
		}
	}
}
