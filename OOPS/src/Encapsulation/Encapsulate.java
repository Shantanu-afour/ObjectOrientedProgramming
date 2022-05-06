package Encapsulation;

public class Encapsulate {
	private String name;
	private int roll;
	private int age;

	
	public int getAge() { 
		return age; 
	}

	
	public String getName() { 
		return name; 
	}

	public int getRoll() { 
		return roll; 
	}

	
	public void setAge(int newAge) { 
		age = newAge; 
	}

	
	public void setName(String newName)
	{
		name = newName;
	}

	public void setRoll(int newRoll) {
		roll = newRoll; 
	}
}

