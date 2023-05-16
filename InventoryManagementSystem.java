import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagementSystem {
    // Create an ArrayList to store inventory items
    private ArrayList<InventoryItem> inventory;

    // Constructor to initialize the inventory ArrayList
    public InventoryManagementSystem() {
        inventory = new ArrayList<>();
    }

    // Method to add a new item to the inventory
    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item description: ");
        String description = scanner.nextLine();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        // Create a new inventory item and add it to the inventory ArrayList
        InventoryItem newItem = new InventoryItem(name, description, quantity, price);
        inventory.add(newItem);

        System.out.println("Item added to inventory.");
    }

    // Method to remove an item from the inventory
    public void removeItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();

        // Iterate over the inventory ArrayList and remove the item with the specified name
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                inventory.remove(item);
                System.out.println("Item removed from inventory.");
                return;
            }
        }

        System.out.println("Item not found in inventory.");
    }

    // Method to update an item in the inventory
    public void updateItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name to update: ");
        String name = scanner.nextLine();

        // Iterate over the inventory ArrayList and update the item with the specified name
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                System.out.print("Enter new item name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new item description: ");
                String newDescription = scanner.nextLine();
                System.out.print("Enter new item quantity: ");
                int newQuantity = scanner.nextInt();
                System.out.print("Enter new item price: ");
                double newPrice = scanner.nextDouble();

                // Update the existing inventory item with the new values
                item.setName(newName);
                item.setDescription(newDescription);
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);

                System.out.println("Item updated in inventory.");
                return;
            }
        }

        System.out.println("Item not found in inventory.");
    }

    // Method to display all items in the inventory
    public void displayItems() {
        if (inventory.size() == 0) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (InventoryItem item : inventory) {
                System.out.println(item.toString());
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Show the main menu and ask for user input
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Update item");
            System.out.println("4. Display items");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            switch (option) {
            case 1:
            inventorySystem.addItem();
            break;
            case 2:
            inventorySystem.removeItem();
            break;
            case 3:
            inventorySystem.updateItem();
            break;
            case 4:
            inventorySystem.displayItems();
            break;
            case 5:
            System.exit(0);
            break;
            default:
            System.out.println("Invalid option.");
            }
            }     
            }
            }

            class InventoryItem {
                private String name;
                private String description;
                private int quantity;
                private double price;
            
                // Constructor
                public InventoryItem(String name, String description, int quantity, double price) {
                    this.name = name;
                    this.description = description;
                    this.quantity = quantity;
                    this.price = price;
                }
            
                // Getters and Setters
                public String getName() {
                    return name;
                }
            
                public void setName(String name) {
                    this.name = name;
                }
            
                public String getDescription() {
                    return description;
                }
            
                public void setDescription(String description) {
                    this.description = description;
                }
            
                public int getQuantity() {
                    return quantity;
                }
            
                public void setQuantity(int quantity) {
                    this.quantity = quantity;
                }
            
                public double getPrice() {
                    return price;
                }
            
                public void setPrice(double price) {
                    this.price = price;
                }
            
                // toString method to display item details
                @Override
                public String toString() {
                    return "Name: " + name +
                            ", Description: " + description +
                            ", Quantity: " + quantity +
                            ", Price: $" + price;
                }
            }