import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    Guest guest1;

    @Before
    public void setUp(){
        conferenceRoom1 = new ConferenceRoom("Watt Room", 15);
        guest1 = new Guest("Reginald", 90.40);
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

    @Test
    public void canAddGuest(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getGuestCount());
    }

    @Test
    public void cannotAddGuestIfAtCapacity(){
        ConferenceRoom conferenceRoom2 = new ConferenceRoom("Turing", 1);
        conferenceRoom2.addGuest(guest1);
        conferenceRoom2.addGuest(guest1);
        assertEquals(1, conferenceRoom2.getGuestCount());
    }
}
