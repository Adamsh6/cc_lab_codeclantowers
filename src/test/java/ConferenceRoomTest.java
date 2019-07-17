import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;

    @Before
    public void setUp(){
        conferenceRoom1 = new ConferenceRoom("Watt Room", 15);
    }

    @Test
    public void canGetName(){
        assertEquals("Watt Room", conferenceRoom1.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(15, conferenceRoom1.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom1.getGuestCount());
    }
}
