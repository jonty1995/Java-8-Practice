package com.java.practice.lambda;

interface Drawable {
	void draw();
}

//Common Implmentation	
//class DrawableImpl implements Drawable {
//
//	@Override
//	public void draw() {
//		System.out.println("drawing");
//	}
//
//}

public class LambdaExample1 {
	public static void main(String args[]) {
//		Common Implmentation		
//		Drawable drawable = new DrawableImpl();
//		drawable.draw();

//		Anonymous Implmentation
//		Drawable drawable = new Drawable() {
//
//			@Override
//			public void draw() {
//				System.out.println("drawing");
//
//			}
//		};
//		drawable.draw();

		Drawable drawable = () -> System.out.println("drawing");
		drawable.draw();

	}
}
