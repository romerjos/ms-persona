package pe.gob.hospital.mspersona.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Direccion implements Serializable {

    private String CODDIXPE;
    private String DIRCORTA;
    private String DESCRIPC;
	private String TG01TIPO;
    private String TGCODREG;
    private String TG01TIPU;
	private String TGUBIGEO;
	private String TG02SITU;
    private String REFERENC;
    private String VARENIEC;

    private String CODUBIGE;
    private String CODRDPTO;
    private String CODRPROV;
    private String CODRDIST;
    private String DETALLE;

}
