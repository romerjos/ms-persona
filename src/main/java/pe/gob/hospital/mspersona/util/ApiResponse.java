package pe.gob.hospital.mspersona.util;

import lombok.Builder;

@Builder
public record ApiResponse<T>(
        Metadata metadata,
        T data
) {}
