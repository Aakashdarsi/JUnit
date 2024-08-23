import org.junit.jupiter.api.Test;
import sg.nus.StringHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {

    @Test
    public void testTrunecatedAInFirst2Positions_AInFirst2Positions(){
        StringHelper stringHelper = new StringHelper();


        // AACD -> CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

       assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));

    }

    @Test
    public void testTrunecatedFirst2Positions_AInFirstPosition(){
        StringHelper stringHelper = new StringHelper();
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public  void testTruncatedInFirts2Positions_NoASInString(){
        StringHelper stringHelper = new StringHelper();
        assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncatedInFirst2Positions_AAtLast(){
        StringHelper stringHelper = new StringHelper();
        assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
    }

}
