package day09;
// 메서드 오버로딩 
public class Test61 {

	// * 오버로딩 가능 * 
	// 매개변수의 개수 차이 
	int getSum(int a, int b) {
		return a + b; 
	}
	int getSum(int a, int b, int c) {
		return a + b + c; 
	}
	// 매개변수 타입 차이 
	int getMul(int a, int b) {
		return a * b; 
	}
	int getMul(int a, double b) {
		return a * (int)b; 
	}
	
	// * 오버로딩 불가능 *
	// 리턴타입이 다른것은 상관없다. 메서드명, 매개변수만 고려
	/*int getSub(int a, int b) {
		return a - b; 
	}
	double getSub(int a, int b) {
		return (double)a - b; 
	}
	// 매개변수의 이름이 다른것은 상관없다. 매개변수의 개수나 타입만 고려 
	int getDiv(int a, int b) {
		return a / b; 
	}
	int getDiv(int c, int d) {
		return c / d; 
	}*/
	
	
	public static void main(String[] args) {

		Test61 t = new Test61(); 
		System.out.println(t.getSum(10, 20)); 
		System.out.println(t.getSum(1, 2, 3));
		
		
		
		
	}
}
