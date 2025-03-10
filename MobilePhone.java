import java.util.Scanner;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayPhoneDetails() {
        System.out.println("\n----- Mobile Phone Details -----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mobile phone brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter mobile phone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter mobile phone price: ");
        double price = scanner.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayPhoneDetails();

        scanner.close();
    }
}
