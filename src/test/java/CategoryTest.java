package test.java;

import main.java.Category;
import org.junit.Test;

public class CategoryTest {
    @Test
    public void toStr() {
        if (Category.BUSINESS.toString().equals("Business")) {
            System.out.println(Category.BUSINESS.toString());
        }
        System.out.println("try something else");
    }
}
