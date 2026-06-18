import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    // Linear Search
    public static Product2 linearSearch(Product2[] products, String name) {

        for(Product2 p : products) {

            if(p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }

    // Binary Search
    public static Product2 binarySearch(Product2[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                    products[mid].productName.compareToIgnoreCase(name);

            if(result == 0) {
                return products[mid];
            }

            else if(result < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product2[] products = {

                new Product2(101, "Laptop", "Electronics"),
                new Product2(102, "Mouse", "Accessories"),
                new Product2(103, "Keyboard", "Accessories"),
                new Product2(104, "Monitor", "Electronics"),
                new Product2(105, "Speaker", "Audio")
        };

        System.out.println("Linear Search:");

        Product2 result1 =
                linearSearch(products, "Monitor");

        if(result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        // Sort array for Binary Search
        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search:");

        Product2 result2 =
                binarySearch(products, "Monitor");

        if(result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}