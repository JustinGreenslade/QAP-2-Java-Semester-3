public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor - needs a Person and a Money limit
    public CreditCard(Person cardHolder, Money limit) {
        // Use copy constructors to keep our data safe
        this.owner = cardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0); // Start with $0 balance
    }

    // Get a copy of the balance so people can’t change it
    public Money getBalance() {
        return new Money(balance);
    }

    // Get a copy of the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get info about the card owner
    public String getPersonals() {
        return owner.toString();
    }

    // Charge money to the card if it doesn't go over the limit
    public void charge(Money amount) {
        Money temp = balance.add(amount);
        if (temp.compareTo(creditLimit) <= 0) {
            balance = temp;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make a payment (subtract money from balance)
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
