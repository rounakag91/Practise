package Exceptions.Example;

import java.util.*;

class Sample2{
    LinkedList<String> list;
    int[] intArray = new int[4];
    
    // For testing Null Pointer Exception
    Sample2(){
        this.list = null;
    }
    
    // For testing Index Out of Bounds
    Sample2(String str){
        this.list = new LinkedList<String>();
        list.add(str);
    }
    
    void exceptionDemo(int i, String str){
        
        try{
            // throws ArrayIndexOutOfBoundsException if index > intArray.length
            int myInt = intArray[i];
            
            // throws a NullPointerException if 'list' doesn't point to an actual list object
            list.indexOf(str);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println( "The following index is out-of-bounds: " + e.getMessage() );
        }
        catch(NullPointerException e){
            System.err.println( "Oh no! You tried to perform an operation on an object whose value is null!" );
        }
        finally{
            System.out.println("This is printing regardless of whether or not the program finishes executing.");
        }
        System.out.println("The program was able to continue execution!\n");
        
    }
    
    public static void main(String[] args) {
        // creates a Solution object whose 'list' instance variable points to null:
    	Sample2 sNullList = new Sample2();
        // attempt to access an element of the null list, throws Exception
        sNullList.exceptionDemo(1, "x");
        
        // creates a Solution object whose 'list' instance variable points to a list containing 1 element ("x"):
        Sample2 sNotNullList = new Sample2("x");
        // attempt to access an invalid index of 'intArray' instance variable, throws Exception
        sNotNullList.exceptionDemo(100, "x");
    }
}