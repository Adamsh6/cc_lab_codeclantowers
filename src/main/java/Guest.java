public class Guest {
    private String name;
    private double cash;

    public Guest(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public double reduceCash(double amount) {
        if(this.cash >= amount) {
            this.cash -= amount;
            return 0;
        } else {
            amount -= this.cash;
            this.cash = 0;
            return amount;
        }
    }


}
