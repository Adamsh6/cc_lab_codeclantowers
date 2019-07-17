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
            if (bedroom == wantedBedroom && bedroom.getGuestCount() == 0){
                bedroom.addGuests(guests);
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public ArrayList<Bedroom> getEmptyBedrooms() {
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        for(Bedroom bedroom : bedrooms){
            if(bedroom.getGuestCount() == 0){
                emptyRooms.add(bedroom);
            }
        }
        return emptyRooms;
    }
}
