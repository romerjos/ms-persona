package pe.gob.hospital.mspersona.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionGeneric extends RuntimeException {
    private Integer codigoError;
            String message;

    public ExceptionGeneric() {
        super();
    }

    public ExceptionGeneric(String message) {
        super(message);
    }

    public ExceptionGeneric(String message, Integer codigoError) {
        super(message);
        this.codigoError = codigoError;
    }

}
