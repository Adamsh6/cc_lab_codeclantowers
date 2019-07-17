import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, 2, "double", 50.10);
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

    @Test
    public void canGetTotalBill(){
        assertEquals(150.30, booking.getTotalBill(), 0);
    }
}
