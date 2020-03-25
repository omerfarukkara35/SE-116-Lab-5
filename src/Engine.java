public class Engine {

	private double volume ;
	private int numberOfCylinders;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public void printInfo(){
		System.out.println("Volume: " + getVolume() +" Number of cylinders: " + getNumberOfCylinders());
	}

}
