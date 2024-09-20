import java.util.Scanner;

public class Carr {

    private String brand;
    private String model;
    private int year;
    private String color;

    public Carr(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " \nengine started.");
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + " \nengine stopped.");
    }

    public void displayInfo() {
        System.out.println("\nCar Info: " + year + " " + brand + " " + model + " (" + color + ")");
    }

    public void compareAge(Carr otherCar) {
        if (this.year > otherCar.getYear()) {
            System.out.println(this.brand + " " + this.model + " is newer than " + otherCar.getBrand() + " "
                    + otherCar.getModel());
        } else if (this.year < otherCar.getYear()) {
            System.out.println(this.brand + " " + this.model + " is older than " + otherCar.getBrand() + " "
                    + otherCar.getModel());
        } else {
            System.out.println(this.brand + " " + this.model + " and " + otherCar.getBrand() + " " + otherCar.getModel()
                    + " are of the same age.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Enter the number of cars: ");
        int numCars = scanner.nextInt();
        Carr[] cars = new Carr[numCars];

        for (int i = 0; i < numCars; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            System.out.print("Color: ");
            String color = scanner.next();

            cars[i] = new Carr(brand, model, year, color);
        }

        for (Carr car : cars) {
            car.startEngine();
            car.displayInfo();
            car.stopEngine();
        }

        if (numCars > 1) {
            System.out.println("\nComparing the age of the first two cars:");
            cars[0].compareAge(cars[1]);
        }

        scanner.close();
    }
}