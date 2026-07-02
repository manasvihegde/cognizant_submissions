import java.util.HashMap;

class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        products.put(product.productId, product);
        System.out.println("Product Added");
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {

        if(products.containsKey(id)) {

            Product p = products.get(id);

            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated");
        }
        else {
            System.out.println("Product Not Found");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if(products.remove(id) != null)
            System.out.println("Product Deleted");
        else
            System.out.println("Product Not Found");
    }

    // Display Products
    public void displayProducts() {

        for(Product p : products.values()) {
            System.out.println(p);
        }
    }
}