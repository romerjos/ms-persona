package pe.gob.hospital.mspersona.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data

public class Paciente extends pe.gob.hospital.mspersona.model.Paciente {

    private String CODTIPOD;
    private String DETALLED;
    private String CODPACIE;
    private String FECHINSC;
    private String FECHANAC;
    private int ANIO;
    private int MES;
    private int DIA;
    private String LUGANACI;
    private String TG1SEXOP;
    private String NUMEIEDS;
    private String NUMEROHC;
    private String CODPERSO;
    private String APEPATER;
    private String APEMATER;
    private String PRINOMBR;
    private String SEGNOMBR;
    private String TGCONALTAM;
    private String SWPACIEN;
    private String SWEMPLEA;
    private String SWFALLEC;
    private String SWFAMEMP;
    private String TG03ESPE;
    private String FOTODETA;
    private String TGSITUPA;
    private String SWNUEVO;
    private String TG1ESCIV;
    private String SWCESANT;
    private String NOMUSUAR;
    private String SWNACID;
    private String NOMSEXOP;
    private String Expr1;
    private String TELFCELU;
    private String TELFFIJO;
    private String CODUBIGE;
    private String DETALLE;
    private String CODREGIS;

    private String HC;
    private String HC_ANEXADO;
    private String NOMBRECO;
    private String LUGARNAC;
    private String DOMICI;
    private String SEXO;
    private String REFEREN;
    private String NUMEROSEG;
    private String DOC;
    private String USUA;
    private String EDAD;

    private String NOMCORTO;
    private String CODVERIFI;
}
