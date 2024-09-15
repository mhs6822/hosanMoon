package day09;

public class Test63 {
	static int x = 10; 
	int y = 20; 
	
	// 클래스 초기화 블럭 : 프로그램 시작시 자동 실행 (1번만)
	static {
		System.out.println("클래스 초기화 블럭");
		x = 100;
		//y = 200; 인스턴스 변수는 사용 불가 
	}
	// 인스턴스 초기화 블럭 : 객체 생성시 자동 실행 (생성할때마다)
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	// 생성자 
	Test63() {
		System.out.println("생성자 실행");
	}
	
	public static void main(String[] args) {

		Test63 t = new Test63();
		Test63 t2 = new Test63();
		
		
		
		
	}
}
