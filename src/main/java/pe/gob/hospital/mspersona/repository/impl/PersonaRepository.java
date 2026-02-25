package pe.gob.hospital.mspersona.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.gob.hospital.mspersona.models.*;
import pe.gob.hospital.mspersona.repository.IPersonaRepository;
import pe.gob.hospital.mspersona.repository.mapper.PersonaMapperAsis;


@Repository
@RequiredArgsConstructor
//@RefreshScope
@Slf4j
public class PersonaRepository implements IPersonaRepository {

    @Autowired
    private PersonaMapperAsis personaMapperAsis;

    @Override
    public Personal obtenerPorNumeroDocumento(String nroDocumento) {
        return personaMapperAsis.obtenerPorNumeroDocumento(nroDocumento);
    }

}
