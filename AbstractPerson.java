package lesson11;

public abstract class AbstractPerson {

	public abstract String getGender(); //①public  ②abstract 

	public void speak() {
		System.out.println("I'm a" + getGender()); //③getGender()
	}
}
