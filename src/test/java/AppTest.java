package test.java;

import main.java.App;
import main.java.Category;
import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void getSerialNumber() throws Exception {
        System.out.println(app.getSerialNumber());
    }

    @Test
    public void getName() throws Exception {
        System.out.println(app.getName());
    }

    @Test
    public void setName() throws Exception {
        app.setName("Set name test");
        System.out.println(app.getName());
    }

    @Test
    public void getDescription() throws Exception {
        System.out.println(app.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        app.setDescription("set descrition test");
        System.out.println(app.getDescription());
    }

    @Test
    public void getPrice() throws Exception {
        System.out.println(app.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        app.setPrice(12.34);
        System.out.println(app.getPrice());
    }

    @Test
    public void getSize() throws Exception {
        System.out.println(app.getSize());
    }

    @Test
    public void setSize() throws Exception {
        app.setSize(99.9);
        System.out.println(app.getSize());
    }

    @Test
    public void getCategory() throws Exception {
        System.out.println(app.getCategoryStr());
    }

    @Test
    public void getCategoryStr() throws Exception {
        System.out.println(app.getCategoryStr());
    }

    @Test
    public void setCategory() throws Exception {
        app.setCategory(Category.OTHER);
        System.out.println(app.getCategoryStr());
    }

}
