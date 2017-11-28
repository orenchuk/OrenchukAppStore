package test.java;

import main.java.Observer.Customer;
import main.java.Observer.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user = new Customer();

    @Test
    public void update() throws Exception {
        assertNull("User is null" , user);
        if (user.update()) {
            System.out.println("update method works");
        } else {
            System.out.println("Method update works bad");
        }
    }

    @Test
    public void getCart() throws Exception {
        assertNull("User is null" , user.getCart());
    }

}