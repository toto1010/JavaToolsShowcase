package pl.toto.worldcup.config;

import pl.toto.worldcup.domain.teams.TeamDto;
import pl.toto.worldcup.domain.teams.TeamModel;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

public class TeamCustomCoachMapper extends CustomMapper<TeamModel, TeamDto> {

    @Override
    public void mapAtoB(TeamModel teamModel, TeamDto teamDto, MappingContext context) {
        teamDto.setCoachName("mr. "  + teamModel.getCoach().getFirstName() + " " + teamModel.getCoach().getLastName());
    }
}
