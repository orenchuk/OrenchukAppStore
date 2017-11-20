package test.java;

import main.java.App;
import main.java.AppStore;
import main.java.Category;
import org.junit.Test;

public class AppStoreTest {

    App app = new App();
    AppStore store = new AppStore();

    @Test
    public void addApp() throws Exception {
        store.addApp(app);
        System.out.println(store.apps.toString());
    }

    @Test
    public void addApp1() throws Exception {
        store.addApp(app);
        System.out.println(store.apps.toString());
    }

    @Test
    public void getApp() throws Exception {
        System.out.println(store.getApp("N578394774me"));
    }

    @Test
    public void search() throws Exception {
        store.search("No name", 0.0, "", Category.OTHER);
        System.out.println("No name" + Category.OTHER.toString());
    }

}
