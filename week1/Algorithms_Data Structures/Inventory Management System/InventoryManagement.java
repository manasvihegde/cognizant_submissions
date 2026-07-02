public class InventoryManagement {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(
                new Product(101, "Laptop", 20, 50000));

        inventory.addProduct(
                new Product(102, "Mouse", 50, 500));

        inventory.addProduct(
                new Product(103, "Keyboard", 30, 1500));

        System.out.println("\nInventory:");

        inventory.displayProducts();

        inventory.updateProduct(102, 60, 550);

        System.out.println("\nAfter Update:");

        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\nAfter Delete:");

        inventory.displayProducts();
    }
}