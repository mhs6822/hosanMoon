package day09;

public class Test64 {

	// 인스턴스 변수 
	double d; 
	
	// 생성자 
	Test64() {
		System.out.println("생성자1");
		d = Math.random();
	}
	// 생성자 오버로딩 가능 
	Test64(double a) {
		System.out.println("생성자2");
		d = a; 
	}
	
	public static void main(String[] args) {

		System.out.println("main 실행!!!");
		// 객체 생성시 아무값도 안넣어주면 d를 랜덤값으로 체우고
		// d에 원하는 값을 지정해서 생성도 가능
		Test64 t1 = new Test64(); 
		Test64 t2 = new Test64(3.14);
		System.out.println(t1.d);
		System.out.println(t2.d);
		//Scanner sc = new Scanner(System.in);
		
	}
}
