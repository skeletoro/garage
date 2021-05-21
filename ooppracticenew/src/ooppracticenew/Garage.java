package ooppracticenew;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> contents = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		contents.add(v);
		System.out.println("this Vehicle" + v + " is added");
	}

	public void printContents() {
		
		
		if (contents.isEmpty()) {
			System.out.println("sorry there are no vehicles in the garage at this time");
			
		} else {
			System.out.println("\n here are the vehicles present in garage \n");
			for (Vehicle v : contents) {
				System.out.println(v);
			}
			
		}
	}

	public double vehicleValue(Vehicle v) {
		double value = v.getValue();
		return value;

	}

	public void calculateBill() {
		double total = 0;
		for (Vehicle v : contents) {
			total = total + v.getValue();

		}
		System.out.println("your total invoice for work completed is: $" + total);
	}

	public void removeVehicle(Vehicle a) {
		contents.remove(a);
		System.out.println("this Vehicle: " + a + "is removed from service Garage");
	}

	public void emptyGarage() {
		contents.clear();
		System.out.println("all vehicles have been removed from the garage.");
	}

}
