package pe.gob.hospital.mspersona.mapper;

import org.mapstruct.*;
import pe.gob.hospital.mspersona.model.*;
import pe.gob.hospital.mspersona.models.Personal;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonalConverterMapper {

    @Mappings({
            @Mapping(source = "tipoDocumento", target = "tipoDocumento"),
            @Mapping(source = "numDocumento", target = "numDocumento"),
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "apellidoPaterno", target = "apePaterno"),
            @Mapping(source = "apellidoMaterno", target = "apeMaterno"),
            @Mapping(source = "fechaNacimiento", target = "fechaNac"),
            @Mapping(source = "sexo", target = "sexo"),
            @Mapping(source = "estado", target = "estado")
    })
    Paciente toPaciente(Personal data);

    default OffsetDateTime map(LocalDate date) {
        if (date == null) return null;
        return date.atStartOfDay().atOffset(ZoneOffset.UTC);
    }

    @Named("obtenerCampo")
    default String obtenerCampo(String campo) {
        return campo != null ? campo.trim() : "";
    }

}
