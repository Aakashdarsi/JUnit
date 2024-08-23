import org.junit.jupiter.api.Test;
import sg.nus.StringHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {

    @Test
    public void help(){
        StringHelper stringHelper = new StringHelper();


        // AACD -> CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

       assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
       assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
       assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
       assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));

    }



}
