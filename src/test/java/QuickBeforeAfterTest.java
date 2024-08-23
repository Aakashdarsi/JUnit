import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sg.nus.StringHelper;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class QuickBeforeAfterTest {



    StringHelper stringHelper;
    @BeforeAll
    public  static  void beforeAll(){
        System.out.println("beforeAll");
    }
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

    @Test
    public void testArrayEquality(){
        int[] arr1 = {1,3,2,4,5};
        int[] exxpected = {1,2,3,4,5};
        Arrays.sort(arr1);
        assertArrayEquals(exxpected, arr1);
    }
    @Test()
    public void testSort_Performance(){
        int arr[]  = {12,23,4};

        assertTimeout(Duration.ofSeconds(0),()->{
            for(int i = 0; i < 1000000; i++){
                arr[0] = i;
                Arrays.sort(arr);
            }
        });

    }
}
