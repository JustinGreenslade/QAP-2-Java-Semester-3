public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor to create a new address
    public Address(String st, String c, String s, String z) {
        this.street = st;
        this.city = c;
        this.state = s;
        this.zip = z;
    }

    // Returns the address as a single string
    public String toString() {
        return street + ", " + city + ", " + state + "\n" + zip;
    }
}


