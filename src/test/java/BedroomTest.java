import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, 2, "single", 50.50);
        guest1 = new Guest("Reginald", 30.20);
        guest2 = new Guest("Ophelia", 60.50);
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
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
    public void canAddGuests(){
        bedroom1.addGuests(guests);
        assertEquals(2, bedroom1.getGuestCount());
    }

    @Test
    public void cannotAddGuestsIfMoreThanCapacity(){
        Bedroom bedroom2 = new Bedroom(4, 1, "single", 30.45);
        bedroom2.addGuests(guests);
        assertEquals(0, bedroom2.getGuestCount());
    }

    @Test
    public void canRemoveGuests(){
        bedroom1.removeGuests();
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(50.50, bedroom1.getNightlyRate(), 0);
    }
}
