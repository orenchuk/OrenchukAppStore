package test.java;

import main.java.Observer.Customer;
import main.java.Observer.Observable;
import main.java.Observer.Observer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObservableTest {

    private Observable observable = new Observable();
    private Observer obs = new Customer();

    @Test
    public void addObserver() throws Exception {
        assertNull("Observer is null" , obs);
        if (observable.addObserver(obs)) {
            System.out.println("method addObserver works good");
        } else {
            System.out.println("Something went wrong");
        }
    }

    @Test
    public void removeObserver() throws Exception {
        assertNull("Observer is null" , obs);
    }

    @Test
    public void notifyObservers() throws Exception {
        assertNull("Observer is null" , obs);
    }

}