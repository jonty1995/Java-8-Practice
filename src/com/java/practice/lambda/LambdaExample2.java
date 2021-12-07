package com.java.practice.lambda;

interface Printable {
	void print(String message);

}

public class LambdaExample2 {
	public static void main(String args[]) {
//		Printable printable = new Printable() {
//
//			@Override
//			public void print(String message) {
//				System.out.println(message);
//			}
//		};
//		printable.print("lambda expression with single param");
		
		Printable printable = (message) ->System.out.println(message);
		printable.print("lambda expression with single param");
		
	}
}
