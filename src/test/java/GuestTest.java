import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void setUp(){
        guest1 = new Guest("Reginald", 25.30);
    }

    @Test
    public void canGetName(){
        assertEquals("Reginald", guest1.getName());
    }

    @Test
    public void canGetCash(){
        assertEquals(25.30, guest1.getCash(), 0);
    }

    @Test
    public void canReduceCash(){
        guest1.reduceCash(10);
        assertEquals(15.30, guest1.getCash(), 0);
    }

    @Test
    public void givesRemainderToPayIfCashReducedToZero(){
        double remainder = guest1.reduceCash(26.30);
        assertEquals(1, remainder, 0);
        assertEquals(0, guest1.getCash(), 0);
    }
}
