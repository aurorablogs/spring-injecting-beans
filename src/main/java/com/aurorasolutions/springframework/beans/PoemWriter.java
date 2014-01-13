package com.aurorasolutions.springframework.beans;

/**
 * 
 * @author khobab
 *
 */
public class PoemWriter implements Writer{
	
	private String poetName;
	private Poem poem;
	
	public PoemWriter(String poetName, Poem poem) {
		this.poem = poem;
		this.poetName = poetName;
	}
	
	public void write() {
		poem.recite();
		System.out.println("\nThis poem has been written by " + poetName );
	}
	
}
