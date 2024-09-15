package day09;

class Book {
	String title; 
	String author; 
	
	Book(String t) {
		title = t; 
		author = "작자미상";
	}
	
	Book(String t, String a) {
		title = t; 
		author = a; 
	}
}


public class Test65 {
	public static void main(String[] args) {

		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		System.out.println(littlePrince.title);
		System.out.println(littlePrince.author);
		
		
		Book kong = new Book("콩쥐팥쥐"); 
		System.out.println(kong.title);
		System.out.println(kong.author);
		
		
	}
}
