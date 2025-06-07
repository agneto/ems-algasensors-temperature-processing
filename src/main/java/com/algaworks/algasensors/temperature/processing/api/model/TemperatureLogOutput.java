package com.algaworks.algasensors.temperature.processing.api.model;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class TemperatureLogOutput implements Serializable {
    private static final long serialVersionUID = 1L;
    private UUID id;
    private TSID sensorId;
    private OffsetDateTime registeredAt;
    private Double value;
}