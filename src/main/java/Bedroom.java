import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private double nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }


    public int getGuestCount() {
        return this.guests.size();
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void addGuests(ArrayList<Guest> guests) {
        this.guests.addAll(guests);
    }

    public void removeGuests() {
        this.guests.clear();
    }
}
