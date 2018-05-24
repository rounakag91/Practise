package Inheritance;

class Student extends Person{
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		// TODO Auto-generated constructor stub
		/*this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;*/
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	
	public Character calculate() {
		
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i=0; i<testScores.length; i++)
		{
			sum += testScores[i];
		}
		int average = sum/testScores.length;
		
		if(average>=90 && average<=100)
			return 'O';
		else if(average>=80 && average<90)
			return 'E';
		else if(average>=70 && average<80)
			return 'A';
		else if(average>=55 && average<70)
			return 'P';
		else if(average>=40 && average<55)
			return 'D';
		else
			return 'T';
	}

}
