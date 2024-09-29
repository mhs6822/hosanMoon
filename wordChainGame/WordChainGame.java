package wordChainGame;

import java.util.Scanner;

//encapsulation
class Player {
	private String name = "";    
	private String inputWord = "";
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public String getWordFromPlayer(Scanner sc) {
		System.out.println(name + ">> ");
		inputWord = sc.nextLine();
		return inputWord;
	}
	public boolean checkSuccess(String lastWord) {
		boolean result = false;
		int lastIdx = lastWord.length() - 1;
		char lastChar = lastWord.charAt(lastIdx);
		char firstChar = inputWord.charAt(0);
		if(lastChar == firstChar) {
			System.out.println("Correct !");
			result = true;
		}
		return result;
	}
}

class WordChainGameApp {
	Player[] p;
	Scanner sc = new Scanner(System.in);
	
	void setPlayer() {
		System.out.println("Number of Player >> ");
		int num = Integer.parseInt(sc.nextLine());
		p = new Player[num];   // create array instance 
		for(int i=0; i<p.length; i++) {
			p[i] = new Player();
			System.out.println("input name of player >> ");
			String name = sc.nextLine();
			p[i].setName(name);
		}
	}
	
	void run() {
		System.out.println("Play Word Chain Game !");
		setPlayer();
		String startWord = "Car";
		System.out.println("Start Word is " + startWord + "!");
		String lastWord = startWord;
		int idx = 0;
		while(true) {
			String newWord = p[idx].getWordFromPlayer(sc);
			boolean result = p[idx].checkSuccess(lastWord);
			if(!result) {
				System.out.println("Game over ! " +  "\n" + p[idx].getName() + " lost game !");
				break;
			}
			idx++;
			idx %= p.length;   // repeat Player
			lastWord = newWord;
		}
		sc.close();
		
	}
}

public class WordChainGame {

	public static void main(String[] args) {

		WordChainGameApp game = new WordChainGameApp();
		game.run();
	}
}
