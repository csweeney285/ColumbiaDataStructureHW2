/*Conor Sweeney
 * cjs2201
 * FindPalindromes.java
*/

//import appropriate files
//scanner is needed to turn the .txt file into strings
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//create custom FindPalindromes class
public class FindPalindromes {

	//scanner is needed to convert .txt to strings for use
	private static Scanner scanner;

	//run the method within declaring the class
	public static <Char> void main(String[] args) throws FileNotFoundException {

		scanner = new Scanner(new File("palindromes.txt"));
		
		//loop to scan and check each line separately
		while(scanner.hasNextLine()){
			
			//create instance variable of the original line
			String tempPalindromeString = scanner.nextLine();
			
			//remove all punctuation from the original palindrome
			String noPunctuationPalindromeString = tempPalindromeString.toLowerCase().replaceAll("\\W", "");
			
			//Get string length to declare stack size and set loop limits
			int n = noPunctuationPalindromeString.length();
			
			//Create instance of my custom MyStack Class
			MyStack<Character> stack = new MyStack<Character>(n);
			
			//push every character of the string into the stack
			for (int i = 0; i < n; i++) {
	            stack.push(noPunctuationPalindromeString.charAt(i));
	        }
			
			//declare a reverse string with no characters outside of the while loop so it can be added to
			String reverseString="";
			
			//pop half the stack to increase efficiency add add to the reversestring
			for(int x = 0; x < n/2; x++){
	            reverseString = reverseString+stack.pop();
			}
			
			//divide palindrome string without punctuation in half to increase efficiency
			noPunctuationPalindromeString = noPunctuationPalindromeString.substring(0, n/2);

			//using half strings compare the string to its reverse and print out the results
			if (noPunctuationPalindromeString.equals(reverseString)){
		    	 System.out.println("\""+tempPalindromeString+"\""+" is a palindrome.");
			}
			else{
				System.out.println("\""+tempPalindromeString+"\""+" is not a palindrome.");
			}
		}		
	}
}