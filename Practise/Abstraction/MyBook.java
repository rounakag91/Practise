package Abstraction;

public class MyBook extends Book {
	private int price;
	
	public MyBook(String title, String author, int price) {
		// TODO Auto-generated constructor stub
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " +title+ "\n"+
				"Author: " +author+ "\n"+
				"Price: " +price+ "\n");

	}

}
