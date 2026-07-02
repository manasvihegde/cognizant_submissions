public class OrderSorting {

    // Bubble Sort
    static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    static void quickSort(Order[] orders, int low, int high) {

        if(low < high) {

            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {

        double pivot = orders[high].totalPrice;

        int i = low - 1;

        for(int j = low; j < high; j++) {

            if(orders[j].totalPrice < pivot) {

                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    static void display(Order[] orders) {

        for(Order o : orders) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(1,"Rahul",1200),
                new Order(2,"Priya",4500),
                new Order(3,"Ankit",2500),
                new Order(4,"Neha",7000)
        };

        System.out.println("Before Sorting:");
        display(orders);

        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        display(orders);

        Order[] orders2 = {
                new Order(1,"Rahul",1200),
                new Order(2,"Priya",4500),
                new Order(3,"Ankit",2500),
                new Order(4,"Neha",7000)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        display(orders2);
    }
}