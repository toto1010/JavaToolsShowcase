package pl.toto.worldcup.domain.teams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamModel {

    private Long id;
    private String name;
    private String coachName;
}
