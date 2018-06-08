package pl.toto.worldcup.config;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import pl.toto.worldcup.domain.teams.TeamDto;
import pl.toto.worldcup.domain.teams.TeamModel;

public class TeamCustomCoachMapper extends CustomMapper<TeamModel, TeamDto> {

/*    @Override
    public void mapAtoB(TeamModel teamModel, TeamDto teamDto, MappingContext context) {
        teamModel.setCoachName(teamModel.getCoach().getFirstName() + " " + teamModel.getCoach().getLastName());
    }*/
}
