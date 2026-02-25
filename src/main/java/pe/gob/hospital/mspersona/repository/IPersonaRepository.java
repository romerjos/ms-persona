package pe.gob.hospital.mspersona.repository;

import org.springframework.stereotype.Repository;
import pe.gob.hospital.mspersona.models.*;

@Repository
public interface IPersonaRepository {

    Personal obtenerPorNumeroDocumento(String nroDocumento);
}
