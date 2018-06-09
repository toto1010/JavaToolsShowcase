package pl.toto.worldcup.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import pl.toto.worldcup.domain.teams.TeamDto;
import pl.toto.worldcup.domain.teams.TeamModel;

@Component
public class OrikaBeanMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        super.configure(factory);
        factory.classMap(TeamModel.class, TeamDto.class)
                .customize(new TeamCustomCoachMapper())
                .byDefault()
                .register();

        factory.getConverterFactory().registerConverter(new LocalDateTimeToStringConverter());
    }
}
