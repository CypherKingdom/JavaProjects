package practice.book_store;

public class Demo {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.addBook("Persepolis", "M.S.", 20, 5);
        bookStore.addBook("Percy Jackson", "R.G.", 12, 5);

        Customer customer = new Customer("Maria Sfeir", "maria@gmail.com", "098765");
        
        Book book = bookStore.searchBook("Persepolis");
        bookStore.buyBook(book, new PercentageDiscount(0.2));
        bookStore.buyBook(book, new PercentageDiscount(0.2));
        bookStore.buyBook(book, new PercentageDiscount(0.2));
        bookStore.buyBook(book, new FixedDiscount(6));
        bookStore.buyBook(book, null);
        bookStore.buyBook(book, new PercentageDiscount(0.2));
        bookStore.subscribe(book, customer);
        bookStore.notify(book);
    }
}
