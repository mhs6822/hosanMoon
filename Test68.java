package day09;

public class Test68 {

	// 인스턴스 변수 
	int x = 10; 
	// 인스턴스 메서드 
	void add(int x) { // 같은 이름의 변수 우선순위 : 지역 > 인스턴스, 클래스
		this.x = x; 
	}
	
	public static void main(String[] args) {

		Test68 test = new Test68(); 
		System.out.println(test.x);
		test.add(200);
		System.out.println(test.x);
		
		
		
		
		
	}
}
