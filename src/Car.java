import java.util.Scanner;

public class Car {

	Scanner scan = new Scanner(System.in);
	private String model;
	private double topSpeed;
	private double price;
	private int modelYear;
	private Engine eng;

	Car(){
		this.eng = new Engine();
		System.out.print("Model Year: ");
		this.modelYear = scan.nextInt();
		System.out.print("Model: ");
		this.model = scan.next();
		System.out.print("Top Speed: ");
		this.topSpeed = scan.nextDouble();
		System.out.print("Price: ");
		this.price = scan.nextDouble();
		System.out.print("Volume of the engine: ");
		this.eng.setVolume(scan.nextDouble());
		System.out.print("How many cylinders: ");
		this.eng.setNumberOfCylinders(scan.nextInt());
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public void printInfo(){
		System.out.println("Car's detail: ");
		System.out.println("Model: " + getModel() + " Model Year: " + getModelYear() + " Top Speed: " + getTopSpeed()
		+" Price: " + getPrice());
		System.out.println("******************");
		System.out.println("Engine's detail: ");
		this.eng.printInfo();
	}

}
