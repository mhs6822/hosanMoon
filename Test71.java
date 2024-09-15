package day09;

class Car {
	String color = ""; 
	Car(String color) { // 생성자
		this.color = color; 
	}
	String drive() { // 일반 메서드 
		return color + "색 차가 지나갑니다~ 비키세요~~~~~"; 
	}
}

public class Test71 {
	public static void main(String[] args) {

		Car[] garage = new Car[5];  // 배열 생성
		String[] colors = {"빨간", "노란", "초록", "파란", "검은"};
		
		for(int i = 0; i < garage.length; i++) {
			garage[i] = new Car(colors[i]); // Car객체 생성 
		}
		
		for(int i = 0; i < garage.length; i++) {
			System.out.println(garage[i].drive());
		}
		
		
		
		
		
		
		/*
		// 기본형 배열 
		int [] arr = new int[5]; 
		double [] arr2 = new double[5]; 
		boolean [] arr3 = new boolean[5]; 
		String [] arr4 = new String[5];
		
		arr[0] = 10; 
		arr2[0] = 1.234; 
		arr3[0] = true; 
		arr4[0] = "hello"; // new String("hello"); 
		
		// 객체 배열 
		Car [] cars = new Car[5]; 
		cars[0] = new Car(); 
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
