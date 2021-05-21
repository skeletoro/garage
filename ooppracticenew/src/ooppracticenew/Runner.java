package ooppracticenew;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Garage A1 = new Garage();
		Car a = new Car(0001, "Volkswagen", 2013, 25000);
		Motorcycle b = new Motorcycle(0002, "Ducati", 2014, 1000);
		Boat c = new Boat(0003, "Chris Craft", 2010, 50000);

		A1.addVehicle(a);
		A1.addVehicle(b);
		A1.addVehicle(c);

	//	 A1.removeVehicle(a);
		// A1.emptyGarage();
		A1.printContents();
	//	A1.calculateBill();
	}

}