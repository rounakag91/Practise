package Abstraction;

import java.util.Scanner;

public class Run {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String title = scanner.nextLine();
	        String author = scanner.nextLine();
	        int price = scanner.nextInt();
	        scanner.close();

	        Book book = new MyBook(title, author, price);
	        book.display();
	    }
	}
