import org.junit.Before;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;


    @Before
    public void setUp(){
        conferenceRoom1 = new ConferenceRoom("Watt Room", 15);
        conferenceRoom2 = new ConferenceRoom("Watt Room", 15);
        bedroom1 = new Bedroom(1, 4, "double");
        bedroom2 = new Bedroom(2, 1, "single");
        bedroom3 = new Bedroom(3, 2, "single");
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }
}
