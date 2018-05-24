package Abstraction.Example;


/** Subclass of Canine **/
class SiberianHusky extends Canine{ 

	/** Parameterized Constuctor **/
  SiberianHusky(String name, String color, int age, char mF){ // Constructor
      super(name, color, age, mF); 
  }
  
  
  /** Abstract method implementation
  *   @return "Siberian Husky" **/
  
  String getBreed(){ // abstract method implementation
      return "Siberian Husky";
  }
}