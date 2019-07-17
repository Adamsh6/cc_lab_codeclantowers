import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, 2, "double");
        booking = new Booking(bedroom1, 3);
    }

    @Test
    public void canGetRoom(){
        assertEquals(bedroom1, booking.getRoom());
    }

    @Test
    public void canGetNights(){
        assertEquals(3, booking.getNights());
    }
}
