package com.gmail.klewzow;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		TextClass tc = new TextClass("One", "Two", "Three", "Four", "Five");
		SerialisableClass<TextClass> sc = new SerialisableClass<TextClass>(tc,new File("text.txt"));
        sc.save();
			 
        TextClass tcLoad = sc.load();	
        System.out.println(tcLoad);
	}

}
