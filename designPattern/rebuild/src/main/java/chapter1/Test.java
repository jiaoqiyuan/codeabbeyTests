package chapter1;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Movie1", 2);
        Movie movie2 = new Movie("Movie2", 1);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 2);

        Vector rentals = new Vector();
        rentals.add(rental1);
        rentals.add(rental2);
        Customer customer1 = new Customer("Jim", rentals);

        System.out.println(customer1.statement());
    }
}
