import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sg.nus.StringHelper;

public class QuickBeforeAfterTest {

    StringHelper stringHelper;
    @BeforeEach
    public void setup(){
    System.out.println("Before All");
    stringHelper = new StringHelper();
    }
    @AfterEach
    public void tearDown(){
        System.out.println("After All");
    }
    @Test
    public void test(){
        System.out.println("test");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
}
