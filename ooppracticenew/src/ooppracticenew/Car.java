package ooppracticenew;


public class Car extends Vehicle{

	public Car(String name, int i) {
		super(name, i);
	}

	@Override
	public void accelerate() {
    System.out.println("pressing gas \n" + "car is moving forward");
		
	}

	@Override
	public void braking() {
		
	}

	@Override
	public String toString() {
		return " Car Name=" + getName() + ", Year=" + getYear() + "\n";
			
	}
}