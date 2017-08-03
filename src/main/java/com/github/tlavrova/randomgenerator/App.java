package com.github.tlavrova.randomgenerator;

import static spark.Spark.*;

import java.util.Random;

/**
 * Random number generator
 * Generate random integers in a certain range.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	get("/hello", (req, res) -> "Hello Tatiana");
    	log("Generating random integers in the range 1..10");
    	int START = 1;
    	int END = 10;
    	Random random = new Random();
    	for (int idx = 1; idx <= 10; ++idx) {
    		showRandomInteger(START, END, random);
    	}
    	log("Done.");
    }

	private static void showRandomInteger(int sTART, int eND, Random random) {
		if (sTART > eND) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		//get the range, casting to long to avoid overflow problems
		long range = (long)eND - (long)sTART + 1;
		//compute a fraction of the range, 0 <= frac <= range
		long fraction = (long)(range * random.nextDouble());
		int randomNumber = (int)(fraction + sTART);
		log("Generated: " + randomNumber);
	}
	
	private static void log(String string) {
		System.out.println(string);		
	}
}
