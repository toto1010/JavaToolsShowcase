package pl.toto.worldcup.config;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LocalDateTimeToStringConverter extends CustomConverter<LocalDateTime, String> {

    private static final String DATE_PATTERN = "YYYY-MM-dd HH:mm";

    @Override
    public String convert(LocalDateTime localDateTime, Type<? extends String> type, MappingContext mappingContext) {
        return Optional.ofNullable(localDateTime)
                .map(localDateTime1 -> localDateTime.format(DateTimeFormatter.ofPattern(DATE_PATTERN)))
                .orElse(null);
    }
}
