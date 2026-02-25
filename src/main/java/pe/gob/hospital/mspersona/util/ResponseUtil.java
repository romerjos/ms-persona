package pe.gob.hospital.mspersona.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public final class ResponseUtil {

    private ResponseUtil() {}

    public static <T> ResponseEntity<ApiResponse<T>> ok(T data) {
        return ResponseEntity.ok(
                ApiResponse.<T>builder()
                        .metadata(
                                Metadata.builder()
                                        .status(HttpStatus.OK.value())
                                        .message("El proceso fue exitoso.")
                                        .build()
                        )
                        .data(data)
                        .build()
        );
    }

    public static ResponseEntity<ApiResponse<Void>> ok() {
        return ResponseEntity.ok(
                ApiResponse.<Void>builder()
                        .metadata(
                                Metadata.builder()
                                        .status(HttpStatus.OK.value())
                                        .message("El proceso fue exitoso.")
                                        .build()
                        )
                        .data(null)
                        .build()
        );
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(HttpStatus status, String message) {
        return ResponseEntity.status(status)
                .body(
                        ApiResponse.<T>builder()
                                .metadata(
                                        Metadata.builder()
                                                .status(status.value())
                                                .message(message)
                                                .build()
                                )
                                .data(null)
                                .build()
                );
    }
}
