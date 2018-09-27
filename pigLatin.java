/*
 * Mission04Assignment.java
 * 
 * Copyright 2018 Boured <boured@boured_laptop>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner; //Imports Scanner for user input


public class pigLatin {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); //Create scanner for user input
		String tobetranslated = ""; //Creates and initializes string to take user input
		int qnotpressed = 0; //Creates and initializes flag to manage while loop.
		System.out.println("Welcome to the Pig Latin Translator!"); //Prints out a message greeting a user to the program.
		
		while(qnotpressed == 0) //Begin while loop that one end till q is pressed.
		{
			System.out.println("Type a word to be translated (Q to quit)"); //Prompts the user to enter a word.
			tobetranslated=input.nextLine(); //Puts word entered into tobetranslated String
			
			if(tobetranslated.equals("Q") || tobetranslated.equals("q")) //Quit check
			{
				break; //Breaks the loop.
			}
			
			
			System.out.println("Your pig latin translation is " + translate(tobetranslated)); //Prints out translated word after translation
			
		}
	} //End of main loop and program.

	//Start translation method
	public static String translate (String translate){
		int lettercount = translate.length();//Creates int with value based on entered words number of characters.
		StringBuilder stringbuild = new StringBuilder(translate);//Create springbuilder for use with strings.
		//For Debug
		//System.out.println(lettercount);
		
		for(int i = 0; i < lettercount; i++) //If loop which translates the text.
		{
			char letter = translate.charAt(i); //Allows reading of letters
			char first = translate.charAt(0); //Takes first letter of word
			first = Character.toLowerCase(first); //converts first letter to lowercase.
			String beforevowel = translate.substring(0,i); //Records letters until vowel is read
			
			//For Debug
			//System.out.println(beforevowel);
			
			
			if(first=='a' || first=='e' || first=='i' || first=='o' || first=='u')
			{
				String translated = translate + "way"; //Adds way at the end.
				return translated;//Returns the word + way
			}
			
			
			
			
			if(letter =='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') //Checks if every letter equals a vowel until it does.
			{
				
				stringbuild = stringbuild.deleteCharAt(0); //Deletes the first letter off the word
				String translated = stringbuild + "" + beforevowel + "ay"; //Creates translated word
				return translated; //Returns said translated word allowing user to see their translated word.
			
			}
			
			
		} 
		
		
		
		return translate; //Litirally put just to make it compile lol
	} //End of method.








}

