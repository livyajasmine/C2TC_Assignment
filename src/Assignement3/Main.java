package Assignement3;

public class Main {
    public static void main(String[] args) {
        // Part A: Inheritance demonstration
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        book1.displayInfo();   // Book is-a Item
        mag1.displayInfo();    // Magazine is-a Item

        // Part B: Composition demonstration
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);

        library.showAllItems();
    }
}
