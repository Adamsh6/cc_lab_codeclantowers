import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void setUp(){
        guest1 = new Guest("Reginald");
    }

    @Test
    public void canGetName(){
        assertEquals("Reginald", guest1.getName());
    }
}
