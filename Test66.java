package day09;

class Circle {
	int radius; 
	
	// 기본생성자 자동으로 만들어주는 경우 
	//Circle() {} <- 눈에안보이는 생성자가 생성되서 실행됨.
	
	// radius 값 세팅해주는 메서드 
	void setR(int r) {
		radius = r; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}
public class Test66 {
	public static void main(String[] args) {

		Circle c = new Circle(); // 생성자 없어도 잘 실행
		c.setR(15);
		System.out.println(c.getArea());
		
		
		
	}
}
