package ooppracticenew;

public class Motorcycle extends Vehicle {

	public Motorcycle(int motorcycleId, String name, int year, double value) {
		super(motorcycleId, name, year, value);
		this.value = value * .3;
	}

	@Override
	public void accelerate() {

	}

	@Override
	public void braking() {

	}

	@Override
	public String toString() {
		return "[(Motorcycle Name = " + getName() + "), (Year = " + getYear() + "), (invoice amount = $" + getValue() + ")]\n";

	}

}