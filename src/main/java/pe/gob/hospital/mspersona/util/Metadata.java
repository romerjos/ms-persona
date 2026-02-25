package pe.gob.hospital.mspersona.util;

import lombok.Builder;

@Builder
public record Metadata(
        int status,
        String message
) {}
