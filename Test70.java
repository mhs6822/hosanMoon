package day09;

class Book2 {
	String title = ""; 
	String author = "";
	Book2() {
		this("무제", "작자미상"); 
		System.out.println("첫번째 생성자");
	}
	Book2(String title) {
		this(title, "작자미상"); 
		System.out.println("두번째 생성자");
	}
	Book2(String title, String author) {
		System.out.println("세번째 생성자");
		this.title = title; 
		this.author = author; 
	}
	void show() {
		//this("hello"); // 생성자 안에서만 사용 가능 
		System.out.println(title + " " + author);
	}
}

public class Test70 {
	public static void main(String[] args) {

		//Book2 little = new Book2("어린왕자", "생텍쥐베리"); 
		//Book2 kong = new Book2("콩쥐팥쥐"); 
		Book2 emptyBook = new Book2(); 
		Book2 abc = emptyBook;
		emptyBook.show();
		
		
		
		
		
	}
}
