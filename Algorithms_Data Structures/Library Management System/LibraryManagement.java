import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {

    static Book linearSearch(Book[] books, String title) {

        for(Book b : books) {

            if(b.title.equalsIgnoreCase(title))
                return b;
        }

        return null;
    }

    static Book binarySearch(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                books[mid].title.compareToIgnoreCase(title);

            if(result == 0)
                return books[mid];

            else if(result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book(1,"Java","James Gosling"),
            new Book(2,"Python","Guido"),
            new Book(3,"C Programming","Dennis"),
            new Book(4,"Data Structures","Mark")
        };

        System.out.println("Linear Search:");
        System.out.println(
            linearSearch(books,"Python"));

        Arrays.sort(books,
            Comparator.comparing(b -> b.title));

        System.out.println("\nBinary Search:");
        System.out.println(
            binarySearch(books,"Python"));
    }
}