public class Money {
    private long dollars;
    private long cents;

    // constructor makes a new Money object
    public Money(double amount) {
        dollars = (long) amount; // Get the whole dollar part
        cents = Math.round((amount - dollars) * 100); // Get the cents part
    }

    // copy constructor
    public Money(Money other) {
        dollars = other.dollars;
        cents = other.cents;
    }

    // method adds this money to another money and gives back the result
    public Money add(Money otherAmount) {

        double total = this.toDouble() + otherAmount.toDouble();
        return new Money(total);
    }

    // method subtracts another money from this one and gives back the result
    public Money subtract(Money otherAmount) {
        double result = this.toDouble() - otherAmount.toDouble();
        return new Money(result);
    }

    // method checks which amount is bigger

    public int compareTo(Money otherAmount) {
        if (this.toDouble() < otherAmount.toDouble()) {
            return -1;
        } else if (this.toDouble() > otherAmount.toDouble()) {
            return 1;
        } else {
            return 0;
        }
    }

    // checks if two money objects are exactly the same (dollars and cents)
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Money)) {
            return false;
        }

        Money other = (Money) otherObject;
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // formats  the money
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // turns the money into a decimal number
    private double toDouble() {
        return dollars + (cents / 100.0);
    }
}
