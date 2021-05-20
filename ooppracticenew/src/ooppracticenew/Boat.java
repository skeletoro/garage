package ooppracticenew;

public class Boat extends Vehicle {

	public Boat(String name, int year) {
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
		return "Boat Name=" + getName() + ", Year=" + getYear() ;
	}

}
