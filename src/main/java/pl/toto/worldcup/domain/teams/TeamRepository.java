package pl.toto.worldcup.domain.teams;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class TeamRepository {

    List<TeamModel> findAll() {
        return ImmutableList.of(
            TeamModel.builder()
                    .name("Poland")
                    .build()
        );
    }
}
