package pe.gob.hospital.mspersona.repository.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import pe.gob.hospital.mspersona.models.*;

@Mapper
@Component
public interface PersonaMapperAsis {

    @Select(value = "{ CALL [gene].[usp_persona_get_by_dni] " +
            "(" +
            "#{nroDocu, javaType=String, mode=IN, jdbcType=VARCHAR}" +
            ") " +
            "} ")
    @Options(statementType = StatementType.CALLABLE)
    Personal obtenerPorNumeroDocumento(String nroDocu);

}
