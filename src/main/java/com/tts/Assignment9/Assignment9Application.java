package com.tts.Assignment9;
import java.util.Scanner;


public class Assignment9Application {
	public static void main(String[] args) {

//		printing out uninitialized fields
//		System.out.println(newStringInput);

		int var1 = 4;
		String newVar = "string";
//		int a = "don't use single letter variables";


		System.out.println(var1);
		System.out.println(newVar);

		Scanner input = new Scanner(System.in);
		System.out.println("\nWhat is your variable name?");
		//String !stringInput = input.nextLine(); <- invalid string name
		String newStringInput = input.nextLine();
		System.out.println(newStringInput);

		//OTHER COMMON ERRORS
//		_________________________________________________________________________________________________?

		//... is expected. (missing semicolon)
//		int noSemicolon = 23

		//unclosed string literal. (string doesnt end in ")
//		str stringA= "missing end quotes;

		//missing brackets
		/*
		Thread stopper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(RECORD_TIME);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				recorder.finish();

			});
		* */

	}
}
