package pl.toto.worldcup.lombok.adderess;

public final class AddressBuilder {
    private String street;
    private String number;
    private String zipcode;

    private AddressBuilder() {
    }

    public static AddressBuilder anAddress() {
        return new AddressBuilder();
    }

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder number(String number) {
        this.number = number;
        return this;
    }

    public AddressBuilder zipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public Address build() {
        Address address = new Address();
        address.setStreet(street);
        address.setNumber(number);
        address.setZipcode(zipcode);
        return address;
    }
}
