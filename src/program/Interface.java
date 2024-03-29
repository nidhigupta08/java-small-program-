package program;

//Interface
interface Animal3 {
public void animalSound(); // interface method (does not have a body)

public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig1 implements Animal3 {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}

public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
}

public class Interface {
	public static void main(String[] args) {
		 Pig1 myPig = new Pig1();  // Create a Pig object
		 myPig.animalSound();
		 myPig.sleep();
		}
	

}
