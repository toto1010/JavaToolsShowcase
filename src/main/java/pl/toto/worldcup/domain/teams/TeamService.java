package pl.toto.worldcup.domain.teams;

import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class TeamService {

    private final MapperFacade mapperFacade;
    private final TeamRepository teamRepository;

    List<TeamModel> getTeams() {
        return mapperFacade.mapAsList(teamRepository.findAll(), TeamModel.class);
    }
}
