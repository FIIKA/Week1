package introtojava;

public class Car {

			String color;
		    String brand;
		    double price;
		    // Fill in the code for Step 2
		
		
			public Car(String newcolor, String brand, double price) {
			// Fill in the code for Step 4
			this.color = newcolor;
			this.brand = brand;
			this.price = price;
			}
			
			public void printCar(){
			printCarDetails(color, brand, price);
			}
			
			//Step 5
			public void printCarDetails(String nameOfcolor, String nameOfbrand, double carPrice) {
			System.out.println("Car(" +
			       "color='" + nameOfcolor + '\'' +
			       ", brand='" + nameOfbrand + '\'' +
			       ", price=" + carPrice +
			       ')');
		}


}