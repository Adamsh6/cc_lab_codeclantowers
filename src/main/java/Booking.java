public class Booking {
    private Bedroom room;
    private int nights;

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


    public double getTotalBill() {
        return this.nights * this.room.getNightlyRate();
    }
}
