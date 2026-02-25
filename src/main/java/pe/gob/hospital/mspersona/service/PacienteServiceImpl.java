package pe.gob.hospital.mspersona.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.hospital.mspersona.PacientesApiDelegate;
import pe.gob.hospital.mspersona.mapper.PersonalConverterMapper;
import pe.gob.hospital.mspersona.model.*;
import pe.gob.hospital.mspersona.model.Paciente;
import pe.gob.hospital.mspersona.models.*;
import pe.gob.hospital.mspersona.repository.impl.PersonaRepository;
import pe.gob.hospital.mspersona.util.ValidadorUtil;


@Service
@Slf4j
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacientesApiDelegate {

    private final PersonaRepository personaRepository;

    private final PersonalConverterMapper personalConverterMapper;

    @Override
    @Transactional
    public ResponseEntity<ObtenerPacienteResponse> obtenerPacientePorDocumento(String nroDocumento) {
        Personal personal = personaRepository.obtenerPorNumeroDocumento(nroDocumento);
        ValidadorUtil.existContent(personal);

        Paciente paciente = personalConverterMapper.toPaciente(personal);


        ObtenerPacienteResponse response = new ObtenerPacienteResponse();
        response.setData(paciente);
        response.setMetadata(new Metadata().status(200).message("El proceso fue exitoso."));

        return ResponseEntity.ok(response);
    }

}
