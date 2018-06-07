package pl.toto.worldcup.lombok;

public class Address {

    private String street;
    private String number;
    private String zipcode;

    public Address(String street, String number, String zipcode) {
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


}
