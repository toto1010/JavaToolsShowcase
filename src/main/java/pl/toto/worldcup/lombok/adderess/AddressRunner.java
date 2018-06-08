package pl.toto.worldcup.lombok.adderess;

public class AddressRunner {

    public static void main(String[] args) {
        Address firstAddress = new Address();
        firstAddress.setNumber("1");
        firstAddress.setStreet("Random street");
        Address otherAddress = AddressBuilder.anAddress().build();

        System.out.println(firstAddress.toString());

    }
}
