public class Test {
	public static void main(String[] args) {

		final int carSize = 1;              // Final variable for array.
		Car[] cars = new Car[carSize];      // Fixed sized array contains references to car objects.

		//Looping through the array to get the information from the user.
		for(int i = 0; i<cars.length; i++){
			System.out.println("Detail of the " +(i+1)+". car");
			cars[i] = new Car();
			System.out.println("-------------------------------------");
		}
		//Looping through the array to print the content of the array.
		for(int i = 0; i<cars.length; i++){
			cars[i].printInfo();
			System.out.println("-------------------------------------");
		}
	}
}
