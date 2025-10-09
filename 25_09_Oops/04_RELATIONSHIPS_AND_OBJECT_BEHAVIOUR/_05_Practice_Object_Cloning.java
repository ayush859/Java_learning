import java.util.*;

class Book {
    protected String title;
    protected String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}

class Library {

    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    Library shallowClone() {
        Library newLibrary = new Library(this.name);
        newLibrary.books = this.books;
        return newLibrary;
    }

    Library deepClone() {
        Library newLibrary = new Library(this.name);
        for (Book book : books) {
            newLibrary.addBook(new Book(book.title, book.author));
        }
        return newLibrary;
    }

    void display() {
        System.out.println("Library : " + name);
        for (Book book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }

    List<Book> getBooks() {
        return books;
    }

}

class _05_Practice_Object_Cloning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter library name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of books: ");
        int x = scanner.nextInt();
        scanner.nextLine();

        List<String> titles = new ArrayList<>();
        List<String> authors = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            titles.add(scanner.nextLine());
            System.out.print("Enter author of book " + (i + 1) + ": ");
            authors.add(scanner.nextLine());
        }

        Library library = new Library(name);
        for (int j = 0; j < x; j++) {
            library.addBook(new Book(titles.get(j), authors.get(j)));
        }

        System.out.println("\nOriginal Library:");
        library.display();

        Library shallowLibrary = library.shallowClone();
        Library deepLibrary = library.deepClone();

        System.out.print("\nEnter index of book to modify (0-based): ");
        int changeIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new title: ");
        String changeTitle = scanner.nextLine();
        System.out.print("Enter new author: ");
        String changeAuthor = scanner.nextLine();

        library.getBooks().get(changeIndex).title = changeTitle;
        library.getBooks().get(changeIndex).author = changeAuthor;

        System.out.println("\nAfter Modification:");

        System.out.println("\nOriginal Library:");
        library.display();

        System.out.println("\nShallow Clone:");
        shallowLibrary.display();

        System.out.println("\nDeep Clone:");
        deepLibrary.display();

        scanner.close();
    }

}

// System.out.println("Library : " + name);
// System.out.println("Book : " + book.title + ", Author : " + book.author);
