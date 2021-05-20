package ooppracticenew;

public abstract class Vehicle extends Garage{
	
	private String name;
	private int year;
	
	public Vehicle (String name, int year) {
		this.setName(name);
		this.setYear(year);
		
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
}