package com.algaworks.algasensors.temperature.processing;

import com.algaworks.algasensors.temperature.processing.common.IdGenerator;
import com.algaworks.algasensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7() {
        final UUID uuid = IdGenerator.generateTimeBasedUUID();

        final OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        final OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);
    }

}
