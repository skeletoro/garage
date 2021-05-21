package ooppracticenew;

public class Boat extends Vehicle {

	public Boat(int boatId, String name, int year, double value) {
		super(boatId, name, year, value);
		this.value = value * .25;
	}

	@Override
	public void accelerate() {

	}

	@Override
	public void braking() {

	}

	@Override
	public String toString() {
		return "[(Boat Name = " + getName() + "), (Year = " + getYear() + "), (invoice amount = $" + getValue()
				+ ")]\n";
	}

}
