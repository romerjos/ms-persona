package pe.gob.hospital.mspersona.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exception504 extends RuntimeException {
    private String codigoError;

    public Exception504() {
        super();
    }

    public Exception504(String mensaje) {
        super(mensaje);
    }

    public Exception504(String mensaje, String codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }
}
