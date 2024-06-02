//Farhan
public class Address {
    private String houseNumber;
    private String streetName;
    private String postcode;
    private String state;

    public Address(String houseNumber, String streetName, String postcode, String state) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.postcode = postcode;
        this.state = state;
    }

    
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
