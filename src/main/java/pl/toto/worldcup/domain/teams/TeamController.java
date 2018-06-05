package pl.toto.worldcup.domain.teams;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
class TeamController {

    private final TeamService teamService;

    @GetMapping
    List<TeamDto> teams() {
        return teamService.getTeams();
    }
}
