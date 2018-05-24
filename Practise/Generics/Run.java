package Generics;

import java.util.Scanner;

public class Run {
	    
	    public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Integer[] intArray = new Integer[n];
	        for (int i = 0; i < n; i++) {
	            intArray[i] = scanner.nextInt();
	        }

	        n = scanner.nextInt();
	        String[] stringArray = new String[n];
	        for (int i = 0; i < n; i++) {
	            stringArray[i] = scanner.next();
	        }
	        
	        PrintArray<Integer> intPrintArray = new PrintArray<Integer>();
	        PrintArray<String> stringPrintArray = new PrintArray<String>();
	        intPrintArray.printArray( intArray  );
	        stringPrintArray.printArray( stringArray );
	        if(PrintArray.class.getDeclaredMethods().length > 1){
	            System.out.println("The PrintArray class should only have 1 method named printArray.");
	        }
	    } 
	}