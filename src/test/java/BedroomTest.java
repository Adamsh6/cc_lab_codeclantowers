import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, 2, "single");
        guest1 = new Guest("Reginald");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void canGetType(){
        assertEquals("single", bedroom1.getType());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getGuestCount());
    }
}
