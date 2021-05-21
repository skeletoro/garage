package ooppracticenew;

public class Car extends Vehicle {

	public Car(int carId, String name, int year, double value) {
		super(carId, name, year, value);
		this.value = value * .2;
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
		return "[(Car Name= " + getName() + "), (Year = " + getYear() + "), (invoice amount = $" + getValue() + ")]\n";

	}
}