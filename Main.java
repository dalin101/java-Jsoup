package edu.nccu.misds.stu105306064.hw10;

import java.io.IOException;
import java.util.Scanner;

public class Main 

{

	public static void main(String[] args) throws IOException 
	
	{
		Scanner in = new Scanner(System.in);
		String key = in.next();
		googleQuery gq = new googleQuery(key);
		gq.query();
	}

}
