package day09;

import java.util.Scanner;

class Circle2 {
	int radius; 
	
	// 생성자 
	Circle2(int radius) {
		this.radius = radius; 
	}
	// 메서드 
	void setR(int r) {
		radius = r; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}

public class Test67 {
	public static void main(String[] args) {

		Circle2 c = new Circle2(10);
		System.out.println(c.getArea());
		
		Circle2 cc = new Circle2(1);
		
		// 에러!! 
		//Circle2 c1 = new Circle2(); 
		
		//Scanner sc = new Scanner();
		
		
		
	}
}
