public class Booking {
    Bedroom room;
    int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.room = bedroom;
        this.nights = nights;
    }

    public Bedroom getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }
}
