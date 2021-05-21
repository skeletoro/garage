package ooppracticenew;

public abstract class Vehicle {

	private int vehicleId;
	private String name;
	private int year;
	public double value;

	public Vehicle(int vehicleId, String name, int year, double value) {
		this.setVehicleId(vehicleId);
		this.setName(name);
		this.setYear(year);
		this.setValue(value);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public abstract void accelerate();

	public abstract void braking();

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
}