package hello;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

	

    @RequestMapping("/words/{word}")
    public Palindrome palindrome(@PathVariable("word") String word,boolean Ispalindrome, boolean Isanabol)
    {
    	
    String revstring="";
    char[] ch =word.toCharArray();
    for(int i=ch.length-1;i>=0;i--)
    {
    	revstring=revstring+ch[i];
    }
    
    if(word.equals(revstring)) {
    	Ispalindrome= true;
    } else {
     Ispalindrome= false;
    }
    
    
    
    if( checkPalindrome(word) )
    	Isanabol= true;
       

    else

    	Isanabol= false;
    return new Palindrome (word, Ispalindrome, Isanabol );
   }

    
    
    public static boolean checkPalindrome(String wo)

    {
    int [] count = new int[26];
    for( int i = 0; i < wo.length(); i++ )
    {
        char c = wo.charAt(i);
        count[c-'a']++;
    }
int oddOccur = 0;
    for( int cn:count )
 

        {

            if( oddOccur > 1)

                return false;

            if( cn%2 == 1 )

                oddOccur++;

        }
    	return true;

    }}

 

  

    

    

    




