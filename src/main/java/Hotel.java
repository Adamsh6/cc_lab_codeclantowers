import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.bookings = new ArrayList<Booking>();
    }

    public void checkIn(ArrayList<Guest> guests, Bedroom wantedBedroom) {
        for(Bedroom bedroom : bedrooms){
            if (bedroom == wantedBedroom && bedroom.getGuestCount() == 0){
                bedroom.addGuests(guests);
            }
        }
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        this.bookings.add(booking);
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

    public void bookAndCheckIn(ArrayList<Guest> guests, Bedroom bedroom, int nights) {
        double totalCash = 0;
        for(Guest guest: guests){
            totalCash = guest.getCash();
            System.out.println(totalCash);
        }
        if(totalCash >= bedroom.getNightlyRate() * nights) {
            checkIn(guests, bedroom);
            Booking booking = bookRoom(bedroom, nights);
            guests.get(0).reduceCash(booking.getTotalBill());
        }
    }
}
