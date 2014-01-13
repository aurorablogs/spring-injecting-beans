package com.aurorasolutions.springframework.beans;

public class SentenceWriter implements Writer{
	
	private int sentences = 0;
	
	public SentenceWriter(int sentences) {
		this.sentences = sentences;
	}
	
	public void write() {
		System.out.println("Writing " + sentences + " sentences.");
	}
	
}
