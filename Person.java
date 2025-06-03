public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor to make a new person
    public Person(String first, String last, Address homeAddress) {
        this.firstName = first;
        this.lastName = last;
        this.home = homeAddress;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for home address
    public Address getHome() {
        return home;
    }

    // Setter for home address
    public void setHome(Address home) {
        this.home = home;
    }

    // Returns the person’s full name and address
    public String toString() {
        return lastName + " " + firstName + ", " + home.toString();
    }
}
