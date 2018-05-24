package Abstraction.Example;

//** Subclass of Canine **/
class KleeKai extends Canine{
	/** Parameterized Constuctor **/
KleeKai(String name, String color, int age, char mF){ 
    super(name, color, age, mF); 
}

/** Abstract method implementation
*   @return "Klee Kai" **/
String getBreed(){ // abstract method implementation
    return "Klee Kai";
}
}