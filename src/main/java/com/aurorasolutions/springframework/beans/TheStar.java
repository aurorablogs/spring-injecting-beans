package com.aurorasolutions.springframework.beans;

/**
 * 
 * @author khobab
 *
 */
public class TheStar implements Poem{
	private static String[] POEM = {
		"Twinkle twinkle little star,",
		"How I wonder what you are,",
		"Up above the world so high,",
		"Like a diamond in the sky"
	};
	
	public void recite() {
		for(String verse : POEM) {
			System.out.println(verse);
		}
	}
	
}
