import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    ArrayList<Guest> guests;
    Booking booking1;


    @Before
    public void setUp(){
        conferenceRoom1 = new ConferenceRoom("Watt Room", 15);
        conferenceRoom2 = new ConferenceRoom("Watt Room", 15);
        bedroom1 = new Bedroom(1, 4, "double", 50);
        bedroom2 = new Bedroom(2, 1, "single", 50.40);
        bedroom3 = new Bedroom(3, 2, "single", 50);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        hotel = new Hotel(bedrooms, conferenceRooms);
        guest1 = new Guest("Reginald", 300);
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        booking1 = new Booking(bedroom2, 3);
    }

    @Test
    public void canCheckInGuestsToBedroom(){
        hotel.checkIn(guests, bedroom1);
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void cannotCheckGuestIntoOccupiedBedroom(){
        hotel.checkIn(guests, bedroom1);
        Guest guest2 = new Guest("Ophelia", 80.90);
        Guest guest3 = new Guest("Patrick", 400.60);
        ArrayList<Guest> newGuests = new ArrayList<Guest>();
        newGuests.add(guest2);
        newGuests.add(guest3);
        hotel.checkIn(newGuests, bedroom1);
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom2, 3);
        assertEquals(bedroom2, booking.getRoom());
        assertEquals(3, booking.getNights());
        assertEquals(booking, hotel.getBookings().get(0));
    }

    @Test
    public void canGetOnlyEmptyRooms(){
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        hotel.checkIn(guests, bedroom1);
        emptyRooms.add(bedroom2);
        emptyRooms.add(bedroom3);
        assertEquals(emptyRooms, hotel.getEmptyBedrooms());
    }

    @Test
    public void canHandleBookingProcess(){
        hotel.bookAndCheckIn(guests, bedroom1, 3);
        Booking booking = hotel.getBookings().get(0);
        assertEquals(1, bedroom1.getGuestCount());
        assertEquals(bedroom1, booking.getRoom());
        assertEquals(3, booking.getNights());
        assertEquals(150, guest1.getCash(), 0);
    }

    @Test
    public void notBookIfGuestDoesNotHaveEnoughCash(){
        hotel.bookAndCheckIn(guests, bedroom1, 8);
        assertEquals(0, bedroom1.getGuestCount());
        assertEquals(0, hotel.getBookings().size());
        assertEquals(300, guest1.getCash(), 0);
    }
}
