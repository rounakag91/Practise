package Ongoing;

// Superclass
class MySuperclass {
    // Superclass' instance variable:
    String myString;

    // Superclass' default (empty) constructor:
    MySuperclass() {} 

    // Superclass' parameterized constructor:
    MySuperclass(String myString) { 
        // Initialize instance variable
        this.myString = myString; 
        System.out.println("1. "+myString);

    }
}

