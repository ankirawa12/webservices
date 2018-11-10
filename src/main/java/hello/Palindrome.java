package hello;

public class Palindrome {


private String word;
private boolean Ispalindrome;
private boolean Isanabol;


public void setWord(String word) {
	this.word = word;
}
public void setIspalindrome(boolean ispalindrome) {
	Ispalindrome = ispalindrome;
}
public void setIsanabol(boolean isanabol) {
	Isanabol = isanabol;
}

public String getWord() {
	return word;
}
public boolean isIspalindrome() {
	return Ispalindrome;
}
public boolean isIsanabol() {
	return Isanabol;
}
	public Palindrome(String word, boolean ispalindrome, boolean isanabol) {
		super();
		this.word = word;
		Ispalindrome = ispalindrome;
		Isanabol = isanabol;
	}


}


