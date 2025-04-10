package practice.book_store;

import java.util.*;

public class BookStore {
    private ArrayList<Book> books = new ArrayList<Book>();
    private HashMap<Book, List<Customer>> subscribers = new HashMap<Book, List<Customer>>();

    public void addBook(String title, String author, double price, int quantity) {
        Book book = new Book(title, author, price, quantity);
        for(Book booksample : books){
            if(booksample.getTitle().equals(title) && booksample.getAuthor().equals(author)){
                System.out.println("Book already exists..");
                return;
            }
        }
        this.books.add(book);
    }

    public void subscribe(Book book, Customer customer) {
        List<Customer> list = this.subscribers.get(book);
        if (list == null) {
            list = new ArrayList<Customer>();
            this.subscribers.put(book, list);
        }
        list.add(customer);
    }

    public void unsubscribe(Book book, Customer customer) {
        List<Customer> list = this.subscribers.get(book);
        if (list == null) {
            System.out.println("Cannot unsubscribe. Subscription does not exist!");
            return;
        }
        list.remove(customer);
    }

    public void notify(Book book) {
        List<Customer> list = this.subscribers.get(book);
        for (Customer c : list)
            c.update(book);
    }

    public Book searchBook(String bookTitle) {
        for (Book book : this.books)
            if (book.getTitle().equalsIgnoreCase(bookTitle))
                return book;
        System.out.println("Book with title " + bookTitle + " does not exist!");
        return null;
    }

    public void buyBook(Book book, DiscountStrategy discount) {
        if (book.getQuantity() == 0) {
            System.out.println("Book is not available!");
            return;
        }
        book.setQuantity(book.getQuantity() - 1);
        double total = book.getPrice();
        if (discount != null)
            total = discount.applyDiscount(book.getPrice());
        System.out.println("You should pay " + total);
    }
}
