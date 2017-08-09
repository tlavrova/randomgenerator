package com.github.tlavrova.randomgenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static spark.Spark.*;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * Random number generator
 * Generate random integers in a certain range.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	get("/hello", (req, res) -> {
    		Map<String, Object> attributes = new HashMap<>();
    		String min = req.queryParamOrDefault("min", "1");
    		String max = req.queryParamOrDefault("max", "100");
    		attributes.put("min", min);
    		attributes.put("max", max);
    		Random random = new Random();
    		int minInt = Integer.parseInt(min);
    		int maxInt = Integer.parseInt(max);
    		int randomNumber = getRandomInteger(minInt, maxInt, random);
    		attributes.put("randomNumber", randomNumber);
    		return new ModelAndView(attributes, "hello.ftl");
    	} , new FreeMarkerEngine());
    }

	private static int getRandomInteger(int start, int end, Random random) {
		if (start > end) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		int range = end - start + 1;
		//compute a randomNumber of the range, 0 <= randomNumber < range
		int randomNumber = random.nextInt(range);
		return start + randomNumber;
	}
	
}
