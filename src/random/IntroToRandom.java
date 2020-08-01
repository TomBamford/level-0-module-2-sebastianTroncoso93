//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		Random ran = new Random();
		int random = ran.nextInt(10);
		
		
		

		//4. Limit the random number between 0 and 100
		random = ran.nextInt(101);
		
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		random = ran.nextInt(51) + 25;
		
		//6. Challenge: Limit the random number between -222 and 88
		random = ran.nextInt(310) - 222;
		System.out.println(random);
		//1. Print out the value of r
		System.out.println(ran);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}