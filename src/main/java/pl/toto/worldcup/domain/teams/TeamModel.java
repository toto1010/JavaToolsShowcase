package pl.toto.worldcup.domain.teams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team1")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String coachName;
/*
    @ManyToOne
    @JoinColumn(name = "coach_id")
    private CoachModel coach;*/
}
