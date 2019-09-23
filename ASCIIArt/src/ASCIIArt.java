/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String [] args) {
		speechBubbles();
		friends();
		grass();
		caption(); 
	}
	public static void speechBubbles() {
		System.out.println("(_\"Hi!\"_)(_\"How are you?\"_)");
		System.out.println("    V      V ");
	}
	public static void friends() {
		System.out.println("  O      __     ");
		System.out.println(" (^^)  /(^^)\\   /\\");
		System.out.println(" \\||/   \\||/   //\\\\");
		System.out.println(" /  \\   /  \\  ///\\\\\\");
	}
	public static void grass() {
		System.out.println("^^^^^====^^^^^^^^^^^^^");
		System.out.println("^^^^^====^^^^^^^^^^^^^");
	}
		
	public static void caption() {
		System.out.println("Two friends greet each other in a field. ");
	}
}