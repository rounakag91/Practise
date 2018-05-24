package Ongoing;

// Subclass
class MySubclass extends MySuperclass{
    MySubclass(String myString) {
        // A behind-the-scenes implicit call to the 
        // superclass' default constructor happens
    	
    	//super(myString);
        
    	
    	 // Subclass can now initialize superclass instance variable:
        this.myString = myString; 
        System.out.println("2. "+myString);

    }

    public static void main(String[] args) {
        MySuperclass s1 = new MySubclass("Hello, World!");
        System.out.println(s1.myString);

        MySubclass s2 = new MySubclass("Hello, World.");
        System.out.println(s2.myString);
    }
}