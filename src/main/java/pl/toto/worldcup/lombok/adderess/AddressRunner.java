package pl.toto.worldcup.lombok.adderess;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddressRunner {

    public static void main(String[] args) {
        Address firstAddress = new Address();
        firstAddress.setNumber("1");
        firstAddress.setStreet("Random street");
        Address otherAddress = AddressBuilder.anAddress().build();

        log.info(firstAddress.toString());

    }
}
