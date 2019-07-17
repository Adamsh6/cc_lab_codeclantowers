import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkIn(ArrayList<Guest> guests, Bedroom wantedBedroom) {
        for(Bedroom bedroom : bedrooms){
            if (bedroom == wantedBedroom){
                bedroom.addGuests(guests);
            }
        }
    }
}
