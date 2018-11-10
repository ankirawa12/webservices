package hello;



public class Palindrome {





private String word;

private boolean Ispalindrome;

private boolean Isanagram;





public void setWord(String word) {

	this.word = word;

}

public void setIspalindrome(boolean ispalindrome) {

	Ispalindrome = ispalindrome;

}

public void setIsanabol(boolean isanagram) {

	Isanagram = isanagram;

}



public String getWord() {

	return word;

}

public boolean isIspalindrome() {

	return Ispalindrome;

}

public boolean isIsanagram() {

	return Isanagram;

}

	public Palindrome(String word, boolean ispalindrome, boolean isanagram) {

		super();

		this.word = word;

		Ispalindrome = ispalindrome;

		Isanagram = isanagram;

	}





}

