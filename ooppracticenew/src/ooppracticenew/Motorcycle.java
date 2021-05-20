package ooppracticenew;


public class Motorcycle extends Vehicle {

	public Motorcycle(String name, int year) {
		super(name, year);

	}

	@Override
	public void accelerate() {

		
	}

	@Override
	public void braking() {

		
	}

	@Override
	public String toString() {
		return "Motorcycle Name=" + getName() + ", Year=" + getYear() + "\n";
		
	}

}