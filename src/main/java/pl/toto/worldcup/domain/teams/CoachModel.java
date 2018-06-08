package pl.toto.worldcup.domain.teams;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
/*@Entity
@Table(name = "coaches")*/
public class CoachModel {

    private Long id;
    private String firstName;
    private String lastName;

}
