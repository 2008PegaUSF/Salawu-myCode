package com.bank.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Filing {

	public static void main(String[] args) throws IOException {
		//This is to create a text file name username to save our usernames into.
			
		
				File user = new File("user.txt");
				if (user.createNewFile()) {
					System.out.println("User profile: "+user.getName()+" has been created and ready for input");
				} else {
					System.out.println("User "+user.getName()+" already exists");
				}
		
		
		
			
			//This method writes into that user text file I just created	
			/*
				FileWriter myWriter = new FileWriter("user.txt");
				myWriter.write("This is where we will input the personal information for the user");
				myWriter.close();
				System.out.println("You have successfully created a user profile");
				
				
			*/
		
			
			
			//This method reads the content of the user text file I just wrote in the previous method
					
				File userFile = new File ("C:\\Users\\adesa\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\Mojid_JDBC_Console_Banking_Application\\user.txt");
				BufferedReader br = new BufferedReader (new FileReader(userFile));
				String st;
				while ((st = br.readLine()) != null)
					System.out.println(st);
			
				
				if (user.exists()) {
					System.out.println("Customer File: "+user.getName());
					System.out.println("Absolute Path: "+user.getAbsolutePath());
					System.out.println("Writeable: "+user.canWrite());
					System.out.println("Readable: " +user.canRead());
					System.out.println("File Size in bytes "+user.length());
				} else {
					System.out.println("The File Does Not Exist");
				}
		
		
		
		
		//To delete the user text file 
		/*File user = new File("user.txt");
		if(user.delete()) {
			System.out.println("User profile: "+user.getName()+" has been deleted");
		}else {
			System.out.println("An error occured while deleting user profile: "+user.getName());
		}
		*/
		}
}
