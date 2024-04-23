package exerciseOne;

public class Main {
    public static void main(String[] args) {

        Cosmetics lipstick = new Cosmetics(20, "Red Velvet", "Aqua resist red lipstick", 10, "Red", 0.05);
        Cosmetics foundation = new Cosmetics(50, "Powder Foundation", "Medium coverage powder foundation", 8, "Beige", 0.3);
        Electronics laptop = new Electronics(3000, "MacBook Pro", "Powerful laptop for professionals", 2,
                "Laptop", 14.9, 9.8, 0.6, 1.5);
        Fridge samsungFridge = new Fridge(2700, "Samsung Smart Fridge", "Smart fridge with touchscreen", 1,
                "Smart Fridge", 70, 60, 200, 90, 4);

        // Display information about the products
        System.out.println("Product: " + lipstick.getName());
        System.out.println("Price: $" + lipstick.getPrice());
        System.out.println("Color: " + lipstick.getColor());
        System.out.println("Weight: " + lipstick.getWeight() + " grams");

        System.out.println("\nProduct: " + samsungFridge.getName());
        System.out.println("Price: $" + samsungFridge.getPrice());
        System.out.println("Type: " + samsungFridge.getType());
        System.out.println("Temperature: " + samsungFridge.getTemperature() + " °C");

        System.out.println("\nProduct: " + foundation.getName());
        System.out.println("Price: $" + foundation.getPrice());
        System.out.println("Color: " + foundation.getColor());
        System.out.println("Weight: " + foundation.getWeight() + " grams");

        System.out.println("\nProduct: " + laptop.getName());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Type: " + laptop.getType());
        System.out.println("Description: " + laptop.getDescription());
    }

}
