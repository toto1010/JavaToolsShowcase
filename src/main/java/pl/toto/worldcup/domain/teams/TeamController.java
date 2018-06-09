package pl.toto.worldcup.domain.teams;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Api("Operations for teams")
class TeamController {

    private final TeamService teamService;

    @ApiOperation("Find all teams")
    @GetMapping
    List<TeamDto> teams() {
        return teamService.getTeams();
    }
}
