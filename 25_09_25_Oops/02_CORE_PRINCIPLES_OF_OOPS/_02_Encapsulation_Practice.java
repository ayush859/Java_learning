import java.util.*;

class Book {
    private List<String> titles;
    private List<String> authors;
    private List<Boolean> isAvailable;

    Book(List<String> titles, List<String> authors, List<Boolean> isAvailable) {
        this.titles = titles;
        this.authors = authors;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    isAvailable.set(i, false);
                    System.out.println("Book Borrowed: " + titles.get(i) + " by " + authors.get(i));
                    return;
                } else {
                    System.out.println("Book is not available.");
                    return;
                }
            }
        }
        System.out.println("Book is not available.");
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(bookName)) {
                if (!isAvailable.get(i)) {
                    isAvailable.set(i, true);
                    System.out.println("Book Returned: " + titles.get(i) + " by " + authors.get(i));

                    return;
                }
            }
        }
    }

    public void getAvailability(String bookName) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

}

// This is the driver code that will execute and demonstrate the functionality
// of your `Book` class.

// It creates a object of class `Book`, the parameterised constructor sets the
// values of titles, authors, isAvailable attributes.
// It iterates over the methodCalls array and calls methods corresponding the
// operation type

// Main class to demonstrate the functionality of the Student class
public class _02_Encapsulation_Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> titles = Arrays.asList("Sherlock_Holmes", "Frankenstein", "King_Arthur_and_the_Round_Table",
                "Treasure_Island");

        List<String> authors = Arrays.asList("Arthur_Conan_Doyle", "Mary_Shelley", "Roger_Lancelyn_Green",
                "Robert_Louis_Stevenson");

        List<Boolean> isAvailable = Arrays.asList(false, true, false, false);

        // Create book object using parameterised Constructor to initialize the
        // attributes
        Book book = new Book(titles, authors, isAvailable);

        // methodCalls
        book.borrowBook("Frankenstein"); // Valid borrow
        book.borrowBook("Sherlock_Holmes"); // Not available
        book.returnBook("King_Arthur_and_the_Round_Table"); // Return
        book.getAvailability("Sherlock_Holmes"); // Should be false
        book.borrowBook("Frankenstein"); // Already borrowed

        sc.close();
    }

}

// Below are the output statements

// System.out.println("false");
// System.out.println("true");
// System.out.println("Book is not available.");
