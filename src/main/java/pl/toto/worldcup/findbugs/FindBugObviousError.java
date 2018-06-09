package pl.toto.worldcup.findbugs;

import pl.toto.worldcup.lombok.Address;

public class FindBugObviousError {

    public void repalcePwithBAndDoSomeAction() {
        String aString = "bob";
        aString.replace('b', 'p');
        if (aString.equals("pop")) {

        }
    }

    public void nullPointerProblem(Address address) {
        if (address != null) {
            address.setNumber("1");
         }
        String streetName = address.getStreet();
    }
}
