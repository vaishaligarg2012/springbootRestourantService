package com.infogain.restaurant.configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//public class ExceptionDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     TestEx obj = new TestEx();
//     obj.catchException();
//	}
//
//}
//
//
//class TestEx{
//	
//	 public int catchException() throws Ty{
//		 return 1/0;
//	 }
//	 
//	 public int cc() {
//		 
//		 String s = "gg";
//		 Integer i = (Integer)s;
//	 }
//}

public class Main { 
    public static void main(String[] args) throws IOException  { 
    	//C:\Users\vaishali.garg\Documents\ll.txt
    	System.out.println(System.getProperty("user.home")); 
    	String filePath = System.getProperty("user.home")+"\\Documents";
    	System.out.println("filePath :"+filePath); // C:\Users\vaishali.garg
    	File f1 = new File(filePath);
    	
    	if(f1.isDirectory()) {
    		
    		System.out.println("directory found");
    	}else {
    		System.out.println("directory not  found");
    		
    	}
    	filePath =filePath+"//File.txt";
    	f1 = new File(filePath);
if(f1.isFile()) {
    		
    		System.out.println("22 directory found");
    	}else {
    		System.out.println("22 directory not  found");
    		
    	}
    	System.out.println(f1.getAbsolutePath());
    	System.out.println("File Found :"+f1.exists());
        FileReader file = new FileReader(f1);  
       
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
    } 
} 
