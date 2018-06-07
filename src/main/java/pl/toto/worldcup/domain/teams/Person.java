package pl.toto.worldcup.domain.teams;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    private Long id;
    private String firstName;
    private String lastName;

}
